package org.Main.shop;

public class Door {

	public boolean isLocked(String key) {

		// Local Inner class ->the class is abstract becoz,it is hidden from outside
		// world....

		class Lock {
			public boolean isLocked(String key) {
				if (key.equals("qwerty"))
					return true;
				return false;
			}
		}

		return new Lock().isLocked(key);
	}

}
