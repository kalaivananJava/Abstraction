package org.main;

public class App {

	public static void main(String[] args) {

		String x="a";
		String y="b";
		System.out.println(x.compareTo(y));
		
		String x2="b";
		String y2="a";
		System.out.println(x2.compareTo(y2)); 
		
		String x3="a";
		String y3="a";
		
		System.out.println(x3.compareTo(y3));
		
		
//		int i=10,j=20; 
//		System.out.println(i.compareTo(j));   --->this is error becoz compareTo() can only compare objects 
		//	cant compare it with primitive types...
		Integer i=10,j=20;
		System.out.println(i.compareTo(j));
		
		
		
	
		
	}

}
