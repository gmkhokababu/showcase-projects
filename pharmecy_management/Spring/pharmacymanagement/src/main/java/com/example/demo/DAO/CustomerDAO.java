package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.demo.Entity.Customer;

public class CustomerDAO {

	int customerId;
	String name;
	String phone;
	String email;
	String address;



	public void createCustomer(Customer u) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy","root","root");

			PreparedStatement ps= con.prepareStatement("insert into customer values (?,?,?,?,?)");
			PreparedStatement ps1= con.prepareStatement("select * from customer where phone=?");

			ps.setInt(1, u.getCustomerId());
			ps.setString(2, u.getName());
			ps.setString(3, u.getPhone());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getAddress());
			ps.executeUpdate();
			con.close();
		}catch(Exception e ) {
			System.out.println(e);
		}
	}
	
	Customer customer;
	public Customer getCustomerByPhoneNo(String p) {
		customer=null;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy","root","root");
			PreparedStatement ps= con.prepareStatement("select * from customer where phone=?");
			ps.setString(1, p);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				customer=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
			con.close();
		}catch(Exception e ) {
			System.out.println(e);
		}
		
		return customer;
	}
	
	
	

}
