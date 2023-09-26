
package org.main;

import org.main.shop.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Door door = new Door();
	   
	   door.shopStatus();
	   door.getLock().setLock(false);
       door.shopStatus();
       
       Door o=new Door();
       Door.Lock obj=o.new Lock(true);
       o.shopStatus();
       
	}

}
