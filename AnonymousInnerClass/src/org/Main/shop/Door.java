package org.Main.shop;


public class Door{
 
	Lock lock=new Lock() {
	 
	 @Override
        	 public boolean isUnlocked(String key) {
        		 if(key.equals("qwerty")) {
        			return true;
        		 }
        		 return false;
        	 }
         };

		public Lock getLock() {
			return lock;
		}
         
}
