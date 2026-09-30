package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PropertyDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into property (propertyType,location,size,amenities,landlord_id,price,saleType,type) values(?,?,?,?,?,?,?,?)";
	String show="select * from property";
	
	public Property save(Property p) {
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(insert);
//			ps.setInt(1, p.getId());
			ps.setString(1, p.getType());
			ps.setString(2, p.getLocation());
			ps.setInt(3, p.getSize());
			ps.setString(4, p.getAmenities());
//			ps.setString(5, p.getStatus());
			ps.setInt(5, p.getLandlordId());
			ps.setInt(6, p.getPrice());
			ps.setString(7, p.getSaleType());
			ps.setString(8, p.getLandtype());
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			
		}
		return p;
	}
	
	//-----------------------------Show all property------------------------------------
	
	public List<Property> allproperty(){
		List<Property> property=new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(show);
			rs=ps.executeQuery();
			while(rs.next()) {
				property.add( new Property(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getString(10)));
			}
		}catch(Exception e) {
			
		}
		
		return property;
	}

}
