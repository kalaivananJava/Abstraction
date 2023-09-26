package busResv;

public class Bus {
   private int busNo;
   private boolean aC;
   private int capacity;
	public Bus(int busNo, boolean aC, int capacity) {
		
		this.busNo = busNo;
		this.aC = aC;
		this.capacity = capacity;
	}
	public int getBusNo() {//accessor method
		return busNo;
	}
	public boolean getaC() {
		return aC;
	}
	public int getcapacity() {
		return capacity;
	}
	
	public void setaC(boolean aC) {
		this.aC=aC;
	}
	public void setcapacity(int capacity) {
		this.capacity=capacity;
	}
    
	public void display() {
		System.out.println("bus no : "+busNo+" AC: "+aC+" capacity: "+capacity);
	}
    
}
