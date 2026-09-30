package com.project.realestate;

public class Users {

	int id;
	String name;
	String email;
	String userName;
	String password;
	String role;
	public Users() {
		super();
	}
	public Users(int id, String name, String email, String userName, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", userName=" + userName + ", password="
				+ password + ", role=" + role + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getRole()="
				+ getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
