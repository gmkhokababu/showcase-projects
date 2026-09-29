package com.example.demo.Entity;

import java.sql.Date;

public class Sale {
	
	int saleId;
	int stockId;
	int qty;
	double rate;
	double total;
	Date saleDate;
	int customerId;
	String invoice_no;
	String status;
	

			
	public Sale() {
		super();
	}



	public Sale(int saleId, int stockId, int qty, double rate, double total, Date saleDate, int customerId,
			String invoice_no, String status) {
		super();
		this.saleId = saleId;
		this.stockId = stockId;
		this.qty = qty;
		this.rate = rate;
		this.total = total;
		this.saleDate = saleDate;
		this.customerId = customerId;
		this.invoice_no = invoice_no;
		this.status = status;
	}



	public int getSaleId() {
		return saleId;
	}



	public void setSaleId(int saleId) {
		this.saleId = saleId;
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



	public String getInvoice_no() {
		return invoice_no;
	}



	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", stockId=" + stockId + ", qty=" + qty + ", rate=" + rate + ", total="
				+ total + ", saleDate=" + saleDate + ", customerId=" + customerId + ", invoice_no=" + invoice_no
				+ ", status=" + status + "]";
	}



	
	



}
