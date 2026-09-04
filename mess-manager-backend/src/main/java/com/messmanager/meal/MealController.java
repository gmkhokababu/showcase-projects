package com.messmanager.meal;

import com.messmanager.auth.jwt.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
@CrossOrigin(origins = "http://localhost:4200")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<MealDto> addMeal(@RequestBody MealDto dto) {
        return ResponseEntity.ok(mealService.addMeal(dto.getUserId(), dto));
    }

    @GetMapping("/my/{year}/{month}")
    @PreAuthorize("hasRole('MEMBER') or hasRole('MANAGER')")
    public ResponseEntity<List<MealDto>> getMyMeals(
            @AuthenticationPrincipal UserPrincipal user,
            @PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(mealService.getMealsByUserAndMonth(user.getId(), year, month));
    }

    @GetMapping("/month/{year}/{month}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<List<MealDto>> getAllMealsByMonth(@PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(mealService.getAllMealsByMonth(year, month));
    }

    @GetMapping("/total/{year}/{month}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<Integer> getTotalMealsByMonth(@PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(mealService.getTotalMealsByMonth(year, month));
    }

    @GetMapping("/my-total/{year}/{month}")
    @PreAuthorize("hasRole('MEMBER') or hasRole('MANAGER')")
    public ResponseEntity<Integer> getMyTotalMeals(
            @AuthenticationPrincipal UserPrincipal user,
            @PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(mealService.getTotalMealsByUserAndMonth(user.getId(), year, month));
    }
}
