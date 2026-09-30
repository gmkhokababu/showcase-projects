package com.project.employee;

import java.sql.DriverManager;
import java.util.*;

public class RoleDA extends MySqlConnection{

	String  roleStatement="select * from role";
	List<Role> role=new ArrayList<>();
	
	public List<Role> allrole() {
		try {
			con=DriverManager.getConnection(url, user, pass);
			ps=con.prepareStatement(roleStatement);
			rs=ps.executeQuery();
			while(rs.next()) {
				role.add(new Role(rs.getInt(1),rs.getString(2)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return role;
	}
}
