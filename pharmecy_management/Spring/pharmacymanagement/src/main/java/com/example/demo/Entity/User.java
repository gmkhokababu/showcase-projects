package com.example.demo.Entity;

public class User {

	int userId;
	String username;
	String password;
	String role;
	int emp_id;
	public User() {
		super();
	}
	public User(int userId, String username, String password, String role, int emp_id) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.emp_id = emp_id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", emp_id=" + emp_id + "]";
	}
	
	
	
	
}
