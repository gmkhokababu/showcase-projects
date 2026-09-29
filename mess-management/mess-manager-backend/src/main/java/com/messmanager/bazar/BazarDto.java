package com.messmanager.bazar;

import lombok.Data;
import java.time.LocalDate;

@Data
public class BazarDto {
    private Long id;
    private Long userId;
    private String userName;
    private LocalDate bazarDate;
    private String status;
    private Double amount;
    private String description;
}
