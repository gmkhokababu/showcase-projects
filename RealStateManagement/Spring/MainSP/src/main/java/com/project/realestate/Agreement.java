package com.project.realestate;

import java.sql.Date;

public class Agreement {

	int agreementId;
	int landlordId;
	int tenantId;
	double monthlyFair;
	double fiexdDepo;
	Date startDate;
	Date endDate;
	String agreementType;
	String rentalResponsibility;
	String ownerResponsibility;
	public Agreement() {
		super();
	}
	public Agreement(int agreementId, int landlordId, int tenantId, double monthlyFair, double fiexdDepo,
			Date startDate, Date endDate, String agreementType, String rentalResponsibility,
			String ownerResponsibility) {
		super();
		this.agreementId = agreementId;
		this.landlordId = landlordId;
		this.tenantId = tenantId;
		this.monthlyFair = monthlyFair;
		this.fiexdDepo = fiexdDepo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.agreementType = agreementType;
		this.rentalResponsibility = rentalResponsibility;
		this.ownerResponsibility = ownerResponsibility;
	}
	public int getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(int agreementId) {
		this.agreementId = agreementId;
	}
	public int getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}
	public int getTenantId() {
		return tenantId;
	}
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	public double getMonthlyFair() {
		return monthlyFair;
	}
	public void setMonthlyFair(double monthlyFair) {
		this.monthlyFair = monthlyFair;
	}
	public double getFiexdDepo() {
		return fiexdDepo;
	}
	public void setFiexdDepo(double fiexdDepo) {
		this.fiexdDepo = fiexdDepo;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getAgreementType() {
		return agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}
	public String getRentalResponsibility() {
		return rentalResponsibility;
	}
	public void setRentalResponsibility(String rentalResponsibility) {
		this.rentalResponsibility = rentalResponsibility;
	}
	public String getOwnerResponsibility() {
		return ownerResponsibility;
	}
	public void setOwnerResponsibility(String ownerResponsibility) {
		this.ownerResponsibility = ownerResponsibility;
	}
	@Override
	public String toString() {
		return "Agreement [agreementId=" + agreementId + ", landlordId=" + landlordId + ", tenantId=" + tenantId
				+ ", monthlyFair=" + monthlyFair + ", fiexdDepo=" + fiexdDepo + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", agreementType=" + agreementType + ", rentalResponsibility="
				+ rentalResponsibility + ", ownerResponsibility=" + ownerResponsibility + ", getAgreementId()="
				+ getAgreementId() + ", getLandlordId()=" + getLandlordId() + ", getTenantId()=" + getTenantId()
				+ ", getMonthlyFair()=" + getMonthlyFair() + ", getFiexdDepo()=" + getFiexdDepo() + ", getStartDate()="
				+ getStartDate() + ", getEndDate()=" + getEndDate() + ", getAgreementType()=" + getAgreementType()
				+ ", getRentalResponsibility()=" + getRentalResponsibility() + ", getOwnerResponsibility()="
				+ getOwnerResponsibility() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
