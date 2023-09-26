package busResv;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
       String passengerName;
       int busNo;
       Date date;
       
     public Booking() {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter passenger name");
    	 passengerName=scanner.next();
    	 System.out.println("enter busNo:");
         busNo=scanner.nextInt();
         System.out.println("Enter date dd-mm-yyyy");
         String dateInput=scanner.next();
         SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
         try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
     }

	public boolean isAvailable() throws SQLException{
		
		BusDAO busdao =new BusDAO();
		int capacity=busdao.getCapacity(busNo);
		BookingDAO bookingDAO=new BookingDAO();
		int booked =bookingDAO.getBookedCount(busNo,date);
	
	
		if(capacity==booked)
			return false;
         return true;
	}
}
