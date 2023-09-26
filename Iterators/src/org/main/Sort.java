package org.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		List<String> list=new ArrayList<>();
		list.add("Class");
		list.add("Objects");
		list.add("Inheritance");
		list.add("Polymorphism");
		list.add("Encapsulation");
		list.add("Abstraction");
		list.add("Interface");
		Collections.sort(list);
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
