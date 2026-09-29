package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.example.demo.Entity.Expired;
import com.example.demo.Entity.Purchase;

public class ExpiredDAO {
	

	public void saveExpired(Expired u) {
		try {
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/pharmecy","root","root");  
			
			PreparedStatement ps= con.prepareStatement("insert into expired values (?,?,?,?,?,?,?");
			
//			
//			int expiredId;
//			int stockId;
//			int qty;
//			double rate ;
//			double total ;
//			Date saleDate ;
//			int customerId ;
//			
			
			
			ps.setInt(1, u.getExpiredId());
			ps.setInt(2, u.getStockId());
			ps.setInt(3, u.getQty());
			ps.setDouble(4, u.getRate());
			ps.setDouble(5, u.getTotal());
			ps.setDate(6, u.getSaleDate());
			ps.setInt(7, u.getCustomerId());
			
			ps.executeUpdate();
			
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println("saveExpired "+e);
		}
	}

}
