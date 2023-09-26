package org.Fish;

import org.Parent.*;

public class Fish extends Animal {

	String live;
	boolean hasGills;
	public Fish() {
		this.height=2;
		this.weight=2;
		this.AnimalType="fish";
		this.BloodType="red";
		this.live = "water";
		this.hasGills = true;
	}
	public Fish(int height,int weight,String animalType,String bloodType,String live,boolean hasGills) {
		super(height,weight,animalType,bloodType);
		this.live=live;
		this.hasGills=hasGills;
	}
	@Override
	public String showInfo() {
		return "Fish [live=" + live + ", hasGills=" + hasGills + ", height=" + height + ", weight=" + weight
				+ ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}
	
	
	
	
	
	
	
}
