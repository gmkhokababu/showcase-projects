package com.shop.webshop.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.webshop.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	Optional<Users> findByUsername(String username);

}
