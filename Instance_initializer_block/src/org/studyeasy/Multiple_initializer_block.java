package org.studyeasy;

class parent{
	public parent() {
		System.out.println("Parent..............");	
	}
}
class child extends parent{
	int x;
	public child() {
	   System.out.println("child with no parameter....");
	}
	
   child(int i){
	   System.out.println("child constructor with parameter.......");
   }
   //Instance Initializer block..... it seems that instance initializer block is firstly invoked but NO. Instance intializer block is invoked at the time of object creation. The java compiler copies the 
   //instance initializer block in the constructor after the first statement super(). So firstly, constructor is invoked. 
   {
	   x=100;
	   System.out.println("Instance Initializer block......"+x);
   }
}
public class Multiple_initializer_block {
	public static void main(String[] args) {
            child obChild=new child();
            child obChild2=new child(10);
            
		
	}
}
