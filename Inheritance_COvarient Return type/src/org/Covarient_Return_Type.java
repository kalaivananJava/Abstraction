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
	
//As you can see in the above example, the return type of the get() method of A class is A but the return type of the get() method of B class is B.
	//Both methods have different return type but it is method overriding. This is known as covariant return type.

}
