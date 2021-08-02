package com.qa.controlFlow;

public class FlowControl {
	
	// Create a method that doesn't return anything and prints out "Im first"
	
	public static void printsFirst() {
		System.out.println("Im first");
	}
	
	
	// Runs all methods from top to bottom
	public static void printsSecond() {
		FlowControlChild.printsThird();
		FlowControlChild.printsFirst();
		FlowControlChild.printsSecond();
	}
	
	public static void printsThird() {
		System.out.println("Im Third");
	}

}
