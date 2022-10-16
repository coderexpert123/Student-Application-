package com.studentapi.managemnt;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {

	
	static Connection con;
	
	public static Connection cretec() {
		
		try {
			
			//conn = DriverManager.getConnection(");

			
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/student_main?autoReconnect=true&useSSL=false";
			
			
			
			con=DriverManager.getConnection(url,user,password);
			 
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
		
	}

	
}
