package com.shop.webshop.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.shop.webshop.entity.Permission;
import com.shop.webshop.entity.Role;
import com.shop.webshop.entity.Users;
import com.shop.webshop.repo.PermissionRepository;
import com.shop.webshop.repo.RoleRepository;
import com.shop.webshop.repo.UsersRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	private final RoleRepository roleRepo;
	private final UsersRepository usersRepo;
	private final PermissionRepository permissionRepo;
	private final BCryptPasswordEncoder passwordEncoder;

	public DataInitializer(RoleRepository roleRepo, UsersRepository usersRepo, 
			PermissionRepository permissionRepo, BCryptPasswordEncoder passwordEncoder) {
		this.roleRepo = roleRepo;
		this.usersRepo = usersRepo;
		this.permissionRepo = permissionRepo;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void run(String... args) throws Exception {

		// 1. Initialize default permissions
		Permission userCreate = permissionRepo.findByName("USER_CREATE")
				.orElseGet(() -> permissionRepo.save(new Permission(null, "USER_CREATE", null, null)));
		
		Permission userDelete = permissionRepo.findByName("USER_DELETE")
				.orElseGet(() -> permissionRepo.save(new Permission(null, "USER_DELETE", null, null)));

		// 2. Initialize default roles
		Role systemAdminRole = roleRepo.findByName("SYSTEM_ADMIN")
				.orElseGet(() -> {
					Role role = new Role("SYSTEM_ADMIN");
					Set<Permission> pSet = new HashSet<>();
					pSet.add(userCreate);
					pSet.add(userDelete);
					role.setPermissions(pSet);
					return roleRepo.save(role);
				});

		roleRepo.findByName("ROLE_ADMIN")
				.orElseGet(() -> roleRepo.save(new Role("ROLE_ADMIN")));

		roleRepo.findByName("ROLE_CS")
				.orElseGet(() -> roleRepo.save(new Role("ROLE_CS")));
		
		// 3. Initialize default SYSTEM_ADMIN user if not exists
		if (usersRepo.findByUsername("system").isEmpty()) {
			Users systemUser = new Users();
			systemUser.setUsername("system");
			systemUser.setPassword(passwordEncoder.encode("system123")); 
			systemUser.setActive(true);
			systemUser.setLocked(false);

			Set<Role> roles = new HashSet<>();
			roles.add(systemAdminRole);
			systemUser.setRoles(roles);

			usersRepo.save(systemUser);
			System.out.println(">> Default SYSTEM_ADMIN user created with username: system and password: system123");
		}
	}
}