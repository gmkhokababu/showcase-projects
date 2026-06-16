package com.shop.webshop.service;

public interface ActivityLogService {
	
	void logActivity(Long userId, String username, String action, String details);

}
