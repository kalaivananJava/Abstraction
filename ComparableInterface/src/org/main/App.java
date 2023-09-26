package org.main;



import java.util.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Names implements Comparable<Names>{
	private String name;
	
	public Names(String name) {
		this.name=name;
	}
	
	public int compareTo(Names obj) {
		System.out.println(this.name+" "+obj.name);
		if(name.length()==obj.name.length()) {
		return 0;
		}
		else if(name.length()<obj.name.length()){
			return -1;
		}else {
		return 1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
public class App {

	public static void main(String[] args) {
          
          List<Names> name=new LinkedList<>();
          name.add(new Names("Chaand"));
          name.add(new Names("Sek"));
          name.add(new Names("Dh"));
          name.add(new Names("j"));
          name.add(new Names("ABD"));
        
          
          App app=new App();
          app.printList(name);
          
       Collections.sort(name);
          System.out.println("------------------------------") ;
          app.printList(name);
          
	}

	 void printList(List<Names> li) {
		 ListIterator<Names> ltr=li.listIterator();
		 while(ltr.hasNext()) {
			 System.out.print(ltr.next()+" ");
		 }
	 }

	

	
}
