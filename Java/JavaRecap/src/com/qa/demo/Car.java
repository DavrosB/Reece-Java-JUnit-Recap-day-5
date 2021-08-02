package com.qa.demo;

public class Car {
	
	// Attributes
	// The Default values of the car
	String colour = "Red";
	int noOfWheels = 4;
	
	// Methods
	
	// Static means this method / attribute belongs to the CLASS
	
	public void goForward() {
		System.out.println("Drives forward!");
	}
	
	public void brake() {
		System.out.println("Brake!");
	}

	// Constructor 
	// Shift Alt S to generate stuff
	
	public Car(String colour, int noOfWheels) {
		super();
		this.colour = colour;
		this.noOfWheels = noOfWheels;
	}
	
	
	

}
