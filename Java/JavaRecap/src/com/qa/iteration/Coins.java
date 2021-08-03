package com.qa.iteration;

public class Coins {
	
	public static void change(float cost, float moneyPaid) {
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
		
		float change = moneyPaid - cost;
		float leftOver;
		
		twenty = (int) change / 20;
		change = change % 20;
		
		ten = (int) change / 10;
		change = change % 10;
		
		five = (int) change / 5;
		change = change % 5;
		
		twoPound = (int) change / 2;
		change = change % 2;
		
		pound = (int) change / 1;
		change = change % 1;
		
		System.out.println("Twenty: " + twenty);
		System.out.println("Ten: " + ten);
		System.out.println("Five: " + five);
		System.out.println("Two Pound: " + twoPound);
		System.out.println("Pounds: " + pound);

		
		
	}

}
