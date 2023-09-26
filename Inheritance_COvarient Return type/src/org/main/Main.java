package org.main;

import org.Vehicles.Bike;
import org.Vehicles.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub dc->default constructor pc->parameterized
		// constructor
		Bike dc = new Bike();
		Bike pc = new Bike("long", "Diesel", 2, 2, 20, "LED");
//         System.out.println("------------default constructor-----------");
//      System.out.println( dc.getHandle());
//        System.out.println(dc.getEngine());
//        System.out.println(dc.getLights());
//        System.out.println(dc.getSeats());
//        System.out.println(dc.getWheels());
//        System.out.println(dc.getFuelTank());
//        System.out.println("----------------parameterized constructor-----------");
//         System.out.println(pc.getHandle());
//         System.out.println(pc.getEngine());
//         System.out.println(pc.getLights());
//         System.out.println(pc.getSeats());
//         System.out.println(pc.getWheels());
//         System.out.println(pc.getFuelTank());

		System.out.println(dc);
		System.out.println(pc);
		Car dcar = new Car();
		Car pcar = new Car("square", "dolby", "bluestar", "olg", "Ipad", "diesel", 4, 6, 50, "lcd");
		System.out.println(dcar);
		System.out.println(pcar);

	}

}
