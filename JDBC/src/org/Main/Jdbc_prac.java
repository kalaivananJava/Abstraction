package org.Main;
import java.sql.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
public class Jdbc_prac {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    // readRecord();
   //  insDirRecord();
	// insVarRec();
		//insPst();
		//deleteRecordPST();
		//update();
		//callStoredProcedure();
//		callStroredProcOUTParam();
	//commitVsAutoCommit();
		batchProcessing();
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
     public static void insDirRecord() throws Exception{
    	 String url="jdbc:mysql://localhost:3306/prac";
    	 String username="root";
    	 String password="root";
    	 String query="insert into st values(1,'aarthi',9.2);";
    	 Connection con=DriverManager.getConnection(url,username,password);
    	 Statement st=con.createStatement();
    	 int i=st.executeUpdate(query);
    	 System.out.println(i);
    	 con.close();
    	 
    	  }
     public static void insVarRec() throws Exception{
    	 
    	 String url="jdbc:mysql://localhost:3306/prac";
    	 String username="root";
    	 String password="root";
    	 int id=2;
    	 String name="Ashwin";
    	 double gpa=8.0;
    	 
    	 String query="insert into st values("+id+",'"+name+"',"+gpa+");";
    	 
    	 Connection con=DriverManager.getConnection(url,username,password);
    	 Statement st=con.createStatement();
    	 int i=st.executeUpdate(query);
    	 
    	 System.out.println(i);
    	 con.close();
    	 
    	 
    	  }
     public static void insPst() throws Exception{
    	 String url="jdbc:mysql://localhost:3306/prac";
    	 String username="root";
    	 String passwordString="root";
    	 int id=3;
    	 String name="Balaji";
    	 double gpa=8.3;
    	 int id1=4;
    	 String name2="Krithika";
    	 double gpa1=7.5;
    	 
    	 String query="insert into st values(?,?,?),(?,?,?);";
    	 
    	 Connection connection=DriverManager.getConnection(url,username,passwordString);
    	 PreparedStatement pst=connection.prepareStatement(query);
    	 pst.setInt(1, id);
    	 pst.setString(2, name);
    	 pst.setDouble(3,gpa);
    	 pst.setInt(4, id1);
    	 pst.setString(5, name2);
    	 pst.setDouble(6,gpa1);
    	 pst.executeUpdate();
    	 connection.close();
    	 
    	 }
     public static void deleteRecordPST() throws Exception{
    	 String url="jdbc:mysql://localhost:3306/prac";
    	 String usernameString="root";
    	 String passwordString="root";
    	 int id=4;
 String queryString="delete from st where id=?";
 Connection con=DriverManager.getConnection(url,usernameString,passwordString);
 PreparedStatement pStatement=con.prepareStatement(queryString);
 pStatement.setInt(1, id);
int i= pStatement.executeUpdate();
System.out.println(i);
 con.close();
 
    	  
     }
     
     public static void update() throws Exception{
    	 String url="jdbc:mysql://localhost:3306/prac";
    	 String username="root";
    	 String password="root";
    	 
    	 String query="Update st set name='Bajji' where id=3;";
    	 Connection connection=DriverManager.getConnection(url,username,password);
    	 Statement st=connection.createStatement();
    	 int i=st.executeUpdate(query);
    	 connection.close();
    	 
     }
     // calling Stored Procedure with no parameter
     
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
     public static void callStroredProcOUTParam() throws Exception{
    	 String url="jdbc:mysql://localhost:3306/prac";
    	 String username="root";
    	 String password="root";
    	 int id=1;
    	 
    	 Connection con=DriverManager.getConnection(url,username,password);
    	 CallableStatement cst=con.prepareCall("{call getStu(?,?)}");
    	 cst.setInt(2, id);
    	 cst.registerOutParameter(1,Types.VARCHAR);
    	 
    	 cst.executeUpdate();
    	 
    	 System.out.println(cst.getString(1));
    	 
    	 con.close();
     }
     
     public static void commitVsAutoCommit() throws Exception{
    	 String urlString="jdbc:mysql://127.0.0.1:3306/prac";
    	 String usname="root";
    	 String pwd="root";
    	 String query1="update st set gpa=9.9 where id=1";
    	 String query2="update st set gpa=9.99 where id=2";
    	 
    	 Connection con=DriverManager.getConnection(urlString,usname,pwd);
    	// con.setAutoCommit(false);
    	 Statement st=con.createStatement();
    	 int r1=st.executeUpdate(query1);
    	// System.out.println("r1 :"+r1);
    	 int r2=st.executeUpdate(query2);
    	 
    	 System.out.println("r2 :" +r2);
    	 if(r1>0 && r2>0)
    		 //con.commit();
    	 con.close();
     }
     
     
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
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
