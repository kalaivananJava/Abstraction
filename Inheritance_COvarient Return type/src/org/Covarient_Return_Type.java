package org;

class A{
	A obj() {
		return this;
	}
	protected void get() {
		System.out.println("A class");
	}
}
class B extends A{
	B obj() {
		return this;
	}
	public void get() {
		System.out.println("b class..");
	}
}


public class Covarient_Return_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob =new A();

		ob.get();		

}
	


}
