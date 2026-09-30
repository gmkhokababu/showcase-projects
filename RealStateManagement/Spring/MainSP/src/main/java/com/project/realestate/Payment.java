package com.project.realestate;

public class Payment {

	int customerId;
	int propertyId;
	double totalFair;
	double pay;
	double due;
	String status;
	String month;
	int year;
	double deposit;
	
	public Payment() {
		super();
	}

	public Payment(int customerId, int propertyId, double totalFair, double pay, double due, String status,
			String month, int year, double deposit) {
		super();
		this.customerId = customerId;
		this.propertyId = propertyId;
		this.totalFair = totalFair;
		this.pay = pay;
		this.due = due;
		this.status = status;
		this.month = month;
		this.year = year;
		this.deposit = deposit;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public double getTotalFair() {
		return totalFair;
	}

	public void setTotalFair(double totalFair) {
		this.totalFair = totalFair;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public double getDue() {
		return due;
	}

	public void setDue(double due) {
		this.due = due;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	@Override
	public String toString() {
		return "Payment [customerId=" + customerId + ", propertyId=" + propertyId + ", totalFair=" + totalFair
				+ ", pay=" + pay + ", due=" + due + ", status=" + status + ", month=" + month + ", year=" + year
				+ ", deposit=" + deposit + ", getCustomerId()=" + getCustomerId() + ", getPropertyId()="
				+ getPropertyId() + ", getTotalFair()=" + getTotalFair() + ", getPay()=" + getPay() + ", getDue()="
				+ getDue() + ", getStatus()=" + getStatus() + ", getMonth()=" + getMonth() + ", getYear()=" + getYear()
				+ ", getDeposit()=" + getDeposit() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	

}
