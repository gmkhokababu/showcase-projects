package com.example.demo.DAO;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.PurchaseReport;

public class PurchaseReportDAO extends MySqlConnection {

	List<PurchaseReport> allPurchaseReport = new ArrayList<>();

	public List<PurchaseReport> purchaseReport(Date startDate, Date endDate, String s, String invoice) {
		int supplierId = 0;
		if (s == null && invoice == null) {
			try {
				con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps1 = con.prepareStatement("select supllierId from supplier where name=?");

				ps1.setString(1, s);

				ResultSet rs1 = ps1.executeQuery();
				System.out.println("Works get supplier");
				while (rs1.next()) {
					supplierId = rs1.getInt(1);
				}
				PreparedStatement ps = con.prepareStatement(
						"select p.pursDate,s.name,p.medicineName,p.paking,p.genericName,p.batchId,p.exDate,p.qty,p.mrp,p.purchaseRate,p.invoice,p.purshasId from purshase p join supplier s on s.supllierId = p.supllierId  where p.pursDate between ? and ? ");

				ps.setDate(1, startDate);
				ps.setDate(2, endDate);
//				ps.setInt(3, supplierId);
//				ps.setString(4, s);
//				ps.setString(5, s);
//				ps.setString(6, s);
//				ps.setString(7, invoice);
				System.out.println("Works");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					allPurchaseReport.add(new PurchaseReport(rs.getDate(1), rs.getString(2), rs.getString(3),
							rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getInt(8), rs.getInt(9),
							rs.getDouble(10), rs.getString(11),rs.getInt(12)));
				}
				con.close();

			} catch (Exception e) {
				System.out.println("Purchase Report Exception " + e);
			}
		}else if (s != null && invoice != null) {
			try {
				con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps1 = con.prepareStatement("select supllierId from supplier where name=?");

				ps1.setString(1, s);

				ResultSet rs1 = ps1.executeQuery();
				System.out.println("Works get supplier");
				while (rs1.next()) {
					supplierId = rs1.getInt(1);
				}
				PreparedStatement ps = con.prepareStatement(
						"select p.pursDate,s.name,p.medicineName,p.paking,p.genericName,p.batchId,p.exDate,p.qty,p.mrp,p.purchaseRate,p.invoice,p.purshasId from purshase p join supplier s on s.supllierId = p.supllierId  where p.pursDate between ? and ? and (p.supllierId=? or p.medicineName=? or p.genericName=? or p.batchId=? and p.invoice=?)");

				ps.setDate(1, startDate);
				ps.setDate(2, endDate);
				ps.setInt(3, supplierId);
				ps.setString(4, s);
				ps.setString(5, s);
				ps.setString(6, s);
				ps.setString(7, invoice);
				System.out.println("Works");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					allPurchaseReport.add(new PurchaseReport(rs.getDate(1), rs.getString(2), rs.getString(3),
							rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getInt(8), rs.getInt(9),
							rs.getDouble(10), rs.getString(11),rs.getInt(12)));
				}
				con.close();

			} catch (Exception e) {
				System.out.println("Purchase Report Exception " + e);
			}
		}else if (s != null || invoice != null) {
			try {
				con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps1 = con.prepareStatement("select supllierId from supplier where name=?");

				ps1.setString(1, s);

				ResultSet rs1 = ps1.executeQuery();
				System.out.println("Works get supplier");
				while (rs1.next()) {
					supplierId = rs1.getInt(1);
				}
				PreparedStatement ps = con.prepareStatement(
						"select p.pursDate,s.name,p.medicineName,p.paking,p.genericName,p.batchId,p.exDate,p.qty,p.mrp,p.purchaseRate,p.invoice,p.purshasId from purshase p join supplier s on s.supllierId = p.supllierId  where p.pursDate between ? and ? and (p.supllierId=? or p.medicineName=? or p.genericName=? or p.batchId=? or p.invoice=?)");

				ps.setDate(1, startDate);
				ps.setDate(2, endDate);
				ps.setInt(3, supplierId);
				ps.setString(4, s);
				ps.setString(5, s);
				ps.setString(6, s);
				ps.setString(7, invoice);
				System.out.println("Works");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					allPurchaseReport.add(new PurchaseReport(rs.getDate(1), rs.getString(2), rs.getString(3),
							rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getInt(8), rs.getInt(9),
							rs.getDouble(10), rs.getString(11),rs.getInt(12)));
				}
				con.close();

			} catch (Exception e) {
				System.out.println("Purchase Report Exception " + e);
			}
		}
		return allPurchaseReport;
	}

	// ========================================return
	// method=========================================
	List<PurchaseReport> allPurchaseReportforReturn = new ArrayList<>();

	public List<PurchaseReport> purchaseReportforReturn(String s) {
//		int supplierId = 0;
		try {
			con = DriverManager.getConnection(url, user, pass);

			PreparedStatement ps = con.prepareStatement(
					"select p.pursDate,s.name,p.medicineName,p.paking,p.genericName,p.batchId,p.exDate,p.qty,p.mrp,p.purchaseRate,p.invoice,p.purshasId from purshase p join supplier s on s.supllierId = p.supllierId  where p.batchId=? or p.invoice=?");

			ps.setString(1, s);
			ps.setString(2, s);
			System.out.println("Works");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				allPurchaseReportforReturn.add(new PurchaseReport(rs.getDate(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getInt(8), rs.getInt(9),
						rs.getDouble(10), rs.getString(11),rs.getInt(12)));
			}
			con.close();

		} catch (Exception e) {
			System.out.println("Purchase Report Exception " + e);
		}
		System.out.println(allPurchaseReportforReturn);
		return allPurchaseReportforReturn;
	}
}
