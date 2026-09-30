package com.project.university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDA {
	//--------------------------Login-------------------------------
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/university";
	String user="root";
	String pass="abu420";
	String loginStatement="SELECT * FROM users WHERE user_name=? AND password=?";
	
	public User login(String userName,String Password) {
		User users=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(loginStatement);
			ps.setString(1, userName);
			ps.setString(2, Password);
			rs=ps.executeQuery();
			while(rs.next()) {
				users=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		}catch(Exception e) {
			
		}
		
		return users;
	}

}
