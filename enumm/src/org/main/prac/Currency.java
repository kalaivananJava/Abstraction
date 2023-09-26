package org.main.prac;


public enum Currency{ 
	PENNY(1),NICKLE(5),DIME(10),QUATER(50); 
 
	public final int currencyValue; 
 
	private Currency(int currencyValue){ 
	this.currencyValue = currencyValue; 
	} 
 
	public int getCurrencyValue(){ 
	return currencyValue; 
	} 
	public static void main(String arg[]){ 
		System.out.println(Currency.valueOf("PENNY"));
	System.out.println(Currency.valueOf("PENNY").getCurrencyValue()); 
	} 
} 