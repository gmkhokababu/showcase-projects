package com.messmanager.deposit;

import com.messmanager.user.User;
import com.messmanager.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepositService {

    @Autowired
    private DepositRepository depositRepository;

    @Autowired
    private UserRepository userRepository;

    public DepositDto addDeposit(Long userId, Double amount) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Deposit deposit = Deposit.builder().user(user).amount(amount).build();
        deposit = depositRepository.save(deposit);
        return mapToDto(deposit);
    }

    public List<DepositDto> getDepositsByUser(Long userId) {
        return depositRepository.findByUserIdOrderByDepositDateDesc(userId)
                .stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public List<DepositDto> getAllDeposits() {
        return depositRepository.findAll()
                .stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public Double getTotalDepositByUser(Long userId) {
        return depositRepository.findByUserId(userId).stream()
                .mapToDouble(Deposit::getAmount).sum();
    }

    private DepositDto mapToDto(Deposit d) {
        DepositDto dto = new DepositDto();
        dto.setId(d.getId());
        dto.setUserId(d.getUser().getId());
        dto.setUserName(d.getUser().getName());
        dto.setAmount(d.getAmount());
        dto.setDepositDate(d.getDepositDate());
        return dto;
    }
}
