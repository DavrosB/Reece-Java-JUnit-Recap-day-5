package com.qa.recap.recap;

public class RecapIteration {
	
	// Create a for loop that counts to ten, starts at 2 and increases by 1
	public static void forLoopMethod() {
		
		System.out.println("Loop ran");
		for(int i = 2; i <= 10; i++) {
			System.out.println("value of i: " + i);
		}
		
	}
	
	// Declare an int variable as the 
	// value 4 and I want to increment it by the value 5
	
	public static void increment() {
		
		int start = 4;
		int addNum = 5;
		int subNum = 5;
		int newNum = 4;
		
// 		Start is equal to 9
		start += addNum;
		
//		newNum is now equal to -1
		newNum -= subNum;
	}
	
	public static void conditional() {
		
		// Create a String variable 
		// Create an if statement that checks if the string is "red"
		// Check if colour is NOT purple
		
		String colour = "purple";
		
		if(colour == "red") {
			System.out.println("Colour is red");
		} else if(colour != "purple") {
			System.out.println("Colour is not purple");
		} else {
			System.out.println("Colour is Purple!");
		}
		
		// Create a bool variable
		// With short hand, if the bool is true print out "Bool is true"
		
		boolean boolVar = false;
		
//		Booleans are inheriently true or false
		
// 		
		if(boolVar) {
			System.out.println("Bool is true");
		} else if(boolVar != true) {
			System.out.println("Bool is false");
		}
		
		// Create an int of value 5 and a bool of value false
		// If statement that checks if value is over 7 OR if value is false
		
		int number = 5;
		boolean bool = false;
		
		if(number > 7 || !bool) {
			System.out.println("It is either over 7 or value is false");
		}
		
		// If number is over 7 AND bool is false, do this
		if(number > 7 && !bool) {
			System.out.println("It is over 7 AND the bool is false");
		} else if (number > 7) {
			System.out.println("Number is greater than 7");
		} else if (!bool) {
			System.out.println("Bool is false");
		} else {
			System.out.println("Nothing is correct!");
		}
		
	}

}
