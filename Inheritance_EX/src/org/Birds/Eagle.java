package org.Birds;



public class Eagle extends Birds {
    public Eagle(String contains,boolean canFly,int height,int weight,String animalType,String bloodType)
	{
    	super(contains, canFly, height, weight, animalType, bloodType);
    	
    	
	}
    	@Override
	
	public String showInfo() {
		return "Eagle [contains=" + contains + ", canFly=" + canFly + ", height=" + height + ", weight=" + weight
				+ ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}
      
	
	
}
