package com.messmanager.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    List<Meal> findByUserIdAndMealDateBetween(Long userId, LocalDate start, LocalDate end);
    List<Meal> findByMealDateBetween(LocalDate start, LocalDate end);

    @Query("SELECT SUM(m.mealCount) FROM Meal m WHERE m.mealDate BETWEEN ?1 AND ?2")
    Integer getTotalMealsBetween(LocalDate start, LocalDate end);

    @Query("SELECT SUM(m.mealCount) FROM Meal m WHERE m.user.id = ?1 AND m.mealDate BETWEEN ?2 AND ?3")
    Integer getTotalMealsByUserBetween(Long userId, LocalDate start, LocalDate end);
}
