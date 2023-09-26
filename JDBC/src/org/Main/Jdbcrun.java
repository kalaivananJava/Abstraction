package org.Main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class Jdbcrun {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
// batchProcessing();
		rollBackk();
 
	}
	 //read record 
		public static void readRcord() throws Exception {
			String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
			String userName = "root";
			String password = "root";
			String query = "select *from emp";
			// Class.forName("com.mysql.cj.jdbc.Driver"); it is defaultly included
			// Connection is an interface available inside package; java.sql.*
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			// for first row
//				rs.next();
//				System.out.println("Id is "+rs.getInt(1));
//				System.out.println("Name is "+rs.getString(2));
//				System.out.println("Salary is "+rs.getInt(3));
//				//for second row...
//				rs.next(); -->it moves the cursor to next row...
//				System.out.println("Id is "+rs.getInt(1));
//				System.out.println("Name is "+rs.getString(2));
//				System.out.println("Salary is "+rs.getInt(3));

			// using loop
			while (rs.next()) {
				System.out.println("Id is " + rs.getInt(1));//1 indicates 1st column in table
				System.out.println("Name is " + rs.getString(2));////2 indicates 2nd column in table
				System.out.println("Salary is " + rs.getInt(3));////3 indicates 3rd column in table

			}
			con.close();
		}
	// insert record by hard code
		public static void insertDirectRecord() throws Exception {
			String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
			String name = "root";
			String password = "root";
			String query = "insert into emp values(5,'kalai',2000000)";
			Connection connection = DriverManager.getConnection(url, name, password);
			Statement statement = connection.createStatement();
			int n = statement.executeUpdate(query);
			connection.close();

		}
	//insert record using variable....
		public static void insertVarRecord() throws Exception {
			String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
			String name = "root";
			String password = "root";
			int id = 4;
			String recname = "Love";
			int salary = 2000000;
			String query = "insert into emp values(" + id + ",'" + recname + "'," + salary + ");";
			System.out.println(query);
			Connection connection = DriverManager.getConnection(url, name, password);
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate(query);
			System.out.println("rows affected :" + i);
			connection.close();

		}
	//insert record using Prepare Statement
		public static void insertPst() throws Exception {
			String urlString = "jdbc:mysql://127.0.0.1:3306/jdbc";
			String nameString = "root";
			String pwdString = "root";
			int id = 7;
			String nameString2 = "SKV";
			int salary = 2000000;
			String query = "insert into emp values(?,?,?);";
			Connection connection = DriverManager.getConnection(urlString, nameString, pwdString);
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setInt(1, id);//1 indicates 1st ? in query
			pst.setString(2, nameString2);//2 indicates 2nd ? in query
			pst.setInt(3, salary);////3 indicates 3rd ? in query
			pst.executeUpdate();
			connection.close();
		}
	// delete record using variable
		public static void deleteRecord() throws Exception {
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			int id = 6;
			String query = "delete from emp where id=" + id;
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			int i = st.executeUpdate(query);
			System.out.println(i);
			con.close();

		}

		// update record using PreparedStatement
		public static void update() throws Exception {
			String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
			String username = "root";
			String password = "root";
			int id = 7;
			String query = "Update emp set name='kalaivanan' where id=?";
			Connection connection = DriverManager.getConnection(url, username, password);

			PreparedStatement pst = connection.prepareStatement(query);
			pst.setInt(1, id);//1 indicates 1st ? in query....
			pst.executeUpdate();
			connection.close();

		}

		// caling stored Procedures with no parameter... using CallableStatement

		public static void procSimCall() throws Exception {
			String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);
			CallableStatement cst = con.prepareCall("{call getEmp()}");
			ResultSet rs = cst.executeQuery();
			//1 indicates 1st column in table
			//2 indicates 2nd column in table
			//3 indicates 3rd column in table
			while (rs.next()) {
				System.out
						.println("id is: " + rs.getInt(1) + " name is: " + rs.getString(2) + " salary is: " + rs.getInt(3));
				System.out.println("-----------------------------------------------------------------------------");
	}
			

		}
		
		public static void callStoredProINParam() throws Exception{
			String url="jdbc:mysql://127.0.0.1:3306/jdbc";
			String username="root";
			String password="root";
			int id=2;
			Connection con=DriverManager.getConnection(url,username,password);
			CallableStatement cst=con.prepareCall("{call getEmp2(?)}");
			cst.setInt(1, id);//1 indicates 1st ?  in callable statement
			ResultSet rst=cst.executeQuery();
			while(rst.next()) {
				System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getInt(1));//1 indicates 1st column in table
				//2 indicates 2nd column in table
				//3 indicates 3rd column in table
			}
			
			con.close();
		}

		public static void callStoredProOUTParam() throws Exception{
			
			String url="jdbc:mysql://127.0.0.1:3306/jdbc";
			String username="root";
			String password="root";
			int id=3;
			
			Connection con=DriverManager.getConnection(url,username,password);
			CallableStatement cst=con.prepareCall("{call getElementById(?,?)}");
			
			cst.setInt(2, id);//2 indicate 2nd ? in callable statement
			cst.registerOutParameter(1, Types.VARCHAR);
		    cst.executeUpdate();
			System.out.println(cst.getString(1));// in stored procedure out parameter la mattum 
			
			//1 indicates parameter index of ?
			
			con.close();
		}
		
		//Commit VS AutoCommit
		public static void commVsAutoCommit() throws Exception{
			
			String url="jdbc:mysql://127.0.0.1:3306/jdbc";
			String usname="root";
			String pwd="root";
			String query1="Update emp set salary=5500000 where id =1";
			String query2="Updat emp set salary=5500000 where id =2";
			Connection con=DriverManager.getConnection(url,usname,pwd);
			con.setAutoCommit(false);
			
			Statement st=con.createStatement();
			int r1=st.executeUpdate(query1);
			System.out.println("r1 "+r1);
			int r2=st.executeUpdate(query2);
			System.out.println("r2 "+r2);
			
			if(r1>0  && r2>0)
				con.commit();
			
			con.close();
		}
					
		//batch processing...
		
		public static void batchProcessing() throws Exception{
			String url="jdbc:mysql://127.0.0.1:3306/jdbc";
			String usname="root";
			String pwd="root";
			String q1="Update emp set salary=10000000 where id=1";
			String q2="Update emp set salary=10000000 where id=2";
			String q3="Update emp set salary=10000000 where id=3";
			String q4="Update emp set salary=10000000 where id=4";
			
			Connection con=DriverManager.getConnection(url,usname,pwd);
			
			Statement st=con.createStatement();
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			st.addBatch(q4);
			int arr[] =st.executeBatch();
			
			for(int i:arr) {
				System.out.println(i);
			}
			con.close();
					
		}
		
		//roll back...
		
		public static void rollBackk() throws Exception{
			String url="jdbc:mysql://localhost:3306/jdbc";
			String usname="root";
			String pwd="root";
			String q1="Update emp set salary=1000 where id=1";
			String q2="Update emp set salary=1000 where id=2";
			String q3="Update emp set salary=1000 where id=3";
			String q4="Updat emp set salary=1000 where id=4";
			
			Connection con=DriverManager.getConnection(url,usname,pwd);
			con.setAutoCommit(false);
			Statement st=con.createStatement();
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			st.addBatch(q4);
			
			int[] arr=st.executeBatch();
			for(int i:arr) {
				if(i>0)
					continue;
				else {
					con.rollback();
				}
				
			}
			con.commit();
			con.close();
			
}
		
		
	
}
