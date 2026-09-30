package com.project.realestate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountsDA {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into accounts ( userId, transactionId, amount, transactionType, date) values(?,?,?,?,?)";
	String show="select * from accounts";
	String showById="select * from accounts where idaccounts=?";
}
