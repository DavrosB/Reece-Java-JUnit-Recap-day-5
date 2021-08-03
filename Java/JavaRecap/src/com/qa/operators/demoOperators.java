package com.qa.operators;

public class demoOperators {
	
//	+ add elements together
//	- subtracts
//	* multiplies
//	/ divides
	
//	int sum = 5 + 5;
//	sum = 10;
	
//	Modulus returns the remainder when something 
	
//	% 10 / 3 
//	3 remainder 1 
//	% 10 / 3 = 1 
//	10 % 3 = 1
	
	// Class of 30 and wanted to split into groups of 4
//	30 % 4 = 2 
			
	// Useful for working out primes, if something is even and what it can be divided into
			
//	if (x % 2 == 0) {
//		itsEven();
//	} else {
//		itsOdd();
//	}
	
	// Increments
	
//	int newNum = 4; 
//	
//	int newTotal = newNum + 4; 
//	
//	newNum += 4;
	
	public static void intMethod() {
		
		int newNum = 4;
		int addNum = 4;
		
		int subNum = 2; 
		

		newNum += addNum;
		System.out.println("====================");
		System.out.println(newNum);
		System.out.println("====================");
		
		newNum ++;
		System.out.println(newNum);
		
		newNum ++;
		System.out.println(newNum);
		
		newNum --; 
		System.out.println(newNum);
		
		newNum -= subNum;
		System.out.println("====================");
		System.out.println(newNum);
		System.out.println("====================");
		
	}
	

	
	

}
