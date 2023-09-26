package org.main;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s1="java";
           String s2="java";
           String s3=new String("Java");
           String s4=new String("java");
           
           System.out.println(s1.equals(s2));
           System.out.println(s1.equals(s3));
           System.out.println(s1.equals(s4));
           System.out.println(s2.equals(s3));
           System.out.println(s2.equals(s4));
           System.out.println(s3.equals(s4));
           System.out.println(s3.equals(s4));
           System.out.println(s1.equalsIgnoreCase(s2));
           System.out.println(s1.equalsIgnoreCase(s3));
           System.out.println(s1.equalsIgnoreCase(s4));
           System.out.println(s2.equalsIgnoreCase(s3));
           System.out.println(s2.equalsIgnoreCase(s4));
           //concatenation
           System.out.println(s1+s2);
           System.out.println(s1.concat(s3));
           //using string buffer append()
           StringBuilder s5=new StringBuilder("kalaivanan");
           StringBuilder s6=new StringBuilder("skv");
           System.out.println(s5.append(s6));
	      //concatenate multiple strings using format("%s%s",s1,s2);
           System.out.println(String.format("%s%s",s1,s4));
           //concatenation usinmg join method
	}

}
