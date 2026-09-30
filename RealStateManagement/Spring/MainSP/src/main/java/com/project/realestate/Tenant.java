package com.project.realestate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tenant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String presentAddress;
	String permanentAddress;
	String phoneNo;
	String email;
	String occupation;
	String propertyId;
	public Tenant() {
		super();
	}
	public Tenant(int id, String name, String presentAddress, String permanentAddress, String phoneNo, String email,
			String occupation, String propertyId) {
		super();
		this.id = id;
		this.name = name;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
		this.phoneNo = phoneNo;
		this.email = email;
		this.occupation = occupation;
		this.propertyId = propertyId;
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
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
	@Override
	public String toString() {
		return "Tenant [id=" + id + ", name=" + name + ", presentAddress=" + presentAddress + ", permanentAddress="
				+ permanentAddress + ", phoneNo=" + phoneNo + ", email=" + email + ", occupation=" + occupation
				+ ", propertyId=" + propertyId + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPresentAddress()=" + getPresentAddress() + ", getPermanentAddress()=" + getPermanentAddress()
				+ ", getPhoneNo()=" + getPhoneNo() + ", getEmail()=" + getEmail() + ", getOccupation()="
				+ getOccupation() + ", getPropertyId()=" + getPropertyId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
