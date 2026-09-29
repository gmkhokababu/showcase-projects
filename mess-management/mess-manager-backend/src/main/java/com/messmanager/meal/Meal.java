package com.messmanager.meal;

import com.messmanager.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "meals")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private LocalDate mealDate;

    @Column(nullable = false)
    private Integer mealCount; // 1, 2, or 3 meals

    private Boolean isLunch = true;
    private Boolean isDinner = true;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        if (mealDate == null) mealDate = LocalDate.now();
        if (mealCount == null) mealCount = 2;
    }
}
