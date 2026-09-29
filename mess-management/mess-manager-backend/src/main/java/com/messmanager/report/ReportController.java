package com.messmanager.report;

import com.messmanager.auth.jwt.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "http://localhost:4200")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/my/{year}/{month}")
    @PreAuthorize("hasRole('MEMBER') or hasRole('MANAGER')")
    public ResponseEntity<MemberReportDto> getMyReport(
            @AuthenticationPrincipal UserPrincipal user,
            @PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(reportService.getMemberReport(user.getId(), year, month));
    }

    @GetMapping("/member/{userId}/{year}/{month}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<MemberReportDto> getMemberReport(
            @PathVariable Long userId, @PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(reportService.getMemberReport(userId, year, month));
    }

    @GetMapping("/all/{year}/{month}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<List<MemberReportDto>> getAllReports(@PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(reportService.getAllMemberReports(year, month));
    }

    @GetMapping("/dashboard/{year}/{month}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<DashboardDto> getDashboard(@PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(reportService.getManagerDashboard(year, month));
    }
}
