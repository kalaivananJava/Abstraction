package org.main;



import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names>{
	private String name;
	
	public Names(String name) {
		this.name=name;
	}
	
	public int compareTo(Names obj) {
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
public class GenericList {

	public static void main(String[] args) {
		 List<Object> elements=new LinkedList<>();
         elements.add(new Names("Chaand"));
         elements.add(new Names("Sek"));
         elements.add(new Names("Dh"));
         elements.add(new Names("j"));
         elements.add(new Names("ABD"));
         elements.add(12);
         elements.add(2.0);
         elements.add('#');
         GenericList app=new GenericList();
        app.printList(elements);
         
      //  Collections.sort(elements); -->we cant sort the Object type list
         System.out.println("------------------------------") ;
         
         
	}

	 void printList(List<Object> li) {
		 ListIterator<Object> ltr=li.listIterator();
		 while(ltr.hasNext()) {
			 System.out.print(ltr.next()+" ");
		 }
	 }
}
