package com.qa.calculator;

public class Sums {
	
	// Create 4 methods, add, sub ..
	
	// Each method takes in 2 params, and returns the sum of the params
	
	// if a sum is negative, say it cant be done AND if a sum divides by 0 can't be done
	
	// Print out the sum and the result
	
	// Pass in a boolean, that checks if you want to do the sum twice
	
	public static int addSum(int x, int y) {
		
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		
		return result;
		
	}
	
	public static int addSumBool(int x, int y, boolean bool) {
		
		// If bool = true, add y to x again
		
		int result = x + y;
		
		if(bool == true) {
			result += y;
			System.out.println(x + " + " + y + " + " + y + " = " + result);
		} else {
			System.out.println(x + " + " + y + " = " + result);
		}
		
		return result;
	}
	
	public static int addSumString(String x, String y) {
		
		int xNum = 0;
		int yNum = 0;
		
//		x = "one" y = "two"
		
		if(x == "one" || y == "one") {
			xNum = 1;
		} else if (x == "two") {
			xNum = 2;
		} else if (x == "three") {
			xNum = 3;
		} else {
			xNum = 4;
		}
		
		if(y == "one") {
			yNum = 1;
		} else if (y == "two") {
			yNum = 2;
		} else if (y == "three") {
			yNum = 3;
		} else {
			yNum = 4;
		}
		
		int result = xNum + yNum;
		
		System.out.println(x + " + " + y + " = " + result);
		
		return result;
		
	}
	
	public static int subSum(int x, int y) {
		
		int result = 0;
		
		if(y > x) {
			System.out.println("Second value is greater, result will be negative");
		} else {
			result = x - y;
			System.out.println(x + " - " + y + " = " + result);
		}

		return result;
		
	}
	
	public static int multiplySum(int x, int y) {
		
		int result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		
		return result;
		
	}
	
	public static int divideSum(int x, int y) {
		
		int result = 0;
		
		// If x or y = 0 don't do the sum
		if(x == 0 || y == 0) {
			System.out.println("Dont divide by 0!");
		} else {
			result = x / y;
			System.out.println(x + " / " + y + " = " + result);
		}
		
		return result;
		
	}
	
	
	

}
