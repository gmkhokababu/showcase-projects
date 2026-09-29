package com.example.demo.Entity;

import java.sql.Date;

public class Order {
	int order_id;
	int stockId;
	int qty;
	Double rate;
	Double total;
	Date saleDate;
	int customerId;
	String invoice_no;
	String status;
	public Order() {
		super();
	}
	public Order(int order_id, int stockId, int qty, Double rate, Double total, Date saleDate, int customerId,
			String invoice_no, String status) {
		super();
		this.order_id = order_id;
		this.stockId = stockId;
		this.qty = qty;
		this.rate = rate;
		this.total = total;
		this.saleDate = saleDate;
		this.customerId = customerId;
		this.invoice_no = invoice_no;
		this.status = status;
	}
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", stockId=" + stockId + ", qty=" + qty + ", rate=" + rate + ", total="
				+ total + ", saleDate=" + saleDate + ", customerId=" + customerId + ", invoice_no=" + invoice_no
				+ ", status=" + status + "]";
	}
	

}
