package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnection {
	String url="jdbc:mysql://localhost:3306/pharmecy";
	String user="root";
	String pass="root";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
//	try {
//	Connection con=DriverManager.getConnection(url,user,pass);
//	}catch(Exception e) {
//		System.out.println("Connection Error =>"+e);
//	}
}
