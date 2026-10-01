package com.filesIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FileHandlingDemo1 {
	public static void main(String[] args) throws SQLException {
		System.out.println("main method started"); 
		
//		FileReader fr= new FileReader("com.mysql.cj.jdbc.Driver");
	  
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
	    Statement stmt=c.createStatement();
	   
//	  ResultSet rs=  stmt.executeQuery("select * from employee");
	  int  insertsql=stmt.executeUpdate("insert into employee(emp_ID,emp_name) values (109,'ankitha')");

int  updatesql=stmt.executeUpdate("update  employee set emp_name='sai' where emp_ID=101");
int  deletesql=stmt.executeUpdate("delete  from employee where emp_ID=103");
System.out.println(insertsql);	
System.out.println(updatesql);	
System.out.println(deletesql);	
ResultSet rs=  stmt.executeQuery("select * from employee");
  while(rs.next()) {
		  System.out.println(rs.getInt(1));
		  System.out.println(rs.getString(2));
  }
	   
	  	  rs.close();
	  stmt.close();
	  c.close();
	  
		
		System.out.println("main method ended");

	}

}
