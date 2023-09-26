package org.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> countries=new LinkedList<>();	
        countries.add("India");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Russia");
        countries.add("Bragil");
        System.out.println(countries);
        Iterator<String> itrIterator=countries.descendingIterator();
        while(itrIterator.hasNext() ) {
        	System.out.println("HAI "+itrIterator.next());
        }
        new App().printList(countries);
        countries.add(1,"canada");
        new App().printList(countries);
        countries.set(7,"Brazil");
        new App().printList(countries);
        countries.remove();
        new App().printList(countries);
        countries.remove(2);
        new App().printList(countries);
	    
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        
        new App().printList(list);
       List<String> list1=new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        new App().printList(list1);
        
        LinkedList<String> countriess=new LinkedList<>();	
        countriess.add("India");
        countriess.add("USA");
        countriess.add("Poland");
        countriess.add("Egypt");
        countriess.add("Thailand");
        countriess.add("Russia");
        countriess.add("Bragil");
        System.out.println(countriess);
        new App().printList(countriess);
        countriess.add(1,"canada");
        new App().printList(countriess);
        countriess.set(7,"Brazil");
        new App().printList(countriess);
        countriess.remove();
        new App().printList(countriess);
        countriess.remove(2);
        new App().printList(countriess);
        
	}
	
	void printList(List<String> list) {
	   for(String i:list) {
		   System.out.print(" "+i);
	   }
	   System.out.println("*************************************--------");
	}

}
