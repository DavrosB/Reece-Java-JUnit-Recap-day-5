package com.qa.iteration;

public class Demo {
	
	// Iteration is just looping through code, keeping track of how many times you've looped
	// Useful for when you need to run a command / method more than once
	
	// Simple and Enhanced
	// Simple: For, while, do-while
	// For 	 	- A set number of times, do this for 7 times
	// While 	- While something is true, keep doing it
	// Do-while - Do the thing once THEN keep doing until the thing is false
	
	public static void forLoop() {
		
		// Starting from 0
		// For when x is less than 10 doThing();
		// Add 1 to i after every loop
		for (int i = 0; i <= 10; i++) {
			System.out.println("Value of i is: " + i);
		}
		
		System.out.println("***********************");
		
		int subNum = 2;
		
		// Starting from 10
		// For when x is greater than 2 doThing();
		// Subtract 1 from x after every loop
		for (int x = 30; x > 2; x-=subNum ) {
			System.out.println("Value of x is: " + x);
		}
		
	}
	
	public static void whileLoop() {
		
		// While loop, while tooManyPlants is false, do the loop
		// tooManyPlants becomes true when housePlants = 40
		
		int housePlants = 0;
		boolean tooManyPlants = false;
		
		while(!tooManyPlants) {
			housePlants ++;
			System.out.println("One more plant added, current total is: " + housePlants);
			
			if(housePlants > 40) {
				tooManyPlants = true;
			}
		} 
	}
	
	public static void doWhileLoop() {
		
		// Counter adds 2 every loop, when counter is more than 10 it stops
		
		int counter = 2;
		boolean counterMax = false;
		
		do {
			counter += 2;
			System.out.println("Counter Value: " + counter);
			
			if(counter > 10) {
				counterMax = true;
			}
			// ! Not - While CounterMax is NOT true (false)
		} while(counterMax == false);
		
	}

}
