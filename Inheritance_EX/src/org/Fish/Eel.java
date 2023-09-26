package org.Fish;

public class Eel extends Fish {
    private String release;

	public Eel() {
		super();
		this.release="electric";
		// TODO Auto-generated constructor stub
	}
	
	public Eel(int height,int weight,String animalType,String bloodType,String live,boolean hasGills,String release) {
		super(height,weight,animalType,bloodType,live,hasGills);
		this.release=release;
	}

	@Override
	public String showInfo() {
		return "Eel [release=" + release + ", live=" + live + ", hasGills=" + hasGills + ", height=" + height
				+ ", weight=" + weight + ", AnimalType=" + AnimalType + ", BloodType=" + BloodType + "]";
	}
	
	
    
    
	
	
	
}
