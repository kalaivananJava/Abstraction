package org.Birds;
import org.Parent.*;
public class Birds extends Animal {
    
	String contains;
	boolean canFly;
	public Birds() {
	    super();
		this.contains = "feather";
		this.canFly = true;
	}
	public Birds(String contains,boolean canFly,int height,int weight,String animalType,String bloodType) {
		super(height,weight,animalType,bloodType);
		this.contains=contains;
		this.canFly=canFly;
	}
	@Override
	public String showInfo() {
		return "Birds [contains=" + contains + ", canFly=" + canFly + ", height=" + height + ", weight=" + weight
				+ ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}
	
	
	
}
