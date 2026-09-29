package com.example.demo.Entity;

import java.sql.Date;

public class Stock {
	
	int stockId;
	String medicineName;
	int paking;
	String genericName;
	String batchId;
	Date ex_date;
	String supplier;
	int qty;
	String mrp;
	double rate;
	public Stock() {
		super();
	}
	
	public Stock(int stockId, String medicineName, int paking, String genericName, String batchId, Date ex_date,
			String supplier, int qty, String mrp, double rate) {
		super();
		this.stockId = stockId;
		this.medicineName = medicineName;
		this.paking = paking;
		this.genericName = genericName;
		this.batchId = batchId;
		this.ex_date = ex_date;
		this.supplier = supplier;
		this.qty = qty;
		this.mrp = mrp;
		this.rate = rate;
	}

	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getPaking() {
		return paking;
	}
	public void setPaking(int paking) {
		this.paking = paking;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public Date getEx_date() {
		return ex_date;
	}
	public void setEx_date(Date ex_date) {
		this.ex_date = ex_date;
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
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", medicineName=" + medicineName + ", paking=" + paking + ", genericName="
				+ genericName + ", batchId=" + batchId + ", ex_date=" + ex_date + ", supplier=" + supplier + ", qty="
				+ qty + ", mrp=" + mrp + ", rate=" + rate + "]";
	}
	
	
	

}
