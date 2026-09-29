package com.messmanager.deposit;

import com.messmanager.auth.jwt.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deposits")
@CrossOrigin(origins = "http://localhost:4200")
public class DepositController {

    @Autowired
    private DepositService depositService;

    @PostMapping
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<DepositDto> addDeposit(@RequestBody DepositRequest request) {
        return ResponseEntity.ok(depositService.addDeposit(request.getUserId(), request.getAmount()));
    }

    @GetMapping("/my")
    @PreAuthorize("hasRole('MEMBER') or hasRole('MANAGER')")
    public ResponseEntity<List<DepositDto>> getMyDeposits(@AuthenticationPrincipal UserPrincipal user) {
        return ResponseEntity.ok(depositService.getDepositsByUser(user.getId()));
    }

    @GetMapping
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<List<DepositDto>> getAllDeposits() {
        return ResponseEntity.ok(depositService.getAllDeposits());
    }

    @GetMapping("/total/{userId}")
    @PreAuthorize("hasRole('MANAGER') or @userSecurity.isCurrentUser(#userId, principal)")
    public ResponseEntity<Double> getTotalDeposit(@PathVariable Long userId) {
        return ResponseEntity.ok(depositService.getTotalDepositByUser(userId));
    }
}

class DepositRequest {
    private Long userId;
    private Double amount;
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}
