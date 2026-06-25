package com.shop.webshop.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.shop.webshop.entity.Role;
import com.shop.webshop.entity.Users;
import com.shop.webshop.repo.RoleRepository;
import com.shop.webshop.repo.UsersRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	private final RoleRepository roleRepo;
	private final UsersRepository usersRepo;
	private final BCryptPasswordEncoder passwordEncoder;

	public DataInitializer(RoleRepository roleRepo, UsersRepository usersRepo, BCryptPasswordEncoder passwordEncoder) {

		this.roleRepo = roleRepo;
		this.usersRepo = usersRepo;
		this.passwordEncoder = passwordEncoder;
	}

	@Override

	public void run(String... args) throws Exception {

		Role systemAdminRole = roleRepo.findByName("SYSTEM_ADMIN")
				.orElseGet(() -> roleRepo.save(new Role("SYSTEM_ADMIN")));

		roleRepo.findByName("ROLE_ADMIN")
			.orElseGet(() -> roleRepo.save(new Role("ROLE_ADMIN")));

		roleRepo.findByName("ROLE_CS")
			.orElseGet(() -> roleRepo.save(new Role("ROLE_CS")));
		
		// ২. ডিফল্ট SYSTEM_ADMIN ইউজার তৈরি করা (যদি না থাকে)
        if (usersRepo.findByUsername("system").isEmpty()) {
            Users systemUser = new Users();
//            systemUser.setName("System Engineer");
            systemUser.setUsername("system");
            // পাসওয়ার্ড এনক্রিপ্ট করে "system123" সেট করা হচ্ছে
            systemUser.setPassword(passwordEncoder.encode("system123")); 
            systemUser.setActive(true);

            Set<Role> roles = new HashSet<>();
            roles.add(systemAdminRole);
            systemUser.setRoles(roles);

            usersRepo.save(systemUser);
            System.out.println(">> Default SYSTEM_ADMIN user created with username: system and password: system123");
        }
	}

}
