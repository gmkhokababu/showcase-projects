package com.example.demo.Entity;

import java.sql.Date;

public class Purchase {
	int purshasId;
	Date pursDate;
	int supllierId;
	String medicineName;
	int paking;
	String genericName;
	String batchId;
	Date exDate;
	int qty;
	String mrp;
	double purchaseRate;
	
	String invoice;

	public Purchase() {
		super();
	}

	public Purchase(int purshasId, Date pursDate, int supllierId, String medicineName, int paking, String genericName,
			String batchId, Date exDate, int qty, String mrp, double purchaseRate, String invoice) {
		super();
		this.purshasId = purshasId;
		this.pursDate = pursDate;
		this.supllierId = supllierId;
		this.medicineName = medicineName;
		this.paking = paking;
		this.genericName = genericName;
		this.batchId = batchId;
		this.exDate = exDate;
		this.qty = qty;
		this.mrp = mrp;
		this.purchaseRate = purchaseRate;
		this.invoice = invoice;
	}

	public int getPurshasId() {
		return purshasId;
	}

	public void setPurshasId(int purshasId) {
		this.purshasId = purshasId;
	}

	public Date getPursDate() {
		return pursDate;
	}

	public void setPursDate(Date pursDate) {
		this.pursDate = pursDate;
	}

	public int getSupllierId() {
		return supllierId;
	}

	public void setSupllierId(int supllierId) {
		this.supllierId = supllierId;
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

	public Date getExDate() {
		return exDate;
	}

	public void setExDate(Date exDate) {
		this.exDate = exDate;
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

	public double getPurchaseRate() {
		return purchaseRate;
	}

	public void setPurchaseRate(double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	@Override
	public String toString() {
		return "Purchase [purshasId=" + purshasId + ", pursDate=" + pursDate + ", supllierId=" + supllierId
				+ ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName
				+ ", batchId=" + batchId + ", exDate=" + exDate + ", qty=" + qty + ", mrp=" + mrp + ", purchaseRate="
				+ purchaseRate + ", invoice=" + invoice + "]";
	}
	

	
}
