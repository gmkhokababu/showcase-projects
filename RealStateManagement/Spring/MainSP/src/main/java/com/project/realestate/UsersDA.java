package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsersDA {
	
	
	//------------------Login----------------
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String loginStatement="SELECT * FROM users WHERE email=? OR userName=? AND password=?";
	String createuser="INSERT INTO users(name,email,userName,password,role) VALUES(?,?,?,?,?)";
	
	public Users login(String userName, String password) {
		Users users=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(loginStatement);
			ps.setString(1, userName);
			ps.setString(2, userName);
			ps.setString(3, password);
			rs=ps.executeQuery();
			while(rs.next()) {
				users=new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
		}catch(Exception e) {
			
		}

		return users;
	}
//	"INSERT INTO users(name,email,userName,password,role) VALUES(?,?,?,?,?)"
	public Users create(Users u) {
//		Users users=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(createuser);
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getUserName());
			ps.setString(4, u.getPassword());
			ps.setString(5, u.getRole());
			ps.executeUpdate();
			
		}catch(Exception e) {
			
		}

		return u;
	}

}
