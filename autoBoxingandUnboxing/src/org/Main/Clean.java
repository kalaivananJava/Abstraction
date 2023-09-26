package org.Main;

import java.util.ArrayList;

import java.util.ListIterator;

public class Clean {

	public static void main(String[] args) {
		ArrayList<Integer> demoListInteger= new ArrayList<>();
		demoListInteger.add(100);
		demoListInteger.add(20);
	    demoListInteger.add(30);
		System.out.println(demoListInteger.get(0));
        ArrayList<Float> demoListFloat = new ArrayList<>();
        demoListFloat.add(12.0f);
        System.out.println(demoListFloat.get(0));
        //
        ListIterator litr=demoListInteger.listIterator(demoListInteger.size());
        while(litr.hasPrevious()) {
        	System.out.println(litr.previous());
        }
        ListIterator litIterator=demoListInteger.listIterator();
        while(litIterator.hasNext()) {
        	System.out.println(litIterator.next());
        }
             
	}
	}

