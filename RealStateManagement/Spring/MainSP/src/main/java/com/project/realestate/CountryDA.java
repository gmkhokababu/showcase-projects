package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CountryDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into property (propertyType,location,size,amenities,landlord_id,price,saleType,type) values(?,?,?,?,?,?,?,?)";
	String show="select * from country";

	public List<Country> allcountry(){
		List<Country> country=new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(show);
			rs=ps.executeQuery();
			while(rs.next()) {
				country.add( new Country(rs.getInt(1),rs.getString(2)));
			}
		}catch(Exception e) {
			
		}
		
		return country;
	}
}
