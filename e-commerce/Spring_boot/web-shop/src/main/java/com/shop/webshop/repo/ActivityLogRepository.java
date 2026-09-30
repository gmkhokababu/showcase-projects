package com.shop.webshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.webshop.entity.ActivityLog;

public interface ActivityLogRepository extends JpaRepository<ActivityLog,Long>{

}
