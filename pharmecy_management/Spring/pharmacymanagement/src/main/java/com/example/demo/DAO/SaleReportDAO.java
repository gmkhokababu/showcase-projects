package com.example.demo.DAO;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.SaleReport;

public class SaleReportDAO extends MySqlConnection{
	List<SaleReport> allSaleReport = new ArrayList<>();

	public List<SaleReport> saleReport(Date startDate, Date endDate, String s) {
		System.out.println("Date " + startDate + "\n End Date " + endDate + "\n Status " + s);
		if (s != null) {
			System.out.println("Date " + startDate + "\n End Date " + endDate + "\n Status " + s);
			try {
				con = DriverManager.getConnection(url, user, pass);

				PreparedStatement ps = con.prepareStatement(
						"select st.supllier,st.medicineName,st.genericName,st.batchId,c.name,c.phone,sa.qty,sa.rate,sa.total,sa.saleDate,sa.invoice_no from stock st join sale sa on sa.stockId = st.stockId join customer c on sa.customerId = c.customerId where sa.saleDate between ? and ? and (st.supllier=? or st.medicineName=? or st.genericName=? or st.batchId=?)");
				ps.setDate(1, startDate);
				ps.setDate(2, endDate);
				ps.setString(3, s);
				ps.setString(4, s);
				ps.setString(5, s);
				ps.setString(6, s);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					allSaleReport.add(new SaleReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getDouble(9),
							rs.getDate(10), rs.getString(11)));
				}
				con.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		if (s == null) {
			System.out.println("Date " + startDate + "\n End Date " + endDate + "\n Status " + s);
			try {
				con = DriverManager.getConnection(url, user, pass);

				PreparedStatement ps = con.prepareStatement(
						"select st.supllier,st.medicineName,st.genericName,st.batchId,c.name,c.phone,sa.qty,sa.rate,sa.total,sa.saleDate,sa.invoice_no from stock st join sale sa on sa.stockId = st.stockId join customer c on sa.customerId = c.customerId where sa.saleDate between ? and ?");
				ps.setDate(1, startDate);
				ps.setDate(2, endDate);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					allSaleReport.add(new SaleReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getDouble(9),
							rs.getDate(10), rs.getString(11)));
				}
				con.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return allSaleReport;

	}

}
