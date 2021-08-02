package com.qa.demo;

public class Runner {
	
	// Main method of the project, when running the app this is the first thing that runs
	// () What you're passing into the method
	// {} What is the body of the method
	// [] Is an array
	public static void main(String[] args) {
		// What the method actually does, it prints out a line
		// System.out.println("Hello World!");
		printName("Reece");
		printMessage();
	}
	
	// Method to be called 
	public static void printMessage() {
		System.out.println("Hello World");
	}
	
	// Method that takes in a parameter
	public static void printName(String name) {
		System.out.println("Hello " + name);
	}

}
