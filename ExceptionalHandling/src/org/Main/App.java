package org.Main;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0, y = 5;
		try {
			System.out.println("statement get executed....");
			// System.out.println("There is no partial execution so,statement will not get
			// executed...."+x/0);
			x = (y = 10 * 10) / 0;

			System.out.println("statement will not get executed....");
		} catch (ArithmeticException e) {
			System.out.println("AE");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(y);
		}

//		try {
//			System.out.println("statement get executed...."+10/0);
//		}finally {
//			System.out.println("this wil  be printed");
//			
//		}
		
		boolean b = true;
		if (b = false) {
			System.out.println("if"+b);
		} else {
			System.out.println("else"+b);
		}
	}

}
