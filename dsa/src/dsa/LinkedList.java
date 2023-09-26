package dsa;

import java.util.*;
class Ll<T> implements Iterable<T>{
	Node head;
	class Node{
		Node next;
		T data;
		
		Node(T d){
			data=d;
			next=null;
		}
	}
	void insert(T val) {
		Node node=new Node(val);
		if(head==null)
			head=node;
		else {
		 Node temp=head;
		 while(temp.next!=null)
			 temp=temp.next;
		 temp.next=node;
		 
		}
	}
	void display() {
		if(head==null)
		{
			throw new IndexOutOfBoundsException("Empty");
			
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(
						temp.data+" ");
				temp=temp.next;
				
			}
			
		}
	}
	void delete() {
		if(head==null)
			throw new IndexOutOfBoundsException("Empty");
		else {
			Node temp=head;
			Node prev=null;
			if(temp.next==null) {
				head=null;
				temp=null;
			}else {
				
			
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			
			prev.next=temp.next;
			
			}
		}
	}
	void insAtpos(T val,int pos) {
	
		if(head==null)
			throw new IndexOutOfBoundsException("Empty");
		
		else {
			Node newnode=new Node(val);
			Node temp=head;
			if(pos==0) {
				newnode.next=temp;
				head=newnode;
				return;
			}else {
			for(int i=0;i<pos-1;i++) {
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
			
		}
		}
		
	}
	void delAtpos(int pos) {
		
		if(head==null) {
			throw new IndexOutOfBoundsException("Empty"); 
		
			
		}
		if(pos==0) {
			head=head.next;
		}
		else {
			Node temp=head;
			
			Node prev=null;
			for(int i=0;i<pos;i++) {
				prev=temp;
				
				temp=temp.next;
			}
		prev.next=temp.next;
		}
	}
	@Override
	public Iterator<T> iterator(){
		return new Iterator<T>(){
		Node temp=head;
		public boolean hasNext() {
		    return temp!=null;
		}
		public T next() {
			T val=temp.data;
			temp=temp.next;
			return val;
		}
	};

}
	public void reverse() {
		
		Node prev=null,current =head,next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
}

public class LinkedList {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val,pos;
		Ll<Integer> l=new Ll<>();
		while(true) {
			System.out.println("1.insert next 2.delete next 3.insAtpos 4.delAtpos  5.print 5.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("enter value: ");
				val=sc.nextInt();
				l.insert(val);
				break;
			case 2:
				l.delete();
				break;
			case 3:
				System.out.println("value: ");
				val=sc.nextInt();
				System.out.println("pos: ");
				pos=sc.nextInt();
				l.insAtpos(val,pos);
				break;
			case 4:
				System.out.println("pos: ");
				pos=sc.nextInt();
				l.delAtpos(pos);
				break;
			case 5:
				//l.display();
				for(int a:l) {
					System.out.print(a+" ");
				}
				Iterator<Integer> it =l.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 6:
				l.reverse();
				break;
				
			default:
				System.out.println("invalid bro...");
				
			}
			
		}
	}
}

