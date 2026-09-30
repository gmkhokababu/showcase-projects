package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TenantDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
//	String loginStatement="SELECT * FROM users WHERE email=? OR userName=? AND password=?";
	String createuser="INSERT INTO tenant(name,presentAddress,permanentAddress,phoneNo,email,occupation,propertyId) VALUES(?,?,?,?,?,?,?)";
	
	
	public Tenant create(Tenant u) {
//		Users users=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(createuser);
			ps.setString(1, u.getName());
			ps.setString(2, u.getPresentAddress());
			ps.setString(3, u.getPermanentAddress());
			ps.setString(4, u.getPhoneNo());
			ps.setString(5, u.getEmail());
			ps.setString(6, u.getOccupation());
			ps.setString(7, u.getPropertyId());
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

		return u;
	}
	
	
	
	
	//============================Get tenant by phone no======================================
	
	String getTenantByPhoneNO="select * from tenant where phoneNo=?";
	Tenant t;
	public Tenant getTenant(String phone) {
		t=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(getTenantByPhoneNO);
			ps.setString(1, phone);
			rs=ps.executeQuery();
			while(rs.next()) {
				t=new Tenant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		return t;
	}
	
	//============================Get tenant by phone no======================================
	
		String getTenantById="select * from tenant where id=?";
		
		public Tenant getTenantbyId(int id) {
			t=null;
			try {
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(getTenantById);
				ps.setInt(1, id);
				rs=ps.executeQuery();
				while(rs.next()) {
					t=new Tenant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				}
				System.out.println("Tenant id=> "+t);
			}catch(Exception e) {
				System.out.println(e);
				
			}
			
			
			return t;
		}

}
