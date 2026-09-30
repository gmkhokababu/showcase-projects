package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DivisionDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into property (propertyType,location,size,amenities,landlord_id,price,saleType,type) values(?,?,?,?,?,?,?,?)";
	String show="select * from division";
	String showByCountryId="select * from division where countryId=?";
	
	public List<Division> alldivision(){
		List<Division> division=new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(show);
			rs=ps.executeQuery();
			while(rs.next()) {
				division.add( new Division(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
		}catch(Exception e) {
			
		}
		
		return division;
	}
	
	//------------------------------------Devision By Id---------------------------------
	public List<Division> divisionById(int id){
		List<Division> division=new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(showByCountryId);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				division.add( new Division(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
		}catch(Exception e) {
			
		}
		
		return division;
	}

}
