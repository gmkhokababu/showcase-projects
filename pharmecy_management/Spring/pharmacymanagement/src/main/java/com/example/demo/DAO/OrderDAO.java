package com.example.demo.DAO;

import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.example.demo.Entity.Order;

public class OrderDAO extends MySqlConnection{

	public void saveOrder(List<Order> order) {
		Date date=new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String invoice=dateFormat.format(date);
//		Calendar d=Calendar.getInstance();
//		System.out.println(d);
//		System.out.println("Year "+d.get(Calendar.YEAR));
//		System.out.println("Month "+d.get(Calendar.MONTH));
//		System.out.println("Sec "+d.get(Calendar.SECOND));

//		String invoice=String.valueOf(d.get(Calendar.YEAR))+String.valueOf(d.get(Calendar.MONTH))+String.valueOf(d.get(Calendar.SECOND));
		System.out.println("Invoice = "+invoice);
		try {
			con=DriverManager.getConnection(url,user,pass);
			for (int i=0;i<order.size();i++) {
				ps=con.prepareStatement("insert into `order` values (?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, order.get(i).getOrder_id());
				ps.setInt(2, order.get(i).getStockId());
				ps.setInt(3, order.get(i).getQty());
				ps.setDouble(4, order.get(i).getRate());
				ps.setDouble(5, order.get(i).getTotal());
				ps.setDate(6, order.get(i).getSaleDate());
				ps.setInt(7, order.get(i).getCustomerId());
				ps.setString(8, invoice);
				ps.setString(9, order.get(i).getStatus());
				ps.executeUpdate();
			}
		}catch(Exception e) {
			System.out.println("Save Order => "+e);
		}
		
	}
	
	
	
	
}
