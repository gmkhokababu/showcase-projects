package com.shop.webshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shop.webshop.entity.Users;
import com.shop.webshop.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/authentication")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class UserController {

	private final UserService userService;

    // 1. Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 2. User Login Endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Users loginRequest, HttpSession session) {
        try {
            // 3. Authenticate user via service
            Users authenticatedUser = userService.login(loginRequest.getUsername(), loginRequest.getPassword());

            // 4. Store session attributes
            session.setAttribute("userId", authenticatedUser.getId());
            session.setAttribute("username", authenticatedUser.getUsername());
            session.setAttribute("roles", authenticatedUser.getRoles());

            // 5. Return success response
            return ResponseEntity.ok(authenticatedUser);

        } catch (RuntimeException e) {
            // 6. Return error response if authentication fails
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }
    
 // Check active session data
    @GetMapping("/check-session")
    public ResponseEntity<?> checkSession(HttpSession session) {
        // Retrieve attributes from session
        Long userId = (Long) session.getAttribute("userId");
        String username = (String) session.getAttribute("username");

        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No active session found.");
        }

        System.out.println("Active Session - User ID: " + userId + ", Username: " + username);
        // Return session details as response
        return ResponseEntity.ok("Active Session - User ID: " + userId + ", Username: " + username);
    }
    
    
    
 // User Logout Endpoint
    @PostMapping("/logout")
    public ResponseEntity<String> logout(HttpSession session) {
        // Destroy the current session completely
        session.invalidate();
        
        return ResponseEntity.ok("Logged out successfully. Session destroyed.");
    }
    
    
    
    
    
}
