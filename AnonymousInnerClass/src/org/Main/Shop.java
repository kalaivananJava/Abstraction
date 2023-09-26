package org.Main;

import org.Main.shop.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Door door=new Door();
        System.out.println( door.getLock().isUnlocked(args[0]));
	}

}
