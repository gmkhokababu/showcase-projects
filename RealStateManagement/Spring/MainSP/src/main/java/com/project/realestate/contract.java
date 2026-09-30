package com.project.realestate;

import java.sql.Date;

public class contract {
	int contractId;
	int ownerId;
	int buyerId;
	String serviceType;
	Date signDate;
	String attachment;
	int propertyId;
	
	
	public contract() {
		super();
	}


	public contract(int contractId, int ownerId, int buyerId, String serviceType, Date signDate, String attachment,
			int propertyId) {
		super();
		this.contractId = contractId;
		this.ownerId = ownerId;
		this.buyerId = buyerId;
		this.serviceType = serviceType;
		this.signDate = signDate;
		this.attachment = attachment;
		this.propertyId = propertyId;
	}


	public int getContractId() {
		return contractId;
	}


	public void setContractId(int contractId) {
		this.contractId = contractId;
	}


	public int getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}


	public int getBuyerId() {
		return buyerId;
	}


	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}


	public String getServiceType() {
		return serviceType;
	}


	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}


	public Date getSignDate() {
		return signDate;
	}


	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}


	public String getAttachment() {
		return attachment;
	}


	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}


	public int getPropertyId() {
		return propertyId;
	}


	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}


	@Override
	public String toString() {
		return "contract [contractId=" + contractId + ", ownerId=" + ownerId + ", buyerId=" + buyerId + ", serviceType="
				+ serviceType + ", signDate=" + signDate + ", attachment=" + attachment + ", propertyId=" + propertyId
				+ ", getContractId()=" + getContractId() + ", getOwnerId()=" + getOwnerId() + ", getBuyerId()="
				+ getBuyerId() + ", getServiceType()=" + getServiceType() + ", getSignDate()=" + getSignDate()
				+ ", getAttachment()=" + getAttachment() + ", getPropertyId()=" + getPropertyId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
