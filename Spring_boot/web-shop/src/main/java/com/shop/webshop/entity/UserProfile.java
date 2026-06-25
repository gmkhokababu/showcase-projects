package com.shop.webshop.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user_profile")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;

	@Column(unique=true, nullable=true)
	private String email;

	@Column(unique=true, nullable=true)
	private String phone;
	
	@Column(nullable=true)
	private String imgUrl;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
	private Users user;

	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Address> addresses = new ArrayList<>();

	public UserProfile() {
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

	public String getEmail() { 
		return email; 
	}
	
	public void setEmail(String email) { 
		this.email = email; 
	}

	public String getPhone() { 
		return phone; 
	}
	
	public void setPhone(String phone) { 
		this.phone = phone; 
	}

	public String getImgUrl() { 
		return imgUrl; 
	}
	
	public void setImgUrl(String imgUrl) { 
		this.imgUrl = imgUrl; 
	}

	public Users getUser() { 
		return user; 
	}
	
	public void setUser(Users user) { 
		this.user = user; 
	}

	public List<Address> getAddresses() { 
		return addresses; 
	}
	
	public void setAddresses(List<Address> addresses) { 
		this.addresses = addresses; 
	}
}