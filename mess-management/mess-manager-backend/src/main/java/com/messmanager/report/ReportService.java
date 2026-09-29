package com.messmanager.report;

import com.messmanager.bazar.BazarSchedule;
import com.messmanager.bazar.BazarScheduleRepository;
import com.messmanager.deposit.DepositRepository;
import com.messmanager.meal.MealRepository;
import com.messmanager.user.User;
import com.messmanager.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DepositRepository depositRepository;
    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private BazarScheduleRepository bazarRepository;

    public MemberReportDto getMemberReport(Long userId, int year, int month) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        YearMonth ym = YearMonth.of(year, month);
        LocalDate start = ym.atDay(1);
        LocalDate end = ym.atEndOfMonth();

        MemberReportDto report = new MemberReportDto();
        report.setUserId(user.getId());
        report.setUserName(user.getName());
        report.setEmail(user.getEmail());
        report.setPhone(user.getPhone());

        // Deposits
        Double totalDeposit = depositRepository.findByUserId(userId).stream()
                .filter(d -> !d.getDepositDate().isBefore(start) && !d.getDepositDate().isAfter(end))
                .mapToDouble(d -> d.getAmount()).sum();
        report.setTotalDeposit(totalDeposit);
        report.setDeposits(depositRepository.findByUserId(userId).stream()
                .filter(d -> !d.getDepositDate().isBefore(start) && !d.getDepositDate().isAfter(end))
                .map(d -> {
                    DepositSummary s = new DepositSummary();
                    s.setAmount(d.getAmount());
                    s.setDate(d.getDepositDate());
                    return s;
                }).collect(Collectors.toList()));

        // Meals
        Integer totalMeals = mealRepository.getTotalMealsByUserBetween(userId, start, end);
        report.setTotalMeals(totalMeals != null ? totalMeals : 0);

        // Bazar
        report.setBazarDuties(bazarRepository.findByUserIdAndBazarDateBetween(userId, start, end).stream()
                .map(b -> {
                    BazarSummary s = new BazarSummary();
                    s.setDate(b.getBazarDate());
                    s.setStatus(b.getStatus().name());
                    s.setAmount(b.getAmount());
                    return s;
                }).collect(Collectors.toList()));

        // Calculate meal rate and balance
        Double totalBazar = bazarRepository.findByBazarDateBetweenOrderByBazarDateAsc(start, end).stream()
                .filter(b -> b.getStatus() == BazarSchedule.BazarStatus.DONE && b.getAmount() != null)
                .mapToDouble(BazarSchedule::getAmount).sum();
        Integer allMeals = mealRepository.getTotalMealsBetween(start, end);
        allMeals = allMeals != null ? allMeals : 1;
        double mealRate = totalBazar / allMeals;
        double totalCost = mealRate * report.getTotalMeals();
        double balance = totalDeposit - totalCost;

        report.setMealRate(Math.round(mealRate * 100.0) / 100.0);
        report.setTotalCost(Math.round(totalCost * 100.0) / 100.0);
        report.setBalance(Math.round(balance * 100.0) / 100.0);

        return report;
    }

    public DashboardDto getManagerDashboard(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        LocalDate start = ym.atDay(1);
        LocalDate end = ym.atEndOfMonth();

        DashboardDto dash = new DashboardDto();
        dash.setTotalMembers((int) userRepository.count());
        dash.setTotalDeposits(depositRepository.findAll().stream()
                .filter(d -> !d.getDepositDate().isBefore(start) && !d.getDepositDate().isAfter(end))
                .mapToDouble(d -> d.getAmount()).sum());
        dash.setTotalBazarExpenses(bazarRepository.findByBazarDateBetweenOrderByBazarDateAsc(start, end).stream()
                .filter(b -> b.getStatus() == BazarSchedule.BazarStatus.DONE && b.getAmount() != null)
                .mapToDouble(BazarSchedule::getAmount).sum());
        Integer totalMeals = mealRepository.getTotalMealsBetween(start, end);
        dash.setTotalMeals(totalMeals != null ? totalMeals : 0);
        dash.setPendingBazarCount((int) bazarRepository.findByBazarDateBetweenOrderByBazarDateAsc(start, end).stream()
                .filter(b -> b.getStatus() == BazarSchedule.BazarStatus.PENDING).count());

        if (dash.getTotalMeals() > 0) {
            dash.setMealRate(Math.round((dash.getTotalBazarExpenses() / dash.getTotalMeals()) * 100.0) / 100.0);
        } else {
            dash.setMealRate(0.0);
        }
        return dash;
    }

    public List<MemberReportDto> getAllMemberReports(int year, int month) {
        return userRepository.findAll().stream()
                .map(u -> getMemberReport(u.getId(), year, month))
                .collect(Collectors.toList());
    }
}
