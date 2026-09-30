package com.project.realestate;

public class City {
	int id;
	String cityName;
	int distId;
	public City() {
		super();
	}
	public City(int id, String cityName, int distId) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.distId = distId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getDistId() {
		return distId;
	}
	public void setDistId(int distId) {
		this.distId = distId;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", distId=" + distId + ", getId()=" + getId()
				+ ", getCityName()=" + getCityName() + ", getDistId()=" + getDistId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
