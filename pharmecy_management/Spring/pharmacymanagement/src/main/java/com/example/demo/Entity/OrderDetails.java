package com.example.demo.Entity;

import java.sql.Date;

public class OrderDetails {
//	int orderDetailsId;
	String invoice;
	String medicineName;
	String genericName;
	String supplier;
	int qty;
	double rate;
	double total;
	String customerName;
	String phone;
	String address;
	int stockId;
	int orderId;
	Date saleDate;
	String status;
	int customerId;
	public OrderDetails() {
		super();
	}
	
	

	public OrderDetails(String invoice, String medicineName, String genericName, String supplier, int qty, double rate,
			double total, String customerName, String phone, String address, int stockId, int orderId, Date saleDate,
			String status,int customerId) {
		super();
		this.invoice = invoice;
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.supplier = supplier;
		this.qty = qty;
		this.rate = rate;
		this.total = total;
		this.customerName = customerName;
		this.phone = phone;
		this.address = address;
		this.stockId = stockId;
		this.orderId = orderId;
		this.saleDate = saleDate;
		this.status = status;
		this.customerId = customerId;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	@Override
	public String toString() {
		return "OrderDetails [invoice=" + invoice + ", medicineName=" + medicineName + ", genericName=" + genericName
				+ ", supplier=" + supplier + ", qty=" + qty + ", rate=" + rate + ", total=" + total + ", customerName="
				+ customerName + ", phone=" + phone + ", address=" + address + ", stockId=" + stockId + ", orderId="
				+ orderId + ", saleDate=" + saleDate + ", status=" + status + ", customerId=" + customerId + "]";
	}
	
	
	

}
