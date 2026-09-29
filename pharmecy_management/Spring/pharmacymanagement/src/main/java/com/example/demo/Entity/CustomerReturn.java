package com.example.demo.Entity;

import java.sql.Date;

public class CustomerReturn {
	
	int cus_returnId ;
	int stockId ;
	int qty ;
	double rate ;
	double total ;
	Date saleDate ;
	int customerId ;
	public CustomerReturn() {
		super();
	}
	public CustomerReturn(int cus_returnId, int stockId, int qty, double rate, double total, Date saleDate,
			int customerId) {
		super();
		this.cus_returnId = cus_returnId;
		this.stockId = stockId;
		this.qty = qty;
		this.rate = rate;
		this.total = total;
		this.saleDate = saleDate;
		this.customerId = customerId;
	}
	public int getCus_returnId() {
		return cus_returnId;
	}
	public void setCus_returnId(int cus_returnId) {
		this.cus_returnId = cus_returnId;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
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
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "CustomerReturn [cus_returnId=" + cus_returnId + ", stockId=" + stockId + ", qty=" + qty + ", rate="
				+ rate + ", total=" + total + ", saleDate=" + saleDate + ", customerId=" + customerId + "]";
	}
	
	
	

}
