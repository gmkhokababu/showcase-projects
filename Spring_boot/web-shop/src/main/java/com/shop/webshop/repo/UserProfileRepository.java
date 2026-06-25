package com.shop.webshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.webshop.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}