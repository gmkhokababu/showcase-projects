package com.messmanager.bazar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface BazarScheduleRepository extends JpaRepository<BazarSchedule, Long> {
    List<BazarSchedule> findByBazarDateBetweenOrderByBazarDateAsc(LocalDate start, LocalDate end);
    List<BazarSchedule> findByUserIdAndBazarDateBetween(Long userId, LocalDate start, LocalDate end);
    Optional<BazarSchedule> findByBazarDate(LocalDate date);
    List<BazarSchedule> findByStatusAndBazarDateBefore(BazarSchedule.BazarStatus status, LocalDate date);
}
