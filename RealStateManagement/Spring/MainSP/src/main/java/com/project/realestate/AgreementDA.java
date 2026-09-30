package com.project.realestate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AgreementDA {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into scheduleatour (landlordId, tenantId, monthlyFair, fiexdDepo, startDate, endDate, agreementType, rentalResponsibility, ownerResponsibility) values(?,?,?,?,?,?,?,?,?)";
	String show="select * from scheduleatour";
	String showById="select * from scheduleatour where scheduleId=?";
	
	public void makeAgreement() {
		
	}
}
