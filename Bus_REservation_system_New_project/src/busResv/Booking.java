package busResv;
import java.util.*;

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

	public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> booking) {
		int capacity=0;
		for(Bus bus: buses) {
			if(bus.getBusNo()==this.busNo) {
			capacity=bus.getcapacity();
			break;
			}
		}
		int counter=0;
		for(Booking b:booking) {
			if(b.busNo==busNo && b.date.equals(date))
				counter++;
		}
		if(capacity==counter)
			return false;
         return true;
	}
}
