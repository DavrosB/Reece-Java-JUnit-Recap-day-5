package com.qa.operators;

public class conditionals {
	
	// Conditionals allow developers / apps to make decisions based off of values it checks
	// If something is true.. do something.. else do something else
	
	// Conditional Operators - What you use to check an if statement
//	== is equal to
//	!= not equal to
//	<  below / less than
//	>  above / greater than
//	<= less than or equal
//	>= greater than or equal
//	
//	&& AND 
//	|| OR
//	
//	x = 4
//	y = 6
//	// Requires Both to be true
//	if(x == 4 && y == 7)
//		
//	// Requires One to be true
//	if(x == 4 || y == 7)
	
	public static String testMethod() {
		
		// Create an if else statement that will check:
		// Whether a number is greater than and equal to 15 AND whether a string is red
		
		int number = 17;
		String string = "red";
		String returnString;
		
		
		if(number >= 15 && string == "red") {
			returnString = "Yes!";
		} else if (number >= 15 ){
			returnString = "Number is greater than 15 which means.. String is not Red";
		} else if (string == "red") {
			returnString = "String is red, which means.. number is not 15";
		} else {
			returnString = "Nothing is true!";
		}
		
		return returnString;
	}
	
//	Exercise - Calculator Exercise 
//	- 4 Methods, one for addition, subtraction, multiplication and division
//	- Each Method takes in 2 paramaters (Ints or floats)
//	- Each method returns the sum of the 2 paramaters
//	- If a sum will work out as negative return that the sum cannot be done (e.g 5 - 7 )
//	- If a sum will be divided by 0 return back that it cannot be done (e.g 7/0)


	
	
	
	public static void conditionals() {
		
		boolean isKettleOn = true;
		
		if (isKettleOn) {
			System.out.println("Kettle is on");
		} else {
			System.out.println("Kettle is off");
		}
		
	}

}
