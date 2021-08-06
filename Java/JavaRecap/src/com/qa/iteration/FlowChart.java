package com.qa.iteration;

public class FlowChart {
	
	public static void flowChart() {
		
		// Start at 100, while 100 < 200 print A
		
		for (int a = 100; a < 200; a++) {
			System.out.println("Value of A is: " + a);
		}
	}
	
	public static void flowChartTwo() {
		
		// Start at 100
		// If A % 2 == 0 print - Else print *
		// Add 1 to A
		// If A larger than 200, finish the loop
		
		for (int a = 100; a < 200; a++) {
			System.out.println("Value of A is: " + a);
			if ( a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			
		}
		
	}
	
	public static void countTen() {
		
		for (int i = 0; i <= 10; i++) {
			
			for (int x = 0; x <= 10; x++) {
				System.out.println(x);
			}
			System.out.println(i);
		}
	}
}
