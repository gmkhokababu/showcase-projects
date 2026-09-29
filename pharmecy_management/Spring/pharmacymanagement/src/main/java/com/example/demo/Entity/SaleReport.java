package com.example.demo.Entity;

import java.sql.Date;

public class SaleReport {
	String supplier;
	String medicine;
	String generic;
	String batch;
	String customer;
	String Phone;
	int qty;
	Double rate;
	Double total;
	Date date;
	String invoice_no;
	public SaleReport() {
		super();
	}
	public SaleReport(String supplier, String medicine, String generic, String batch, String customer, String phone,
			int qty, Double rate, Double total, Date date,String invoice_no) {
		super();
		this.supplier = supplier;
		this.medicine = medicine;
		this.generic = generic;
		this.batch = batch;
		this.customer = customer;
		Phone = phone;
		this.qty = qty;
		this.rate = rate;
		this.total = total;
		this.date = date;
		this.invoice_no=invoice_no;
	}
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getGeneric() {
		return generic;
	}
	public void setGeneric(String generic) {
		this.generic = generic;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "SaleReport [supplier=" + supplier + ", medicine=" + medicine + ", generic=" + generic + ", batch="
				+ batch + ", customer=" + customer + ", Phone=" + Phone + ", qty=" + qty + ", rate=" + rate + ", total="
				+ total + ", date=" + date + ", invoice_no=" + invoice_no + "]";
	}
	

}
