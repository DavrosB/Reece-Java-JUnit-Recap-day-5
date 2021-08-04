package com.qa.arraysDemo;

public class ArraysDemo {
	
	// Arrays are immutable (non modifiable) collections of objects
	// A train in transit you can't just take cars off of it, but the cars can or cannot be in use 
	
	public static void arrayDemo() {
		
		// Single dimension interger array
		
		// Creating an array of intergers
		int[] numArray;
		
		// Creating an array of Strings
		String[] stringArray;
		
		// Creating an array of Cars
//		Cars[] carArray;
		
		// Creating an array of numbers
		int[] newNumArray = {10,21,13,4569,5};
		
		// Accessing these values
		
		// Arrays index from 0
		// Length start from 1
		// 0, 1, 2, 3, 4
		// 10,21,13..
		System.out.println(newNumArray[1]);
		System.out.println(newNumArray);
		
		System.out.println("=====================");
		System.out.println(newNumArray.length);
		System.out.println("=====================");
		
		// How can I print out every value of this array using a for loop??
		// Starting from 0
		// For all times i is less than 5
		// Print out the array
		// Increment by 1
		
		// Plugging in the length of the array so the loop always works
		for(int i = 0; i < newNumArray.length; i++) {
			
			if (i > 2) {
//				dontPrintOut();
			} else {
				System.out.println(newNumArray[i]);
			}
			
		}
		
		// Assigning array values 
		System.out.println("***************************");
		System.out.println(newNumArray[2]);
		newNumArray[2] = 100;
		System.out.println(newNumArray[2]);
		
		// Enhanced for loop
		System.out.println("---------------------------");
		for(int num : newNumArray) {
			System.out.println(num);
			System.out.println(newNumArray.length);
		}
		
	}

	
	// Enhanced for loops used for arrays
	
//	for(int i : newNumArray) {
//		System.out.println(i);
//	}
//	
//	// Exercise - 
//	int numList[] = {1,2,3,4,5,6,7,8,9,10};
//	- With the above array, use loops and indexing to print out the square of each number
//	- ("Square of i is : <value>")
//	
//	- Create a new array which contains the squared values of this array
//	- i * i 
	
}




