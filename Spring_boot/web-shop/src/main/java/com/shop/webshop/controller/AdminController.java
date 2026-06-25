package com.shop.webshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.webshop.entity.Users;
import com.shop.webshop.service.UserService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "${app.cors.allowed-origins}", allowCredentials = "true")
public class AdminController {
	
	private final UserService userService;

    // 1. Constructor Injection
    public AdminController(UserService userService) {
        this.userService = userService;
    }

//  ===================Create new admin==============================
  @PostMapping("/create-admin")
  public ResponseEntity<?> createAdmin(@RequestBody Users adminUser) {
      try {
          Users created = userService.createAdmin(adminUser);
          created.setPassword(null); // Security check
          return ResponseEntity.ok(created);
      } catch (RuntimeException e) {
          return ResponseEntity.badRequest().body(e.getMessage());
      }
  }
}
