package com.shop.webshop.service.impl;

import org.springframework.stereotype.Service;

import com.shop.webshop.model.ActivityLog;
import com.shop.webshop.repo.ActivityLogRepository;
import com.shop.webshop.service.ActivityLogService;


@Service
public class ActivityLogServiceImpl implements ActivityLogService{
	
	private final ActivityLogRepository activityLogRepo;
	
	public ActivityLogServiceImpl(ActivityLogRepository activityLogRepo) {
		this.activityLogRepo = activityLogRepo;
	}
	
	@Override
	public void logActivity(Long userId, String username, String action, String details) {
		
		ActivityLog log = new ActivityLog(userId, username, action, details);
		activityLogRepo.save(log);
	}

}
