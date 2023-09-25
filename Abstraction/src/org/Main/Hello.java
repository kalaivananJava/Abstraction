package org.Main;

import org.Main.person.*;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john = new Vegan();
		john.speak();
		john.eat();

	   System.out.println(".....................");
	   
	   Person mia=new NonVegan();
	   mia.eat();
	   mia.speak();
		
	   
	   
		Person johnn = new Vegan();
		johnn.breathe();
		johnn.eat();
		johnn.speak();
		johnn.message();
	   
	};

};
