package org.Parent;

public class Animal {
       protected int height,weight;
       protected String AnimalType,BloodType;
	public Animal() {
		
		this.height = 0;
		this.weight = 0;
		AnimalType = "unknown";
		BloodType = "unknown";
	}
	public Animal(int height, int weight, String animalType, String bloodType) {
		
		this.height = height;
		this.weight = weight;
		AnimalType = animalType;
		BloodType = bloodType;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String getAnimalType() {
		return AnimalType;
	}
	public String getBloodType() {
		return BloodType;
	}

	public String showInfo(){
		return "Animal [height=" + height + ", weight=" + weight + ", AnimalType=" + AnimalType + ", BloodType="
				+ BloodType + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	
    
       
       
       
}
