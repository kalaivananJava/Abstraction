package org.main;

public enum Learning {
    COREJAVA(1),COLLECTIONS(2),GENERICS(3),JSPANDSERVLETS(4),MULTITHREADING(5);
    private final int concept;
     
  //if i not give corejava'(1)' value for all constants then
    //we need to define empty constructor...
    private  Learning(int i){
    	this.concept=i;
    }
    public int getConcept() {
    	return concept;
    }
}
