package com.jdbcdemo.database;

import java.sql.*;
import java.sql.DriverManager;

public class JDBCMain 
 {
   public static void main(String[] args)
   {
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/14thmarchadv?useSSL=false","root","root123");

		   
//		   Connection con = DriverManager.getConnection("jdbc:mysql://"
//		   		+ "localhost:3306/14thmarchadv","root","root123");
		   
		   Statement st = con.createStatement();
		   
		   ResultSet rs = st.executeQuery(" SELECT * FROM product");
		   
		   if(rs.isBeforeFirst()) {
			   while(rs.next())
			   {
				   System.out.println(rs.getInt(1) + rs.getString(2) + rs.getInt(3));
			   }
		   }
		   else
			   System.out.println("no product found ");
		   
		   con.close();
	   }
	   catch(Exception exc)
	   {
		   exc.printStackTrace();
	   }
   }
 }
