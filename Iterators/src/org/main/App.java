package org.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();	
		for(int i=0;i<=10;i++)
			list.add(i);
		
		System.out.println(list);
          
	new App().printIterator(list);
	}
	
	void printIterator(List<Integer> list) {
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			int i=itr.next();
			System.out.print(i+" ");
	
		  if(i%2==0)
			  itr.remove();
		}
		System.out.println("\n"+list);
	}

}
