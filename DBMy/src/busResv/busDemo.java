package busResv;
import java.sql.SQLException;
import java.util.*;
public class busDemo {

	public static void main(String[] args) throws SQLException {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
//		ArrayList<Bus> buses=new ArrayList<Bus>();
//        ArrayList<Booking> bookings=new ArrayList<Booking>();    
//		
//		buses.add(new Bus(1, true, 2));	
//            buses.add(new Bus(2, false, 50));
//            buses.add(new Bus(3, true, 48));
            
//            for(Bus b:buses) {
//            	b.display();
//            }
            
		BusDAO busDAO=new BusDAO();
		busDAO.displayBusInfo();
        int userOpt=1;
		while(userOpt==1) {
			System.out.println("Enter 1 to book 2 to exit");
		    userOpt=scanner.nextInt();
		    if(userOpt==1)
		    {
		    	Booking bbooking=new Booking();
		    	
		    	if(bbooking.isAvailable()) {
		    		BookingDAO bookingDAO=new BookingDAO();
		    		bookingDAO.addBooking(bbooking);
		    		System.out.println("ticket booked..... confirmed.......");
		    	}
		    	else {
		    		System.out.println("Sorry bus is full........");
		    	}
		    }
		}
		
         


}
}
