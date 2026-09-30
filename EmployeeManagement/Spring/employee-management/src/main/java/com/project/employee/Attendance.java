package com.project.employee;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int roleId;
	@ManyToOne
    @JoinColumn(name = "employee_id")
	Employees employeeId;
	Date date;
	String status;
	public Attendance() {
		super();
	}
	public Attendance(int roleId, Employees employeeId, Date date, String status) {
		super();
		this.roleId = roleId;
		this.employeeId = employeeId;
		this.date = date;
		this.status = status;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public Employees getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Employees employeeId) {
		this.employeeId = employeeId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Attendance [roleId=" + roleId + ", employeeId=" + employeeId + ", date=" + date + ", status=" + status
				+ ", getRoleId()=" + getRoleId() + ", getEmployeeId()=" + getEmployeeId() + ", getDate()=" + getDate()
				+ ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
