package polymorphism.phone;

public class Phone {
	private String model;

	public Phone(String model) {

		this.model = model;
	}

	public void features() {// feature phone is a phone with limited internet options and we can hear only music.
		
		System.out.println("Parent feature phone");

	}

	public String getModel() {
		return model;
	}
	

}
