package com.shop.webshop.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.webshop.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(String name);

}
