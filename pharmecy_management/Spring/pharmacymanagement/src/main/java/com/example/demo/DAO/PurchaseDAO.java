package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.example.demo.Entity.Purchase;

public class PurchaseDAO {
//	int purshasId;
//	Date pursDate;
//	int supllierId;
//	String medicineName;
//	int paking;
//	String genericName;
//	String batchId;
//	Date exDate;
//	int qty;
//	String mrp;
//	double purchaseRate;
//	String invoice;

	public void createPurchase(List<Purchase> u) {
		try {
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/pharmecy","root","root");  
			for(int i=0;i<u.size();i++) {
			PreparedStatement ps= con.prepareStatement("insert into purshase values (?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, u.get(i).getPurshasId());
			ps.setDate(2, u.get(i).getPursDate());
			ps.setInt(3, u.get(i).getSupllierId());
			ps.setString(4, u.get(i).getMedicineName());
			ps.setInt(5, u.get(i).getPaking());
			ps.setString(6, u.get(i).getGenericName());
			ps.setString(7, u.get(i).getBatchId());
			ps.setDate(8, u.get(i).getExDate());
			ps.setInt(9, u.get(i).getQty());
			ps.setString(10, u.get(i).getMrp());
			ps.setDouble(11, u.get(i).getPurchaseRate());
			ps.setString(12, u.get(i).getInvoice());
			ps.executeUpdate();
			}
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println("Save new Purchase"+e);
		}
	}


}
