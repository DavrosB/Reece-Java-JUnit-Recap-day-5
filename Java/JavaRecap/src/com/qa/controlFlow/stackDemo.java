package com.qa.controlFlow;

public class stackDemo {
	
	// First Layer
	
	public static int firstLayer(int startNum) { // Called by Main
		System.out.println("First Layer called");
		int total = startNum;
		
		// += Take variable (total) and add other variable to it
		total += secondLayer(10); // Calls Second Layer method
		total += secondLayer(7);
		System.out.println("First Layer finished");
		return total;
	}
	
	public static int secondLayer(int addNum) { // Called by first layer
		System.out.println("Second layer called");
		int subTotal = 4; 	// Starts off with 4
		subTotal += addNum; // Adds addNum to 4
		System.out.println("Second layer finished");
		return subTotal;	// Returns new total
	}
	
	public static void firstLayerString() {
		System.out.println("First Layer called");
		secondLayerString();
		secondLayerString();
		System.out.println("First Layer finished");
	}
	
	public static void secondLayerString() {
		System.out.println("Second layer called");
		
		System.out.println("Second layer finished");
	}
	
	public static void otherSecondLayerString() {
		System.out.println("Third layer called");
		
		System.out.println("Third layer finished");
	}
	
	

}
