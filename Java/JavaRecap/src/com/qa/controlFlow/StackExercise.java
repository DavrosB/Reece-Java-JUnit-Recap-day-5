package com.qa.controlFlow;

public class StackExercise {
	
	// Create 3 methods with one being called from the runner
	
	// That method calls another, system logs it has been called
	
	// Pass a string from runner to tertiary
	
	public static void primary(String name) {
		System.out.println("Primary method called, and Hey " + name);
		secondary();
	}
	
	public static void secondary() {
		System.out.println("Secondary method called!");
		tertiary();
	}
	
	public static void tertiary() {
		System.out.println("Tertiary method called!");
	}

}
