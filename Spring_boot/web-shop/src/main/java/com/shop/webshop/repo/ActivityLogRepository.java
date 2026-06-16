package com.shop.webshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.webshop.model.ActivityLog;

public interface ActivityLogRepository extends JpaRepository<ActivityLog,Long>{

}
