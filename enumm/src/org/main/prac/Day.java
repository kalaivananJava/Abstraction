package org.main.prac;

public enum Day {
	
        SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7),NORTH,SOUTH;
        
       private int c;
  Day(){
    	   this.c=0;
       }
      
	Day(int c){
		this.c=c;
	}
	static void test()
	{
		System.out.println("from test");
	}
	public int getSalary() {
		return c;
	}
}
