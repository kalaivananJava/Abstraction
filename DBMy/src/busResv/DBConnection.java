package busResv;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/busResv";
	private static final String username = "root";
	private static final String password = "root";
//to return connection object...
	public static Connection getConnection() throws SQLException {
		 
		return DriverManager.getConnection(url,username,password);
	}
}
