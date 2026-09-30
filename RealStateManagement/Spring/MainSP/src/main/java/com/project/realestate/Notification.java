package com.project.realestate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int notificationId;
	int propertyId;
	int tenantId;
	String notificationStatus;
	int landloardId;
	public Notification() {
		super();
	}
	public Notification(int notificationId, int propertyId, int tenantId, String notificationStatus, int landloardId) {
		super();
		this.notificationId = notificationId;
		this.propertyId = propertyId;
		this.tenantId = tenantId;
		this.notificationStatus = notificationStatus;
		this.landloardId = landloardId;
	}
	public int getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public int getTenantId() {
		return tenantId;
	}
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	public String getNotificationStatus() {
		return notificationStatus;
	}
	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}
	public int getLandloardId() {
		return landloardId;
	}
	public void setLandloardId(int landloardId) {
		this.landloardId = landloardId;
	}
	@Override
	public String toString() {
		return "Notification [notificationId=" + notificationId + ", propertyId=" + propertyId + ", tenantId="
				+ tenantId + ", notificationStatus=" + notificationStatus + ", landloardId=" + landloardId
				+ ", getNotificationId()=" + getNotificationId() + ", getPropertyId()=" + getPropertyId()
				+ ", getTenantId()=" + getTenantId() + ", getNotificationStatus()=" + getNotificationStatus()
				+ ", getLandloardId()=" + getLandloardId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
