package com.project.realestate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScheduleATourDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
//	String insert="insert into scheduleatour (name,email,phone,date,time,tourType,message,propertyId) values(?,?,?,?,?,?,?,?)";
	String insert="insert into scheduleatour (date,time,tourType,propertyId,visitorId) values(?,?,?,?,?)";
	String show="select * from scheduleatour";
	String showById="select * from scheduleatour where scheduleId=?";

	public void saveShedule(Date date, String time, String tourType, int propertyId, int visitorId) {
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(insert);
			ps.setDate(1, date);
			ps.setString(2, time);
			ps.setString(3, tourType);
			ps.setInt(4, propertyId);
			ps.setInt(5, visitorId);
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	String statementforgetShediulDetails="select scheduleatour.* from scheduleatour inner join notification on notification.tenantId=scheduleatour.visitorId where notification.notificationStatus='sheduled'" ;    
	List<ScheduleATour> alldata=new ArrayList<>();
	
	public List<ScheduleATour> getAllData(){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(statementforgetShediulDetails);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				alldata.add(new ScheduleATour(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getInt(10)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return alldata;
	}
	
	
	
	
}
