package com.example.demo.DAO;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.OrderDetails;

public class OrderDetailsDAO  extends MySqlConnection{
	List<OrderDetails> getAllOrderDetails;
	public List<OrderDetails> getAllOrderDetails(String invoice, String status) {
		
		getAllOrderDetails=new ArrayList<>();
		
		try {
			con=DriverManager.getConnection( url,user,pass);  

//			
			ps= con.prepareStatement("select o.invoice_no, s.medicineName, s.genericName,s.supllier,o.qty,o.rate,o.total,c.name,c.phone, c.address, s.stockId, o.order_id,o.saleDate,o.status,c.customerId from `order` o join stock s on o.stockId=s.stockId join customer c on o.customerId=c.customerId where o.invoice_no=? and o.status=?");

			ps.setString(1, invoice);
			ps.setString(2, status);
			rs=ps.executeQuery();
			while(rs.next()) {
				getAllOrderDetails.add(new OrderDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDouble(6),rs.getDouble(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12),rs.getDate(13),rs.getString(14),rs.getInt(15)));
			}
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println(e);
		}
		System.out.println(getAllOrderDetails);
		return getAllOrderDetails;
	}

}
