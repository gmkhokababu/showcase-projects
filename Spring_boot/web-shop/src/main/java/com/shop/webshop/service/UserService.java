package com.shop.webshop.service;


import com.shop.webshop.model.Users;


public interface UserService {
	
	// Authenticates user and returns the Users object if successful
	Users login(String username, String password);

}
