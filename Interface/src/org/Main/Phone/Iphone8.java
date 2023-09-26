package org.Main.Phone;

public class Iphone8 implements Phone{

	@Override  //this override annotation symbolizes that this method is overridden from Interface Phone
	public String Processor() {
		// TODO Auto-generated method stub
		return "A11";
	}

	@Override
	public String OS() {
		// TODO Auto-generated method stub
		return "IOS";
	}

	@Override
	public int spaceInGB() {
		// TODO Auto-generated method stub
		return 64;
	}

	
}
