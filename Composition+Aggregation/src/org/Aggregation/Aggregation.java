package org.Aggregation;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class Employee{
String name;
int age;
Address addr;

Employee(String name,int age,Address addr){
   this.name=name;
   this.age=age;
   this.addr=addr;
}
public void display(){
    System.out.print(name+" "+age+" ");
    addr.display();
}
}
class Address{
String city,district,state;
Address(String city,String district,String state){
   this.city=city;
   this.district=district;
   this.state=state;
}
public void display(){
    System.out.print(city+" "+district+" "+state);
}
}
public class Aggregation{
public static void main(String[] args) {
  
   Address addr=new Address("Perundurai","Erode","Tamil Nadu");
   Employee emp=new Employee("Kalaivanan",20,addr);
   emp.display();
}
}
