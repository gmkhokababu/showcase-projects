package com.messmanager.meal;

import lombok.Data;
import java.time.LocalDate;

@Data
public class MealDto {
    private Long id;
    private Long userId;
    private String userName;
    private LocalDate mealDate;
    private Integer mealCount;
    private Boolean isLunch;
    private Boolean isDinner;
}
