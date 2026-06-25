package com.shop.webshop.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.webshop.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    Optional<Permission> findByName(String name);
}