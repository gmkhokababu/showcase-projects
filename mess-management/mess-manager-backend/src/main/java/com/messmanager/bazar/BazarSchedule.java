package com.messmanager.bazar;

import com.messmanager.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "bazar_schedules")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BazarSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, unique = true)
    private LocalDate bazarDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BazarStatus status = BazarStatus.PENDING;

    private Double amount;
    private String description;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}

enum BazarStatus {
    PENDING,
    DONE
}
