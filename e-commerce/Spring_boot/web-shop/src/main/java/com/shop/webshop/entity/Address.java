package com.shop.webshop.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String addressType; // e.g., "SHIPPING", "BILLING", "HOME"

    @Column(nullable = false)
    private String streetAddress; // village/road/house number

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String division;

    @Column(nullable = true)
    private String zipCode;

    @Column(nullable = false)
    private String country = "Bangladesh";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_profile_id", nullable = false)
    private UserProfile userProfile;

    public Address() {
    }

    public Long getId() { 
        return id; 
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getAddressType() { 
        return addressType; 
    }
    
    public void setAddressType(String addressType) { 
        this.addressType = addressType; 
    }

    public String getStreetAddress() { 
        return streetAddress; 
    }
    
    public void setStreetAddress(String streetAddress) { 
        this.streetAddress = streetAddress; 
    }

    public String getCity() { 
        return city; 
    }
    
    public void setCity(String city) { 
        this.city = city; 
    }

    public String getDistrict() { 
        return district; 
    }
    
    public void setDistrict(String district) { 
        this.district = district; 
    }

    public String getDivision() { 
        return division; 
    }
    
    public void setDivision(String division) { 
        this.division = division; 
    }

    public String getZipCode() { 
        return zipCode; 
    }
    
    public void setZipCode(String zipCode) { 
        this.zipCode = zipCode; 
    }

    public String getCountry() { 
        return country; 
    }
    
    public void setCountry(String country) { 
        this.country = country; 
    }

    public UserProfile getUserProfile() { 
        return userProfile; 
    }
    
    public void setUserProfile(UserProfile userProfile) { 
        this.userProfile = userProfile; 
    }
}