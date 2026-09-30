package com.project.realestate;

import java.sql.Date;

public class Accounts {
	int idaccounts;
	int userId;
	int transactionId;
	double amount;
	String transactionType;
	Date date;
	
	public Accounts() {
		super();
	}

	public Accounts(int idaccounts, int userId, int transactionId, double amount, String transactionType, Date date) {
		super();
		this.idaccounts = idaccounts;
		this.userId = userId;
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		this.date = date;
	}

	public int getIdaccounts() {
		return idaccounts;
	}

	public void setIdaccounts(int idaccounts) {
		this.idaccounts = idaccounts;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Accounts [idaccounts=" + idaccounts + ", userId=" + userId + ", transactionId=" + transactionId
				+ ", amount=" + amount + ", transactionType=" + transactionType + ", date=" + date
				+ ", getIdaccounts()=" + getIdaccounts() + ", getUserId()=" + getUserId() + ", getTransactionId()="
				+ getTransactionId() + ", getAmount()=" + getAmount() + ", getTransactionType()=" + getTransactionType()
				+ ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
