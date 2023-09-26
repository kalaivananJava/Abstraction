package org.studyeasy;

interface runnable {
	public void display();

	default void work() {
		System.out.println("work..........");
		delay();
	}

	static void wrk() {
		System.out.println("wrk.....");

	}

	private void delay() {
		System.out.println("delayed.......");
	}

}

interface runnable1 extends runnable {
	public void display1();

	static void wrk() {
		System.out.println("wrk.....");

	}

	default void work() {
		System.out.println(" runnable1 work..........");

	}
}

class a implements runnable, runnable1 {

	public void display() {
		System.out.println("A class......");
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("runnable 1 a class....");

	}

}

public class depth_of_Interfaces {

	public static void main(String[] args) {

		runnable obRunnable = new a();
		obRunnable.display();
		obRunnable.work();
		a obA = new a();

		// runnable1 ob=new a();
		// ob.work();
	}
}