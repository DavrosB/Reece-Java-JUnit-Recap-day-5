package com.qa.demo;

public class Vehicle {
	
	private String colour;
	private int numberOfWheels; 
	private int engineSize; 
	private boolean spoiler;
	
	// Constructor
	public Vehicle(String colour, int numberOfWheels, int engineSize, boolean spoiler) {
		super();
		this.colour = colour;
		this.numberOfWheels = numberOfWheels;
		this.engineSize = engineSize;
		this.spoiler = spoiler;
	}

	
	// Getters and Setters
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public boolean isSpoiler() {
		return spoiler;
	}

	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	} 
}
