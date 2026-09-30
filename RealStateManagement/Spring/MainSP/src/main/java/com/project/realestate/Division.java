package com.project.realestate;

public class Division {
	int id;
	String divName;
	int countryId;
	public Division() {
		super();
	}
	public Division(int id, String divName, int countryId) {
		super();
		this.id = id;
		this.divName = divName;
		this.countryId = countryId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDivName() {
		return divName;
	}
	public void setDivName(String divName) {
		this.divName = divName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "Division [id=" + id + ", divName=" + divName + ", countryId=" + countryId + ", getId()=" + getId()
				+ ", getDivName()=" + getDivName() + ", getCountryId()=" + getCountryId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
