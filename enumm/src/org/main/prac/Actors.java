package org.main.prac;

public enum Actors {
//constants only first then other statements....
	VIJAY(50){
		public void act() {
			System.out.println("dance.....");//this method is for specific actor
		}


	},AJITH(40),SIVA(30),POWERSTAR{

		public void act() {
			System.out.println("poweru....");//this method is for specific actor
		}
	}, VIJAYSETHUPATHI(20),SURYA(10){
		public void act() {
			System.out.println("suriya....");//this method is for specific actor
		}
	};
	public void act() {
		System.out.println("Normal....");//once we give the method specifically 
		//we have to give default method for the other constants who does n't have specific method otherwise we cant access it.
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
