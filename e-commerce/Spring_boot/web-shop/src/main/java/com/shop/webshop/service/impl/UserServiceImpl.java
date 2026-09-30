package com.shop.webshop.service.impl;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shop.webshop.entity.Role;
import com.shop.webshop.entity.Users;
import com.shop.webshop.repo.RoleRepository;
import com.shop.webshop.repo.UsersRepository;
import com.shop.webshop.service.ActivityLogService;
import com.shop.webshop.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	
	private final UsersRepository usersRepo;
	private final BCryptPasswordEncoder passwordEncoder;
	private final ActivityLogService activityLogService;
	private final RoleRepository roleRepo;
	
	//Constructor injection
	public UserServiceImpl(UsersRepository usersRepo, BCryptPasswordEncoder passwordEncoder, ActivityLogService activityLogService, RoleRepository roleRepo) {
		this.usersRepo = usersRepo;
		this.passwordEncoder = passwordEncoder;
		this.activityLogService = activityLogService;
		this.roleRepo=roleRepo;
	}
	
	
	@Override
	public Users login(String username, String password) {
		Optional<Users> userOptional = usersRepo.findByUsername(username);
		
		if(userOptional.isEmpty()) {
			//Log failed login attempt for non-existing user
			activityLogService.logActivity(null, username, "LOGIN_FAILED", "User not found");
			throw new RuntimeException("Invalid username or password");
		}
		
		Users user = userOptional.get();
		
		// Check if user account is active
        if (!user.isActive()) {
            activityLogService.logActivity(user.getId(), user.getUsername(), "LOGIN_FAILED", "Account is inactive");
            throw new RuntimeException("Account is deactivated");
        }

        // Verify password
        if (!passwordEncoder.matches(password, user.getPassword())) {
            activityLogService.logActivity(user.getId(), user.getUsername(), "LOGIN_FAILED", "Incorrect password");
            throw new RuntimeException("Invalid username or password");
        }

        // Log successful login
        activityLogService.logActivity(user.getId(), user.getUsername(), "LOGIN_SUCCESS", "User logged in successfully");
        
        return user;
		
		
	}
	
	// Admin create section method
	
	@Override
	public Users createAdmin(Users adminUser) {
	    // Check if username already exists
	    if (usersRepo.findByUsername(adminUser.getUsername()).isPresent()) {
	        throw new RuntimeException("Username already taken!");
	    }

	    // Encrypt password
	    adminUser.setPassword(passwordEncoder.encode(adminUser.getPassword()));
	    adminUser.setActive(true);
	    adminUser.setLocked(false);

	    // Fetch and assign ROLE_ADMIN
	    Role adminRole = roleRepo.findByName("ROLE_ADMIN")
	            .orElseThrow(() -> new RuntimeException("ROLE_ADMIN not found in database!"));
	    
	    java.util.Set<Role> roles = new java.util.HashSet<>();
	    roles.add(adminRole);
	    adminUser.setRoles(roles);

	    return usersRepo.save(adminUser);
	}

}
