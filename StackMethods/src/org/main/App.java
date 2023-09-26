package org.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
          Stack<Integer> demo=new Stack<Integer>();
         System.out.println(demo.push(10));
          demo.push(1);
          demo.push(2);
          demo.push(3);
          demo.push(4);
          System.out.println(demo); 
          for(int i:demo) {
        	  System.out.println(i);
          }
          for(Integer i:demo) {
        	  System.out.println(i);
          } 
          System.out.println(demo.pop());
          System.out.println(demo.peek());
          System.out.println(demo.search(2)+" "+demo.search(8));
          if(demo.isEmpty()) {
        	  System.out.println("Stack is empty");
          }else {
        	  System.out.println("Stack is n't empty");
          }
          Iterator itrIterator=demo.iterator();
          while(itrIterator.hasNext())
        	  System.out.println(itrIterator.next());
	}

}
