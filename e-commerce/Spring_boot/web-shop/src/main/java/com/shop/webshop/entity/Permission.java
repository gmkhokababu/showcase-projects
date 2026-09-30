package com.shop.webshop.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String name; // permission name "USER_CREATE", "DATA_DELETE"

	// Many-to-Many with Role (Mapped by roles_permissions)
	@ManyToMany(mappedBy = "permissions")
	private Set<Role> roles;

	// Many-to-Many directly with User (Mapped by users_permissions)
	@ManyToMany(mappedBy = "permissions")
	private Set<Users> users;

	// Default Constructor
	public Permission() {
	}

	public Permission(Long id, String name, Set<Role> roles, Set<Users> users) {
		super();
		this.id = id;
		this.name = name;
		this.roles = roles;
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}

}
