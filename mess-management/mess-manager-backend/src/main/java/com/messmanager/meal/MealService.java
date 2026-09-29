package com.messmanager.meal;

import com.messmanager.user.User;
import com.messmanager.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private UserRepository userRepository;

    public MealDto addMeal(Long userId, MealDto dto) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Meal meal = Meal.builder()
                .user(user)
                .mealDate(dto.getMealDate() != null ? dto.getMealDate() : LocalDate.now())
                .mealCount(dto.getMealCount())
                .isLunch(dto.getIsLunch())
                .isDinner(dto.getIsDinner())
                .build();
        meal = mealRepository.save(meal);
        return mapToDto(meal);
    }

    public List<MealDto> getMealsByUserAndMonth(Long userId, int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        return mealRepository.findByUserIdAndMealDateBetween(userId, ym.atDay(1), ym.atEndOfMonth())
                .stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public List<MealDto> getAllMealsByMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        return mealRepository.findByMealDateBetween(ym.atDay(1), ym.atEndOfMonth())
                .stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public Integer getTotalMealsByMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        Integer total = mealRepository.getTotalMealsBetween(ym.atDay(1), ym.atEndOfMonth());
        return total != null ? total : 0;
    }

    public Integer getTotalMealsByUserAndMonth(Long userId, int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        Integer total = mealRepository.getTotalMealsByUserBetween(userId, ym.atDay(1), ym.atEndOfMonth());
        return total != null ? total : 0;
    }

    private MealDto mapToDto(Meal m) {
        MealDto dto = new MealDto();
        dto.setId(m.getId());
        dto.setUserId(m.getUser().getId());
        dto.setUserName(m.getUser().getName());
        dto.setMealDate(m.getMealDate());
        dto.setMealCount(m.getMealCount());
        dto.setIsLunch(m.getIsLunch());
        dto.setIsDinner(m.getIsDinner());
        return dto;
    }
}
