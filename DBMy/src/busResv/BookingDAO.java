package busResv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class BookingDAO {

	
	public int getBookedCount(int busNo,Date date) throws SQLException {
		String query="select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con=DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqlDate);
		
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
		
		
	}
	public void addBooking(Booking ob) throws SQLException {
		String query="insert into booking values(?,?,?)";
		Connection con=DBConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqlDate=new java.sql.Date(ob.date.getTime());

		pst.setString(1,ob.passengerName);
		pst.setInt(2,ob.busNo);
		pst.setDate(3, sqlDate);
		
		pst.executeUpdate();
		
		
	}
}
