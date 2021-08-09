package com.subin.s1.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect{
	
	public Connection dbConnect() throws Exception{
		String user = "user02";
		String password = "user02";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		return con;
	
	}
}
