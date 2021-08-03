package com.qa.switchCase;

public class Demo {
	
	// Switch case - A way of choosing a condition or a method body based on a variable
	// A better way to do nested if else statements
	
	public static void switchCase() {
		
		String colour = "red";
		int number = 0;
		
		switch(colour) {
		
		case "red" :
			System.out.println("I'm Red!");
			break;
			
		case "blue":
			System.out.println("I'm Blue!");
			break;
			
		default:
			System.out.println("Unexpected colour.. ");
			break;
		
		}
		
		switch(number) {
		
		case 0 :
			System.out.println("I'm 0");
			break;
			
		case 1 :
			System.out.println("I'm 1");
			break;
		
		}
		
		
		
	}

}
