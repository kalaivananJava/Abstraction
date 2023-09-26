package org.Main;

import org.Main.shop.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Door door=new Door();
          System.out.println(door.isLocked("qwerty"));//false
          System.out.println(door.isLocked("test"));
          if(door.isLocked(args[0])) {
        	  System.out.println("door is opened... as the pin is correct");
          }
          else{
        	  System.out.println("door is locked.. as the pin is incorrect");
          }
          
	}

}
