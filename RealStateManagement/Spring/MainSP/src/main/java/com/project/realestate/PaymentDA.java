package com.project.realestate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PaymentDA {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into payment (customerId, propertyId, totalFair, pay, due, status, month, year, deposit) values(?,?,?,?,?,?,?,?,?)";
	String show="select * from payment";
	String showById="select * from payment where id=?";
}
