package com.project.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnection {
	String url="jdbc:mysql://localhost/employee_management";
	String user="root";
	String pass="abu420";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

}
