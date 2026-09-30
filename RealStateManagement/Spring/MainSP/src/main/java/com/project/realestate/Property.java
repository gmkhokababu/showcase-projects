package com.project.realestate;

public class Property {
	int id;
	String type;
	String location;
	int size;
	String amenities;
	String status;
	int landlordId;
	int price;
	String saleType;
	String landtype;
	public Property() {
		super();
	}
	public Property(int id, String type, String location, int size, String amenities, String status, int landlordId,
			int price, String saleType, String landtype) {
		super();
		this.id = id;
		this.type = type;
		this.location = location;
		this.size = size;
		this.amenities = amenities;
		this.status = status;
		this.landlordId = landlordId;
		this.price = price;
		this.saleType = saleType;
		this.landtype = landtype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSaleType() {
		return saleType;
	}
	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}
	public String getLandtype() {
		return landtype;
	}
	public void setLandtype(String landtype) {
		this.landtype = landtype;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", type=" + type + ", location=" + location + ", size=" + size + ", amenities="
				+ amenities + ", status=" + status + ", landlordId=" + landlordId + ", price=" + price + ", saleType="
				+ saleType + ", landtype=" + landtype + ", getId()=" + getId() + ", getType()=" + getType()
				+ ", getLocation()=" + getLocation() + ", getSize()=" + getSize() + ", getAmenities()=" + getAmenities()
				+ ", getStatus()=" + getStatus() + ", getLandlordId()=" + getLandlordId() + ", getPrice()=" + getPrice()
				+ ", getSaleType()=" + getSaleType() + ", getLandtype()=" + getLandtype() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
