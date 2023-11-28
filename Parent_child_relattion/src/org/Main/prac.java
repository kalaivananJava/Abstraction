package org.Main;
//https://www.javatpoint.com/memory-management-in-java
class ParentClass {
	// we cannot override the display() method becoz.. it is static....
	public static void display() {
		System.out.printf("display() method of the parent class.");
	}
}

//child class  
class ChildClass extends ParentClass {
	// the same method also exists in the ParentClass
	// it does not override, actually it is method hiding
	public static void display() {
		System.out.println("Overridden static method in Child Class in Java");
	}
}

public class prac {
	static void display() {
		System.out.println("Main display().......");
	}

	public static void main(String[] args) {
		prac obPrac = new prac();
		obPrac.display();
		ParentClass pc = new ParentClass();
		pc.display();
		ChildClass cc = new ChildClass();
		cc.display();
		ParentClass pcc = new ChildClass();
		pcc.display();
         byte a=10,b=20;
         byte c=(byte) (a+b);
         
	}
}