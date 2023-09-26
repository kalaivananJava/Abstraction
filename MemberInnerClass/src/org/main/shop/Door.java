package org.main.shop;

public class Door {
	private Lock lock1;// object Declaration for Inner class Lock

	public Door() {
		lock1 = new Lock(true);// object creation
	}

	public void shopStatus() {
		if (lock1.isLock()) {
			System.out.println("Shop is closed..."+lock1.lock);
		} else {
			System.out.println("we welcome u...");
		}
	}

	public Lock getLock() {
		return lock1;
	}

//Inner class
	public class Lock {
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

	}

}
