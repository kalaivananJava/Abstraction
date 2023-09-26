package org.main;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();	
		for(int i=0;i<=10;i++)
			list.add(i+2);
         

		new List_Iterator().printListIterator(list);
		new List_Iterator().print_rev(list);
	}





	void printListIterator(List<Integer> li) {
		ListIterator<Integer> ltr=li.listIterator();
		while(ltr.hasNext()) {
			System.out.print(ltr.nextIndex()+" "+ltr.next()+" "+ltr.nextIndex()+"|");


		}
		System.out.println("------------------------------------------------------");
	}
	void print_rev(List<Integer> li) {
            ListIterator<Integer> ltr=li.listIterator();
            while(ltr.hasPrevious()) {
            	System.out.print(ltr.previousIndex()+" "+ltr.previous()+"|");
            }
	}
}
