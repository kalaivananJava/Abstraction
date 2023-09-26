package org.Reptile;

import org.Parent.*;

public class Reptile extends Animal {

	String skinType, bone, egg;

	public Reptile() {
		this.height = 5;
		this.weight = 40;
		this.AnimalType = "Reptile";
		this.BloodType = "Cold";
		this.skinType = "dry";
		this.bone = "yes";
		this.egg = "soft";
	}
	
	public Reptile(String skinType, String bone, String egg,int height,int weight,String animalType,String bloodType) {
		super( height,  weight,  animalType,  bloodType);
		this.skinType = skinType;
		this.bone = bone;
		this.egg = egg;
	}
	@Override
	public String showInfo() {
		return "Reptile [skinType=" + skinType + ", bone=" + bone + ", egg=" + egg + ", height=" + height + ", weight="
				+ weight + ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}


	
   
}
