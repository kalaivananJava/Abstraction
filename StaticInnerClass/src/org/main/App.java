package org.main;

import org.main.demo.Outer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner.testindInnerMethod();
         System.out.println( Outer.Inner.x);
         new Outer().testOuter();
         Outer.testOuter();
         
	}

}
