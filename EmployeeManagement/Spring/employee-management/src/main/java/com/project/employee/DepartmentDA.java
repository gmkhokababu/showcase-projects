package com.project.employee;

import java.sql.DriverManager;
import java.util.*;

public class DepartmentDA extends MySqlConnection{
	
	String showAllDepartments="select * from departments";
	String createDepartments="insert into departments(departmentName) values(?);";
	
	
	//_____________________________Show all Department__________________________________
	
	List<Department> alldepartments=new ArrayList<>();
	public List<Department> alldepartment(){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(showAllDepartments);
			rs=ps.executeQuery();
			while (rs.next()) {
				alldepartments.add(new Department(rs.getInt(1),rs.getString(2)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return alldepartments;
	}
	
	
	//______________________Create Department part_______________________________
	
	public void createDepartment(String departmentName) {
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(createDepartments);
			ps.setString(1, departmentName);
			ps.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	

}
