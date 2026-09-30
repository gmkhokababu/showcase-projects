package com.project.realestate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class contractDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into contract (ownerId, buyerId, serviceType, signDate, attachment, propertyId) values(?,?,?,?,?,?)";
	String show="select * from contract";
	String showById="select * from contract where contractId=?";
}
