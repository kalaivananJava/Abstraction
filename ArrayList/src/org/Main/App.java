package org.Main;

import java.util.ArrayList;

public class App {
	 static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
//        ArrayList li=new ArrayList();
//        li.add(10);
//        li.add(1.5);
//        li.add("kalai");
//        System.out.println(li);
        listNames.add("Chaand");
		listNames.add("john");
		listNames.add("Steve");
		listNames.add("Pooja");
		listNames.add("Salim");
		listNames.add("Rahul");
		listNames.add("Mia");
		listNames.add("Angel");
		System.out.println(listNames);
		System.out.println(listNames.get(0));
		System.out.println(listNames.remove(0));
		System.out.println(listNames);
		listNames.add(0,"Chaand");
		System.out.println(listNames.remove("Chaand"));
		System.out.println("111111111111111111111111111");
		System.out.println(listNames);
		displaylistNames(listNames);
		System.out.println("0-----------------------");
		removeByPosition(0);
		removeByValues("Mia");
		displaylistNames(listNames);
		System.out.println("0-----------------------");
        modifyName(0,"Coding.");
        displaylistNames(listNames);
        System.out.println(listNames.contains("Coding."));
        if(search("Coding.")!=-1) {
        	 System.out.println("has");
        }else {
			System.out.println("not");
		}
	   
	
	
	
	}

	static void displaylistNames(ArrayList<String> listNames) {
		for (String s : listNames) {
			System.out.println(s);
		}
	}

	static void removeByPosition(int i) {
		listNames.remove(i);
	}

	static void removeByValues(String s) {
		listNames.remove(s);
	}

	static void modifyName(int index, String value) {
         listNames.set(index, value);
	}
	static int search(String name) {
		return listNames.indexOf(name);
	}
}
