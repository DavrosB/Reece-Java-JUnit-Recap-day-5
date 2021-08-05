package com.qa.model;

public class CakeClassMembers {
	
	// Class Members 
	// Static - Assigned to the class, so every object of this 
	// class will have the same value for this variable
	// Instanced - Every unique object has a unique value for this variable
	
	// Static methods or variables are assigned to the class and not the object
	
	// variables and methods are `instanced` by default, which means they are 
	// unique for each object
	
	// Final - It cannot be changed, it is the final variation of it? 
	
	private String colour;
	private String flavour;
	private int layers;
	private boolean sprinkles;
	
	// Static values are the same across all objects but can change
	public static int numberOfCakes = 0;
	
	// Final values will always stay as this value
	static final String cakeTinNumber = "abc1237jd";

	public CakeClassMembers(String colour, String flavour, int layers, boolean sprinkles) {
		super();
		this.colour = colour;
		this.flavour = flavour;
		this.layers = layers;
		this.sprinkles = sprinkles;
		
		// Whenever I run this constructor I want to increment numberOfCakes by 1
		numberOfCakes++;
		
	}
	
	public static void sayHello() {
		
		System.out.println("Hello World!");
		
	}
	
	public void sayHello2() {
		System.out.println("Hello again!");
	}
	
	// Static is for class stuff - admin, management
	// Not Static is for object stuff - Data, unique values
	
	
	
	
	
	
	
	

}
