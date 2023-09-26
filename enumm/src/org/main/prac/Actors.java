package org.main.prac;

public enum Actors {

	VIJAY(50){
		public void act() {
			System.out.println("dance.....");
		}


	},AJITH(40),SIVA(30),POWERSTAR{

		public void act() {
			System.out.println("poweru....");
		}
	}, VIJAYSETHUPATHI(20),SURYA(10){
		public void act() {
			System.out.println("suriya....");
		}
	};
	public void act() {
		System.out.println("Normal....");
	}
	Actors(){

	}
	int salary;
	Actors(int salary){
		this.salary=salary;
	}
	public static void main(String[] args) {
		System.out.println("enum in main");
	}
}
