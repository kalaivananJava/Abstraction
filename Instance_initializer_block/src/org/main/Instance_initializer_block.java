package org.main;


class Initializer {

	public Initializer(){
		System.out.println("parent class....");
	}

}
 class child extends Initializer{
	
	   public child(){
	    	
	    	System.out.println("child......");
	    }
	      //Instance Initializer block..... it seems that instance initializer block is firstly invoked but NO. 
	   //Instance intializer block is invoked at the time of object creation. The java compiler copies the 
	   //instance initializer block in the constructor after the first statement super(). So firstly, constructor is invoked.
	    {
	    	System.out.println("Instance Initializer Block.....");
	    }
}
public class Instance_initializer_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Initializer ob=new child();
	}

}
