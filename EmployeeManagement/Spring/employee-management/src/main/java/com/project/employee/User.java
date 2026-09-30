package com.project.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;
	String userName;
	String password;
//	@ManyToOne
//    @JoinColumn(name = "employee_id")
	int employeeId;
	public User() {
		super();
	}
	public User(int userId, String userName, String password, int employeeId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.employeeId = employeeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", employeeId="
				+ employeeId + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName() + ", getPassword()="
				+ getPassword() + ", getEmployeeId()=" + getEmployeeId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
