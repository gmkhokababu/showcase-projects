package com.shop.webshop.entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Column(nullable=false)
//	private String name;
	
	@Column(unique=true, nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private boolean active = true;
	
//	@Column(nullable=true)
//	private String imgUrl;
	
	@Column(nullable = false, name = "is_locked")
    private boolean isLocked = false;
	
	
//	public String getImgUrl() {
//		return imgUrl;
//	}

//	public void setImgUrl(String imgUrl) {
//		this.imgUrl = imgUrl;
//	}

//	Relation with user role
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name="user_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name="role_id")
		)
	private Set<Role> roles= new HashSet<>();
	
//	Relation with permission
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "users_permissions",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
	private Set<Permission> permissions = new HashSet<>();
	
	// Relation with user profile.
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UserProfile userProfile;

	// Getter এবং Setter
	public UserProfile getUserProfile() {
	    return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
	    this.userProfile = userProfile;
	}
	
	public Users() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getUsername() {
		return username;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
