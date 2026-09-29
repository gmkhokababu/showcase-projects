package com.example.demo.Entity;

public class Supplier {
	int supllierId;
	String name;
	String email;
	String o_phone;
	String contactPersion;
	String contactPersionPhone;
	public Supplier(int supllierId, String name, String email, String o_phone, String contactPersion,
			String contactPersionPhone) {
		super();
		this.supllierId = supllierId;
		this.name = name;
		this.email = email;
		this.o_phone = o_phone;
		this.contactPersion = contactPersion;
		this.contactPersionPhone = contactPersionPhone;
	}
	public Supplier() {
		super();
	}
	public int getSupllierId() {
		return supllierId;
	}
	public void setSupllierId(int supllierId) {
		this.supllierId = supllierId;
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
	public String getO_phone() {
		return o_phone;
	}
	public void setO_phone(String o_phone) {
		this.o_phone = o_phone;
	}
	public String getContactPersion() {
		return contactPersion;
	}
	public void setContactPersion(String contactPersion) {
		this.contactPersion = contactPersion;
	}
	public String getContactPersionPhone() {
		return contactPersionPhone;
	}
	public void setContactPersionPhone(String contactPersionPhone) {
		this.contactPersionPhone = contactPersionPhone;
	}
	@Override
	public String toString() {
		return "Supplier [supllierId=" + supllierId + ", name=" + name + ", email=" + email + ", o_phone=" + o_phone
				+ ", contactPersion=" + contactPersion + ", contactPersionPhone=" + contactPersionPhone + "]";
	}
	
	



}
