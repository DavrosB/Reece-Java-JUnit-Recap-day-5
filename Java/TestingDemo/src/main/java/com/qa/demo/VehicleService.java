package com.qa.demo;

public class VehicleService {
	
	// I want to create a method that takes in paramaters and returns a new vehicle
	
	// Takes in colour, wheelNumber, engineSize and spoiler
	public static Vehicle createVehicle(String colour, int numberWheels, int size, boolean spoiler) {
		
		// Very Strongly Typed - You have to tell it what data type
		// It expects, if it is not that it isn't happy
		
		// Creates vehicle called newVehicle with these paramaters
		Vehicle newVehicle = new Vehicle(colour, numberWheels, size, spoiler);
		
		// Prints out the vehicle and the colour of it
		System.out.println(newVehicle);
		System.out.println("Vehicle colour: " + newVehicle.getColour());
		
		// Returns the vehicle
		return newVehicle;
		
	}
	
	
	public static String helloWorld() {
		
		return "Hello";
		
	}
	


}
