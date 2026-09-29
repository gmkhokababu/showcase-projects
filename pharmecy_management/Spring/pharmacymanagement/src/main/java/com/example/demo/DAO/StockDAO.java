package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.Sale;
import com.example.demo.Entity.Stock;

public class StockDAO {

//	int stockId;
//	int paking;
//	String genericName;
//	String batchId;
//	Date ex_date;
//	String supplier;
//	int qty;
//	String mrp;
//	double rate;

	// =======================================new stock================================
	Stock s;

	public void addNewStock(List<Stock> u) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy", "root", "root");
			for (int i = 0; i < u.size(); i++) {
				s = null;
				PreparedStatement psGetdata = con.prepareStatement("select * from stock where batchId=?");
				psGetdata.setString(1, u.get(i).getBatchId());
				ResultSet rs = psGetdata.executeQuery();
				while (rs.next()) {
					s = new Stock(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
							rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getDouble(10));
				}
				System.out.println(s);

				if (s != null) {
					int qty = s.getQty() + (u.get(i).getQty());
					System.out.println("Total quantity => " + qty);
					PreparedStatement ps_update = con.prepareStatement("update stock set qty=? where batchId=?");
					ps_update.setInt(1, qty);
					ps_update.setString(2, u.get(i).getBatchId());
					int check = ps_update.executeUpdate();
					System.out.println("Update =>" + check);

				} else if (s == null) {
					PreparedStatement ps = con.prepareStatement("insert into stock values (?,?,?,?,?,?,?,?,?,?)");

					ps.setInt(1, u.get(i).getStockId());
					ps.setString(2, u.get(i).getMedicineName());
					ps.setInt(3, u.get(i).getPaking());
					ps.setString(4, u.get(i).getGenericName());
					ps.setString(5, u.get(i).getBatchId());
					ps.setDate(6, u.get(i).getEx_date());
					ps.setString(7, u.get(i).getSupplier());
					ps.setInt(8, u.get(i).getQty());
					ps.setString(9, u.get(i).getMrp());
					ps.setDouble(10, u.get(i).getRate());
					ps.executeUpdate();
				}

			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// =======================================All stock data================================
	List<Stock> allStockData;

	public List<Stock> getAllStockData() {
		allStockData = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy", "root", "root");
			PreparedStatement psGetdata = con.prepareStatement("select * from stock where qty>0 and ex_date>CURDATE()");
			ResultSet rs = psGetdata.executeQuery();
			while (rs.next()) {
				allStockData.add(new Stock(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
								rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getDouble(10)));
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return allStockData;
	}

	// =======================================All stock data by category================================
	List<Stock> allStockDataByCatagory;

	public List<Stock> getAllStockDataByCatagory(String s) {
		allStockDataByCatagory = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy", "root", "root");
			PreparedStatement ps = con.prepareStatement(
					"select * from stock where medicineName=? or genericName=? or batchId=? or supllier=?");
			ps.setString(1, s);
			ps.setString(2, s);
			ps.setString(3, s);
			ps.setString(4, s);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				allStockDataByCatagory
						.add(new Stock(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
								rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getDouble(10)));
			}
			rs = ps.executeQuery();
			System.out.println(rs);
			System.out.println(allStockDataByCatagory);
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return allStockDataByCatagory;
	}

	// =======================================Update Sale Data================================

	Stock stock;

	public void updateSaleData(List<Sale> u) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy", "root", "root");

			for (int i = 0; i < u.size(); i++) {
				s = null;
				PreparedStatement psGetdata = con.prepareStatement("select * from stock where stockId=?");
				psGetdata.setInt(1, u.get(i).getStockId());
				ResultSet rs = psGetdata.executeQuery();
				while (rs.next()) {
					stock = new Stock(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
							rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getDouble(10));
				}
				System.out.println(stock);

				if (stock != null) {
					int qty = stock.getQty() - (u.get(i).getQty());
					System.out.println("Total quantity => " + qty);
					PreparedStatement ps_update = con.prepareStatement("update stock set qty=? where stockId=?");
					ps_update.setInt(1, qty);
					ps_update.setInt(2, u.get(i).getStockId());
					int check = ps_update.executeUpdate();
					System.out.println("Update =>" + check);

				}
			}
			con.close();

		} catch (Exception e) {
			System.out.println("Sale Stock Update" + e);
		}
	}
	
	
	public List<Stock> getStock(){
		Stock s=null;
		List<Stock> getStockByExDate=new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy", "root", "root");

			PreparedStatement stm=con.prepareStatement("select * from stock where ex_date>curdate()");
			
			ResultSet rs= stm.executeQuery();
			while(rs.next()) {

				
				getStockByExDate.add(new Stock(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getString(9),rs.getDouble(10)));
				
			}
			
			for(int i=0; i<getStockByExDate.size();i++) {
				try {
					Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy", "root", "root");

//					purchasId, , supllierId, medicineName, paking, genericName, batchId, exDate, qty, mrp, purchaseRate
					PreparedStatement stm2=con.prepareStatement("insert into expired values(?,?,?,?,?,?,?,?,?)");
					
					stm2.setString(1, getStockByExDate.get(i).getMedicineName());
					stm2.setInt(2, getStockByExDate.get(i).getPaking());
					stm2.setString(3, getStockByExDate.get(i).getGenericName());
					stm2.setString(4, getStockByExDate.get(i).getBatchId());
					stm2.setDate(5, getStockByExDate.get(i).getEx_date());
					stm2.setDouble(6,getStockByExDate.get(i).getQty());

					
				}catch(Exception e) {
					
				}
			}
			
		}catch(Exception e) {
			
		}
		return null;
	}

}
