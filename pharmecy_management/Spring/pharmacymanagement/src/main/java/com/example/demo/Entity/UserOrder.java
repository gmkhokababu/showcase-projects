package com.example.demo.Entity;

import java.sql.Date;

public class UserOrder {
	int orderId;
	String invoiceNO;
	String customerName;
	String customerPhone;
	String customerAddress;
	Date date;
	int totalOrder;
	public UserOrder() {
		super();
	}
	public UserOrder(int orderId, String invoiceNO, String customerName, String customerPhone, String customerAddress,Date date,
			int totalOrder) {
		super();
		this.orderId = orderId;
		this.invoiceNO = invoiceNO;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.date = date;
		this.totalOrder = totalOrder;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getInvoiceNO() {
		return invoiceNO;
	}
	public void setInvoiceNO(String invoiceNO) {
		this.invoiceNO = invoiceNO;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotalOrder() {
		return totalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	
	@Override
	public String toString() {
		return "UserOrder [orderId=" + orderId + ", invoiceNO=" + invoiceNO + ", customerName=" + customerName
				+ ", customerPhone=" + customerPhone + ", customerAddress=" + customerAddress + ", date=" + date
				+ ", totalOrder=" + totalOrder + "]";
	}
	

}
