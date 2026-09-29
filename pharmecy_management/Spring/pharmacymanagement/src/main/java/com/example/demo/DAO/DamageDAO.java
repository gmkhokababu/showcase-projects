package com.example.demo.DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.Entity.Damage;
import com.example.demo.Entity.DamageList;

public class DamageDAO extends MySqlConnection {

	public void saveDamage(List<Damage> u) {
		try {
			con = DriverManager.getConnection(url, user, pass);
//			damageId, damageDate, supplier, medicineName, paking, genericName, batchId, exDate, pursDate, invoice, returnQty, purchaseRate, status, purshasId
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date damageDate = java.sql.Date.valueOf(dateFormat.format(date));

			int stockid = 0;
			int stockQty = 0;
			for (int i = 0; i < u.size(); i++) {
				PreparedStatement ps = con.prepareStatement("insert into damage values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, u.get(i).getDamageId());
				ps.setDate(2, damageDate);
				ps.setString(3, u.get(i).getSupplier());
				ps.setString(4, u.get(i).getMedicineName());
				ps.setInt(5, u.get(i).getPaking());
				ps.setString(6, u.get(i).getGenericName());
				ps.setString(7, u.get(i).getBatchId());
				ps.setDate(8, u.get(i).getExDate());
				ps.setDate(9, u.get(i).getPursDate());
				ps.setString(10, u.get(i).getInvoice());
				ps.setInt(11, u.get(i).getReturnQty());
				ps.setDouble(12, u.get(i).getPurchaseRate());
				ps.setString(13, u.get(i).getStatus());
				ps.setInt(14, u.get(i).getPurshasId());

				PreparedStatement psstock = con.prepareStatement("select stockId, qty from stock where batchId = ?");
				psstock.setString(1, u.get(i).getBatchId());
				rs = psstock.executeQuery();
//			System.out.println("Stock Id "+stockid);
				while (rs.next()) {
					stockid = rs.getInt(1);
					stockQty = rs.getInt(2);
				}
				int newStockQty = stockQty - u.get(i).getReturnQty();
				PreparedStatement psupdatestockqty = con.prepareStatement("update stock set qty=? where stockId=?");
				psupdatestockqty.setInt(1, newStockQty);
				psupdatestockqty.setInt(2, stockid);

				psupdatestockqty.executeUpdate();
				System.out.println("Stock Id " + stockid);
				System.out.println("Stock qty " + stockQty);
				System.out.println("new Stock qty " + newStockQty);

				ps.executeUpdate();
			}
			con.close();

		} catch (Exception e) {
			System.out.println("saveDamage " + e);
		}
	}

	// ============================================== get damage summery

	List<DamageList> damageList;

	public List<DamageList> getdamageList() {
		damageList = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, pass);
			ps = con.prepareStatement(
					"SELECT  d.damageId,d.damageDate,d.supplier,d.medicineName,d.paking,d.genericName,d.batchId,d.exDate,d.pursDate,d.invoice,d.returnQty,d.purchaseRate,d.status,   d.purshasId,t.total FROM damage d JOIN (SELECT invoice, COUNT(*) AS total FROM damage GROUP BY invoice) t ON d.invoice = t.invoice GROUP BY d.invoice ORDER BY d.invoice;");
			rs = ps.executeQuery();
//			(int damageId, Date damageDate, String supplier, String medicineName, int paking,
//					String genericName, String batchId, Date exDate, Date pursDate, String invoice, int returnQty,
//					double purchaseRate, String status, int purshasId, int total
			while (rs.next()) {
				damageList.add(new DamageList(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getString(10),
						rs.getInt(11), rs.getDouble(12), rs.getString(13), rs.getInt(14), rs.getInt(15)));
			}

		} catch (Exception e) {
			System.out.println("Damage List " + e);
		}
		return damageList;
	}

	// ==========================================get damage details
	// ============================

	List<Damage> getDamageListDetails;

	public List<Damage> getDamageList(String i) {
		getDamageListDetails = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, pass);
			ps = con.prepareStatement("select * from damage where invoice=?");
			ps.setString(1, i);
			rs = ps.executeQuery();
			while (rs.next()) {
//				(int damageId, Date damageDate, String supplier, String medicineName, int paking, String genericName,
//						String batchId, Date exDate, Date pursDate, String invoice, int returnQty, double purchaseRate,
//						String status, int purshasId)
				getDamageListDetails.add(new Damage(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getString(10),
						rs.getInt(11), rs.getDouble(12), rs.getString(13), rs.getInt(14)));
			}
		} catch (Exception e) {
			System.out.println("get Damage List " + e);
		}

		return getDamageListDetails;
	}
}
