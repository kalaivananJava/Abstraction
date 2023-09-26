package polymorphism;

import polymorphism.phone.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph = new Phone("Nokia 3310");
		System.out.println(ph.getModel());
		ph.features();
		SamsunNote8 s=new SamsunNote8("SamsungNote8");
		System.out.println(s.getModel());
		s.features();
		Nokia n=new Nokia("Nokia 880");
		System.out.println(n.getModel());
		n.features();
		
		Phone p=new Main().dailyDrive(1);
		System.out.println(p.getModel());
		p.features();
		
		Phone p0=new Main().dailyDrive(2);
		System.out.println(p0.getModel());
		p0.features();
		
		System.out.println("kalaivanan............");
		
	}
     public Phone dailyDrive(int n) {
    	 switch(n) {
    	 case 1: return new SamsunNote8("samsung not 9");
    	 case 2: return new Nokia("Nokia 88888");
    	 }
		return null;
    	 
     }
}
