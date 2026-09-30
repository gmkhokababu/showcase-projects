package com.project.realestate;

import java.sql.Date;

public class Transaction {
	int transactionId;
	int payId; 
	Date date; 
	double amount;
	public Transaction() {
		super();
	}
	public Transaction(int transactionId, int payId, Date date, double amount) {
		super();
		this.transactionId = transactionId;
		this.payId = payId;
		this.date = date;
		this.amount = amount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", payId=" + payId + ", date=" + date + ", amount="
				+ amount + ", getTransactionId()=" + getTransactionId() + ", getPayId()=" + getPayId() + ", getDate()="
				+ getDate() + ", getAmount()=" + getAmount() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
