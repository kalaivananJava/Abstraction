package org.Reptile;

public class Crocodile extends Reptile{

	public Crocodile() {
		super();
		egg="Hard";
		// TODO Auto-generated constructor stub
	}
	

	public Crocodile(String skinType, String bone, String egg, int height, int weight, String animalType,
			String bloodType) {
		super(skinType, bone, egg, height, weight, animalType, bloodType);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String showInfo() {
		return "Crocodile [skinType=" + skinType + ", bone=" + bone + ", egg=" + egg + ", height=" + height
				+ ", weight=" + weight + ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}
	
          
}
