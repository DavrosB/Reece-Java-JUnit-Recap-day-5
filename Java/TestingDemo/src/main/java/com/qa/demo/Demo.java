package com.qa.demo;

public class Demo { 
	
	// Creating a new class to test
	
	// Create a method that returns and prints out the string "Hello World"
	
	public static String printsHello() {
		
		System.out.println("Hello World");
		return "Hello World";
		
	}
	
	// Create a method that returns Hello <your name> !!! 
	
	public static String printsName(String name) {
		
		return "Hello " + name;
		
	}
	
	// Create a method that doubles and adds 4 to your number
	
	public static int doubleSum(int num) {
		
		int result = num * 2;
		result += 4;
		return result;
		
	}

}
