package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NotificationDA {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
//	String insert="insert into property (propertyType,location,size,amenities,landlord_id,price,saleType,type) values(?,?,?,?,?,?,?,?)";
//	String show="select * from property";
	String notification="select * from notification where notificationStatus='requested'";
	
	public List<Notification> allNotification(){
		List<Notification> notifications=new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(notification);
			rs=ps.executeQuery();
			while(rs.next()) {
				notifications.add( new Notification(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5)));
			}
		}catch(Exception e) {
			
		}
		
		return notifications;
	}
	
	
	//=============================create Notification================================================
	
	String insert="insert into notification (propertyId, tenantId, landloardId) values(?,?,?)";
	public void SaveNotification(String phone, int landloardId){
		TenantDA da = new TenantDA();
		Tenant t =da.getTenant(phone);
		try {
			System.out.println("Tenant =."+t);
			int propertyId=Integer.parseInt(t.getPropertyId());
			System.out.println("propertyId =."+propertyId);
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(insert);
			ps.setInt(1, propertyId);
			ps.setInt(2, t.getId());
			ps.setInt(3, landloardId);
		int i=	ps.executeUpdate();
		System.out.println("save =."+i+" Row");
			
		}catch(Exception e) {
			System.out.println("Save Notification =."+e);
		}
		
		
	}
	
	//=============================Update Notification================================================
	
	String updateNotification="update notification set notificationStatus=? where notificationId=?";
	
	public void updteNotification(String notificationStatus, int notificationId) {
		
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(updateNotification);
			ps.setString(1, notificationStatus);
			ps.setInt(2, notificationId);
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("Update Notification =."+e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
