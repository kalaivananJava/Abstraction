package org.main.prac;

public class Main {
    Day day;
    public Main(Day day) {
		this.day=day;
	}
	public void day() {
		
			
			switch(day) {
	    case SUNDAY:
		System.out.println("Sunday");
		break;
			default:
				System.out.println("All are boring");
				break;
		
			}
	}
	
Actors a;
public Main(Actors a) {
	this.a=a;
}
	//inner enum
     enum Singers{
    	 SPB,ANI
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Main sun=new Main(Day.SUNDAY);
         sun.day();
         Main mon = new Main(Day.MONDAY);
         mon.day();	
         Main a1=new Main(Actors.VIJAY);
         System.out.println(Singers.SPB);//enum inside a class
         
         Day day[]=Day.values();
         for(Day i:day) {
        	 System.out.println(i+" "+i.ordinal()+" "+i.getSalary());
         }
         
        		Day.test();
        		
        		Actors.POWERSTAR.act();
        		Actors.AJITH.act();
        		Actors.SURYA.act();
        		Actors.VIJAYSETHUPATHI.act();
        		Actors.VIJAY.act();
	}
     public void actor_name() {
    	 System.out.println(a);
     }
}      
