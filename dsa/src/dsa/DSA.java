package dsa;

import java.util.*;
class Darray<T> implements Iterable<T>{
	private static final int initialCap=16;
	private int capacity;
	int size;
	T arr[];
	@SuppressWarnings("unchecked")
	Darray(){
		capacity=initialCap;
		size=0;
		arr=(T[]) new Object[capacity];
	}
	void Insert(T val) {
		if(size==capacity)
			expandArray();
		
		arr[size++]=val;
	}
	void expandArray() {
		capacity*=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	void display() {
		if(size==0)
			System.out.println("empty");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void InsAtPos(int pos,T d) {
		if(pos>size)
			System.out.println("Invalid position");
		else if(size==capacity)
			expandArray();
	     for(int i=size-1;i>=pos;i--) {
	    	 arr[i+1]=arr[i];
	     }
	     arr[pos]=d;
	     size++;
	}
	void DelAtpos(int pos) {
		if(size==0)
			System.out.println("empty");
	     
		for(int i=pos+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(capacity>initialCap && capacity>3*size) {
			shrinkArray();
		}
		
	}
	private void shrinkArray() {
		capacity/=2;
		arr=Arrays.copyOf(arr, capacity);
	}
	public Iterator<T> iterator(){
		
		return new Iterator<T>(){
			int index=0;
			public T next(){
				return arr[index++];
			}
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<size;
			}
		};
		
	}
	void delAtend() {
		if(size==0)
			System.out.println("empty");
	    size--;
	}
	void delAtbeg() {
		if(size==0)
			System.out.println("empty");
		
		for(int i=1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		
	}
	void insAtbeg(T val) {
		if(size==0)
			arr[0]=val;
		else {
		for(int i=size-1;i>=0;i--) {
			arr[i+1]=arr[i];
			
		}
		arr[0]=val;
		size++;
		}	
	
	}
	 T get(int i) {
		 
		return arr[(int) i];
		
	}
	void update(T v,int p) {
		arr[p]=v;
	}
	int search( T val) {
		int ind=-1;
		for(int i=0;i<size;i++) {
			if(arr[i]==val) {
			ind =i;
			break;
			}
		}
		return ind;
	}
}
public class DSA {
     public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Darray<Integer> ll = new Darray<>();
//		int val,pos,choice;
//		while(true) {
//			System.out.println("1.Insert  2.Display  3.Insert pos  4.Delete at pos  6.delete at end  7.delete at beginning  8.insert at beggining  9.get the value on index   5.exit");
//			System.out.println("11.update the value at index  12.search the value  13.clear  14.contains the element or not");
//			choice = sc.nextInt();
//			switch(choice) {
//			case 1:
//				System.out.println("enter a value");
//				val =sc.nextInt();
//				ll.Insert(val);
//				break;
//			case 2:
//				//ll.display();
//				for(int a:ll) {
//					System.out.println(a);
//				}
//				break;
//			case 3:
//				System.out.println("enter a pos");
//				
//				pos=sc.nextInt();
//				System.out.println("enter a val");
//				val=sc.nextInt();
//			   ll.InsAtPos(pos,val);	
//			    break;
//			case 4:
//				System.out.println("Enter the pos");
//				pos=sc.nextInt();
//				ll.DelAtpos(pos);
//				break;
//			case 5:
//				System.exit(0);
//				break;
//			case 6:
//				ll.delAtend();
//				break;
//			case 7:
//				ll.delAtbeg();
//				break;
//			case 8:
//				System.out.println("eneter the value");
//				val=sc.nextInt();
//				ll.insAtbeg(val);
//				break;
//			case 9:
//				System.out.println("enter  the index");
//				val=sc.nextInt();
//				System.out.println( ll.get(val));
//				break;
//			case 10:
//				System.out.println("enter  the index");
//				pos=sc.nextInt();
//				System.out.println("eneter the value");
//				val=sc.nextInt();
//				ll.update(val,pos);
//				break;
//			case 11:
//				System.out.println("enter the value to search");
//				val=sc.nextInt();
//				System.out.println(ll.search(val));
//				break;
//			default:System.out.println("Invalid");
//			}
//		}
    	
	}
}
