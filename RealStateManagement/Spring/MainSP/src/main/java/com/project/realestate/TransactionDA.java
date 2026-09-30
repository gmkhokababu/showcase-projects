package com.project.realestate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransactionDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into transaction (transactionId, payId, date, amount) values(?,?,?,?)";
	String show="select * from transaction";
	String showById="select * from transaction where transactionId=?";
}
