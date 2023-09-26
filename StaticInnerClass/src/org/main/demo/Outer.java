package org.main.demo;

public class Outer {
	private int o=10;
	private static int so=20;
	public static void  testOuter() {
		System.out.println("outer method... & value of inner class variavle"+Inner.x);
	}
	public static class Inner {
		public static int x = 01;

		public static void testindInnerMethod() {
			System.out.println("Testing inner().... with non static outer class variable"+new Outer().o);//if non static variable needs o be accessed
			System.out.println("Testing inner().... with static outer class variable"+so);
		    testOuter();//outer static method
		}
	}

}
