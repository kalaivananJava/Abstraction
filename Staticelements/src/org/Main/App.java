package org.Main;

import org.Main.testrun.TestStatic;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              //TestStatic obj1=new TestStatic();
              System.out.println("current var val is "+TestStatic.getStaticVariable());
              TestStatic.setStaticVariable(1);
              System.out.println(" current var val is "+TestStatic.getStaticVariable());
           
            //  TestStatic obj2=new TestStatic();
              System.out.println(" current var val is "+TestStatic.getStaticVariable());
              TestStatic.setStaticVariable(24);
              
              System.out.println("current var val is "+TestStatic.getStaticVariable());
              

              
              
	}

}
