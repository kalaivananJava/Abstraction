package org.Main;
import org.Laptop.Laptop;

import org.LaptopComponents.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Laptop lap=new Laptop();
        //to call object from object
         System.out.println(lap.getProcessor().getBrand());
         Processor p=new Processor("intel","7200u",7,4,4,"6MB","2.5GHz"
        		 ,"2.5GHz","3.16GHZ");
         GraphicsCard gc=new GraphicsCard("nvidia",1050,"4GB");
         Laptop l=new Laptop(17f,p,"DDR4","2TB",gc,null,"backlit");
       //  System.out.println(l);//separate objects
         
         Laptop la=new Laptop(17f,new Processor("intel","7200u",7,4,4,"6MB","2.5GHz"
        		 ,"2.5GHz","3.16GHZ"),"DDR4","2TB",new GraphicsCard("nvidia",1050,"4GB"),null,"backlit");
//         System.out.println(la);//one object 
//         System.out.println(la.gamingMode());
//         System.out.println("gaming mode on");
//         System.out.println(la.getProcessor().getFrequency());
	     System.out.println(la.processor);
	     System.out.println(lap.getGraphicsCard());
    
	}

}
