package com.example.demo.Entity;

public class Accounts {
//	accId int primary key auto_increment, debit double , credit double , bal/ance double);
	
	int accId;
	String acc_no;
	String acc_type;
	double debit;
	double credit;
	double balance;
	public Accounts(int accId, String acc_no, String acc_type, double debit, double credit, double balance) {
		super();
		this.accId = accId;
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.debit = debit;
		this.credit = credit;
		this.balance = balance;
	}
	public Accounts() {
		super();
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	@Override
	public String toString() {
		return "Accounts [accId=" + accId + ", acc_no=" + acc_no + ", acc_type=" + acc_type + ", debit=" + debit
				+ ", credit=" + credit + ", balance=" + balance + "]";
	}
	
	
	

}
