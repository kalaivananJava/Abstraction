package org.Main;

public class Nested_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested_try_catch.div(10, 2);
		try {
			int a = 10 / 2;

			try {
				int arr[] = { 1, 2, 3 };
				arr[5] = 10;

			} catch (ArrayIndexOutOfBoundsException ar) {
				System.out.println("inner catch....");
			}
			try {
				String string = "Abc";
				int i = Integer.parseInt(string);
			} finally {

			}

		} catch (NumberFormatException nfe) {
			System.out.println("nfe---> outer catch block exception");

		} catch (ArithmeticException ae) {
			System.out.println("ae--->outer catch block exception");

		} catch (Exception e) {
			System.out.println("BAse class Exception....");

		}

	}
	public static int div (int a,int b) {
		try {
			return a/b;
		}
		finally {
			System.out.println("finally dominates return.....");
		}
	}



}
