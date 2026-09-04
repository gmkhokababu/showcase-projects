package com.messmanager.deposit;

import lombok.Data;
import java.time.LocalDate;

@Data
public class DepositDto {
    private Long id;
    private Long userId;
    private String userName;
    private Double amount;
    private LocalDate depositDate;
}
