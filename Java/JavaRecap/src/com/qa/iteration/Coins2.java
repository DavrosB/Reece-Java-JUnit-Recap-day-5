package com.qa.iteration;

public class Coins2 {
	
	public static void changeCalculate(float cost, float amountPaid) {
		
		// Create variables for all types of change
		
		int fifty;
		int twenty;
		int ten;
		int five;
		int twoPound;
		int pound;
		int fiftyPence;
		int twentyPence;
		int tenPence;
		int fivePence;
		int twoPence;
		int penny;
		
		// Create working variables for calculations
		// Cost, amountPaid, leftover Change
		// Change is amount paid - cost
		
		float change = amountPaid - cost;
		System.out.println(change);
		
//		4.94 = 4
		fifty = (int) (change / 50);
		System.out.println(fifty);
		
		// Change equal to the remainder of leftover change divided by 50
		change = change % 50;
//		change -= (50 * fifty); 
		
		twenty = (int) change/20;
		change = change % 20;
		
		// Using a while loop to check if leftover change is higher than 20
		while (change > 20) {
			// If change is higher, add one to twenty and subtract 20 from change
			twenty++;
			change =- 20;
		} 
		
		while (change > 10) {
			
		}
		
	}

}
