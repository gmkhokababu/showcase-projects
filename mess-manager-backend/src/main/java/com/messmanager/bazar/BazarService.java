package com.messmanager.bazar;

import com.messmanager.user.User;
import com.messmanager.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BazarService {

    @Autowired
    private BazarScheduleRepository bazarRepository;

    @Autowired
    private UserRepository userRepository;

    public BazarDto scheduleBazar(Long userId, LocalDate date) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        BazarSchedule bazar = BazarSchedule.builder()
                .user(user)
                .bazarDate(date)
                .status(BazarSchedule.BazarStatus.PENDING)
                .build();
        bazar = bazarRepository.save(bazar);
        return mapToDto(bazar);
    }

    public BazarDto completeBazar(Long bazarId, Double amount, String description) {
        BazarSchedule bazar = bazarRepository.findById(bazarId)
                .orElseThrow(() -> new RuntimeException("Bazar not found"));
        bazar.setStatus(BazarSchedule.BazarStatus.DONE);
        bazar.setAmount(amount);
        bazar.setDescription(description);
        bazar = bazarRepository.save(bazar);
        return mapToDto(bazar);
    }

    public List<BazarDto> getScheduleByMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        return bazarRepository.findByBazarDateBetweenOrderByBazarDateAsc(ym.atDay(1), ym.atEndOfMonth())
                .stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public List<BazarDto> getMySchedule(Long userId, int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        return bazarRepository.findByUserIdAndBazarDateBetween(userId, ym.atDay(1), ym.atEndOfMonth())
                .stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public List<BazarDto> getPendingNotifications() {
        // Bazar scheduled for today or tomorrow that is still pending
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        return bazarRepository.findByStatusAndBazarDateBefore(BazarSchedule.BazarStatus.PENDING, tomorrow.plusDays(1))
                .stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public Double getTotalBazarByMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        return bazarRepository.findByBazarDateBetweenOrderByBazarDateAsc(ym.atDay(1), ym.atEndOfMonth())
                .stream().filter(b -> b.getAmount() != null)
                .mapToDouble(BazarSchedule::getAmount).sum();
    }

    private BazarDto mapToDto(BazarSchedule b) {
        BazarDto dto = new BazarDto();
        dto.setId(b.getId());
        dto.setUserId(b.getUser().getId());
        dto.setUserName(b.getUser().getName());
        dto.setBazarDate(b.getBazarDate());
        dto.setStatus(b.getStatus().name());
        dto.setAmount(b.getAmount());
        dto.setDescription(b.getDescription());
        return dto;
    }
}
