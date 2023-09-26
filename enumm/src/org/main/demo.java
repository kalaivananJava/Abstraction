package org.main;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to call enum constructor.....
		System.out.println(Learning.valueOf("COREJAVA"));
		System.out.println(Learning.COREJAVA.getConcept());
       Learning learn=Learning.COREJAVA;
       switch(learn) {
	case COLLECTIONS:
		System.out.println("step 2 ");
		break;
	case COREJAVA:
		System.out.println("step 1");
		break;
	case GENERICS:
		System.out.println("step 3");

		break;
	case JSPANDSERVLETS:
		System.out.println("step 4");

		break;
	case MULTITHREADING:
		System.out.println("step 5");

		break;
	default:
		System.out.println("Not in enumerated list");

		break;
       
       }
	}

}
