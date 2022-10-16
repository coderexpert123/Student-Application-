package com.studentapi.managemnt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class studentDao {


	public static boolean inserttodb(Student st) {
		boolean f=false;	
try {
	Connection c=cp.cretec();
	String q = "insert into student_table(sname,sphone,scity) values(?,?,?)";
	//Prepared statement
	
	PreparedStatement ptmt=c.prepareStatement(q);
	ptmt.setString(1, st.getSname());
	ptmt.setString(2, st.getSphone());
	ptmt.setString(3, st.getScity());
	ptmt.executeUpdate();
	f=true;
	
	} 

	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
 
	
}

return f;
}

	public static boolean deletest(int uid) {
		
		boolean f=false;	
	try {
	Connection c=cp.cretec();
	String q = "delete from student_table where sid=?";
	//Prepared statement
	
	PreparedStatement ptmt=c.prepareStatement(q);
	ptmt.setInt(1, uid);
 
	ptmt.executeUpdate();
	f=true;
	
	} 

	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
 
	
}

return f;
	}
	
	
	
	
	public static void showallstu()
	{
	 
		try {
		Connection c=cp.cretec();
		String q = "select * from student_table";
 
		 
		
		
		java.sql.Statement stat=c.createStatement();
		
		
		ResultSet resultSet=stat.executeQuery(q);
		
		
		while(resultSet.next()) {
			
			int id=resultSet.getInt(1);
			
			String nameString=resultSet.getString(2);
			String namephone=resultSet.getString(3);
			String namecity=resultSet.getString(4);
			
			System.out.println("id: "+id);
			System.out.println("Name: "+nameString);
			System.out.println("Phone: "+namephone);
			System.out.println("City: "+namecity);
		}
		
	 
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	
		
	}

	 
	}
}
	

	

 
