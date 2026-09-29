package com.example.demo.DAO;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.UserOrder;

public class UserOrderDAO extends MySqlConnection{

	List<UserOrder> userOrder;
	public List<UserOrder> getUserOrder(String s) {
		
		userOrder=new ArrayList<>();
		
		try {
			con=DriverManager.getConnection( url,user,pass);  
			
			ps= con.prepareStatement("SELECT o.order_id, o.invoice_no, c.name, c.phone, c.address,o.saleDate, t.total FROM (SELECT invoice_no, COUNT(*) AS total FROM `order` WHERE status = ? GROUP BY invoice_no) t JOIN `order` o ON o.invoice_no = t.invoice_no JOIN customer c ON o.customerId = c.customerId WHERE o.status = ? GROUP BY o.invoice_no, c.name, c.phone, c.address, t.total ORDER BY o.invoice_no;");
//			ps.setDate(1, startDate);
//			ps.setDate(2, endDate);
//			ps.setString(3, s);
			ps.setString(1, s);
			ps.setString(2, s);
//			ps.setString(6, s);

			rs=ps.executeQuery();
			while(rs.next()) {
				userOrder.add(new UserOrder(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7)));
			}
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println(e);
		}
		System.out.println(userOrder);
		return userOrder;
	}
	
	
	
	public void updateOrderStatus(int id, String status) {
		try {
			con=DriverManager.getConnection( url,user,pass);  
			
			ps= con.prepareStatement("update `order` set status=? where order_id=?");
//			ps.setDate(1, startDate);
//			ps.setDate(2, endDate);
//			ps.setString(3, s);
			ps.setString(1, status);
			ps.setInt(2, id);
//			ps.setString(6, s);

			ps.executeUpdate();
			
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println("Update status exception : "+e);
		}
	}
	

}
