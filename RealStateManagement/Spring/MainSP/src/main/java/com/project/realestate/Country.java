package com.project.realestate;

public class Country {
	int id;
	String countryName;
	public Country() {
		super();
	}
	public Country(int id, String countryName) {
		super();
		this.id = id;
		this.countryName = countryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", getId()=" + getId() + ", getCountryName()="
				+ getCountryName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
