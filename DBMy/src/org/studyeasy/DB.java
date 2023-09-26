package org.studyeasy;

import java.sql.*;

public class DB {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		readRecord();
		 callStoredProcedure();
	}
	 static public void readRecord() throws Exception{
  	   String url="jdbc:mysql://localhost:3306/prac";
         String username="root";
         String password="root";
         String query="select * from st";
         
         Connection con=DriverManager.getConnection(url,username,password);
         Statement statement=con.createStatement();
         ResultSet rs=statement.executeQuery(query);
         
         while(rs.next()) {
         	System.out.println("id is :"+rs.getInt(1)+" "+"name is : "+rs.getString(2)+" "+"gpa is :"+rs.getDouble(3));
         	System.out.println("==============");
         	
         }
         con.close();
   }
	  
     public static void callStoredProcedure() throws Exception{
    	 String url="jdbc:mysql://localhost:3306/prac";
    	 String username="root";
    	 String password="root";
    	 
    	 Connection con=DriverManager.getConnection(url,username,password);
    	 CallableStatement cst=con.prepareCall("{call stCount()}");
    	 ResultSet rst=cst.executeQuery();
    	 while(rst.next())
    	 {
    		 System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getDouble(3));
    	 }
     }
}
