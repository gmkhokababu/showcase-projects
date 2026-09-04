package com.messmanager.report;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class MemberReportDto {
    private Long userId;
    private String userName;
    private String email;
    private String phone;
    private Double totalDeposit;
    private Integer totalMeals;
    private Double mealRate;
    private Double totalCost;
    private Double balance;
    private List<DepositSummary> deposits;
    private List<MealSummary> meals;
    private List<BazarSummary> bazarDuties;
}

@Data
class DepositSummary {
    private Double amount;
    private LocalDate date;
}

@Data
class MealSummary {
    private LocalDate date;
    private Integer count;
}

@Data
class BazarSummary {
    private LocalDate date;
    private String status;
    private Double amount;
}

@Data
public class DashboardDto {
    private Double totalDeposits;
    private Double totalBazarExpenses;
    private Integer totalMeals;
    private Double mealRate;
    private Integer totalMembers;
    private Integer pendingBazarCount;
}
