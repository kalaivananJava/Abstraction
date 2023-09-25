package org.Main.person;

//if there is a is-a relationship use abstract class ,if there is can-relationship use Interface
public abstract class Person implements iaAlive, LiveLife {
	public void speak() {
		System.out.println("Share his/her thoughts...");
	}
	//overrided methods of iaAlive and Livelife Interfaces
@Override
	public void breathe() {
System.out.println("be Alive remain living");
	}
@Override
	public void message() {
   System.out.println("life is a journey keep moving and meet new people");
	}

	public abstract void eat();// a class which inherit's this class should override this method

}
