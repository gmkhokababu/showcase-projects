package com.messmanager.bazar;

import com.messmanager.auth.jwt.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/bazar")
@CrossOrigin(origins = "http://localhost:4200")
public class BazarController {

    @Autowired
    private BazarService bazarService;

    @PostMapping("/schedule")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<BazarDto> scheduleBazar(@RequestBody ScheduleRequest req) {
        return ResponseEntity.ok(bazarService.scheduleBazar(req.getUserId(), req.getDate()));
    }

    @PostMapping("/complete/{id}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<BazarDto> completeBazar(@PathVariable Long id, @RequestBody CompleteRequest req) {
        return ResponseEntity.ok(bazarService.completeBazar(id, req.getAmount(), req.getDescription()));
    }

    @GetMapping("/month/{year}/{month}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<List<BazarDto>> getScheduleByMonth(@PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(bazarService.getScheduleByMonth(year, month));
    }

    @GetMapping("/my/{year}/{month}")
    @PreAuthorize("hasRole('MEMBER') or hasRole('MANAGER')")
    public ResponseEntity<List<BazarDto>> getMySchedule(
            @AuthenticationPrincipal UserPrincipal user,
            @PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(bazarService.getMySchedule(user.getId(), year, month));
    }

    @GetMapping("/notifications")
    @PreAuthorize("hasRole('MEMBER') or hasRole('MANAGER')")
    public ResponseEntity<List<BazarDto>> getNotifications() {
        return ResponseEntity.ok(bazarService.getPendingNotifications());
    }

    @GetMapping("/total/{year}/{month}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<Double> getTotalBazar(@PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(bazarService.getTotalBazarByMonth(year, month));
    }
}

class ScheduleRequest {
    private Long userId;
    private LocalDate date;
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}

class CompleteRequest {
    private Double amount;
    private String description;
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
