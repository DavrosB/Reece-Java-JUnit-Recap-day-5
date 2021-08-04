package com.qa.model;

public class Cake {
	
	// Attributes of our class
	// Any objects created from this class / cake tin will have some value of these attributes
	// Every cake will have a colour, a flavour, some number of layers and will or wont have sprinkles
	public String colour;
	public String flavour;
	public int layers;
	public boolean sprinkles;
	public int numberOfCandles;
	

	// To create an object of this class - Constructor
	// A way to build something and assign it the correct properties 
	
	// Shift + alt + s
	
	// Generate Constructor using fields
	// Keep parent constructor as Object()
	// Made sure all variables/fields are selected
	
	public Cake(String colour, String flavour, int layers, boolean sprinkles) {
		super();
		this.colour = colour;
		this.flavour = flavour;
		this.layers = layers;
		this.sprinkles = sprinkles;
	}
	
	// Exercise - Create a class cocktail with at least 4 variables/fields 
	// And create 3 different objects of that class with different values
	
	// Overloading - Is allowing multiple constructors from one class, with different fields
	
	// Overloaded constructor
	public Cake(String colour, int layers, int numberOfCandles) {
		super();
		this.colour = colour;
		this.layers = layers;
		this.numberOfCandles = numberOfCandles;
	}
	
	
	// Encapsulation - Keeping stuff contained and private when it should be
	
	
	
	
	
	
	
	
	
	
	
	
	
}
