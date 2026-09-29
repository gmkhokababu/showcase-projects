package com.example.demo.Entity;

import java.sql.Date;

public class Transaction {
//	create table taransaction( int primary key auto_increment,  date , purpose varchar(255), transactionType varchar(255), ammount double);

	
	int transactionId;
	Date transactionDate;
	String invoice_no;
	String purpose;
	String transactionType;
	double ammount;
	public Transaction() {
		super();
	}
	public Transaction(int transactionId, Date transactionDate,String invoice_no, String purpose, String transactionType,
			double ammount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.invoice_no = invoice_no;
		this.purpose = purpose;
		this.transactionType = transactionType;
		this.ammount = ammount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate + ", invoice_no="
				+ invoice_no + ", purpose=" + purpose + ", transactionType=" + transactionType + ", ammount=" + ammount
				+ "]";
	}
	
	
	
	
	
	
}
