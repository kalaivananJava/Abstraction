package org.Main;

import java.util.*;

//custom wrapper class-created by programmer.....
class intWrapper{
	public int intValue;
   intWrapper(int intValue){
	   this.intValue=intValue;
   }
   public int getintValue() {
	   return intValue;
   }
   public void setintValue(int intValue)
   {
	   this.intValue=intValue;
   }
}
public class App {


	public static void main(String[] args) {
		//own wrapper class available in java...Integer
		ArrayList<Integer> list=new ArrayList<>();
		list.add(99);//AUTOBOXING.... in here , conversion of primitive type to object is not needed.becoz java can automatically done the autoboxing here..
		System.out.println(list.get(0));//auto unboxing is done automatically in java. 
		
		list.add(Integer.valueOf(200));//boxing done by compiler intWrapper background
		System.out.println(list.get(1).intValue());//un boxing done by compiler intWrapper background
       //custom wrapper class-created by programmer.....		
       ArrayList<intWrapper> list2= new ArrayList<>();
       // list2.add(99); -----> for this statement eclipse will start complaining.. becoz..
       // in custom wrapper class  autoboxing and unboxing not done automatically.
       list2.add(new intWrapper(100));//boxing 
        
       System.out.println(list2.get(0).getintValue());//unboxing
       
       //what happens in background when we make use wrapper class provided by java...
       
       ArrayList<Double> demo=new ArrayList<>();
       demo.add(25.5);//auto boxing...
       //inorder to perform  Auto-boxing manually by compiler in bagkground......
      // demo.add(new Double(10.25)); (warning) it is older way of boxing done by compiler this is depricated...
       demo.add(Double.valueOf(10.25));//this done by the compiler at autoboxing;
       System.out.println(demo.get(0));
       System.out.println(demo.get(0).doubleValue());
       int a=50;  
       Integer integer=new Integer(10);
       Integer a2=25;//Boxing  
 
    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
