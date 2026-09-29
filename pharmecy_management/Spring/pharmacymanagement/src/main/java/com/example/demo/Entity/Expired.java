package com.example.demo.Entity;

import java.sql.Date;

public class Expired {
	
	int expiredId;
	int stockId;
	int qty;
	double rate ;
	double total ;
	Date saleDate ;
	int customerId ;
	public Expired() {
		super();
	}
	public Expired(int expiredId, int stockId, int qty, double rate, double total, Date saleDate, int customerId) {
		super();
		this.expiredId = expiredId;
		this.stockId = stockId;
		this.qty = qty;
		this.rate = rate;
		this.total = total;
		this.saleDate = saleDate;
		this.customerId = customerId;
	}
	public int getExpiredId() {
		return expiredId;
	}
	public void setExpiredId(int expiredId) {
		this.expiredId = expiredId;
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
		return "Expired [expiredId=" + expiredId + ", stockId=" + stockId + ", qty=" + qty + ", rate=" + rate
				+ ", total=" + total + ", saleDate=" + saleDate + ", customerId=" + customerId + "]";
	}
	
	
	

}
