package org.Main;



class Test {

	static void age(int a) {
		try {
			if (a < 18)
				throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Test().......");
			throw e;
		}
	}
}

public class throw_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Test.age(17);

		} catch (NullPointerException e) {
			System.out.println("main().............");
		}

	}

}
