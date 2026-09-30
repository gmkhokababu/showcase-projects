 package com.project.realestate;

import java.sql.Date;

public class ScheduleATour {
	int scheduleId;
	String name;
	String email;
	String phone;
	Date date;
	String time;
	String tourType;
	String message;
	int propertyId;
	int visitorId;
	
	public ScheduleATour() {
		super();
	}

	public ScheduleATour(int scheduleId, String name, String email, String phone, Date date, String time,
			String tourType, String message, int propertyId, int visitorId) {
		super();
		this.scheduleId = scheduleId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.date = date;
		this.time = time;
		this.tourType = tourType;
		this.message = message;
		this.propertyId = propertyId;
		this.visitorId = visitorId;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTourType() {
		return tourType;
	}

	public void setTourType(String tourType) {
		this.tourType = tourType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	@Override
	public String toString() {
		return "ScheduleATour [scheduleId=" + scheduleId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", date=" + date + ", time=" + time + ", tourType=" + tourType + ", message=" + message
				+ ", propertyId=" + propertyId + ", visitorId=" + visitorId + ", getScheduleId()=" + getScheduleId()
				+ ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ ", getDate()=" + getDate() + ", getTime()=" + getTime() + ", getTourType()=" + getTourType()
				+ ", getMessage()=" + getMessage() + ", getPropertyId()=" + getPropertyId() + ", getVisitorId()="
				+ getVisitorId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
