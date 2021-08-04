package com.qa.model;

public class CakeEncapsulated {
	
	private String colour;
	private String flavour;
	private int layers;
	private boolean sprinkles;
	private int numberOfCandles;
	
	public CakeEncapsulated(String colour, String flavour, int layers, boolean sprinkles, int numberOfCandles) {
		super();
		this.colour = colour;
		this.flavour = flavour;
		this.layers = layers;
		this.sprinkles = sprinkles;
		this.numberOfCandles = numberOfCandles;
	}
	
	// BAD
	public static void stealMoney() {
//		this.money = goToMyAccount();
	}
	
	// Getters and Setters
	// Getters grab the data you need, make it accessible without being a public variable
	// Setters set the data to be what you need, allowing you to add validation checks
	
	public String getColour() {
		return colour;
	}

	// I dont want to allow a cake to be set to the colour purple
	// system out it cant be done
	
	public void setColour(String colour) {
		
		if(colour == "purple") {
			System.out.println("This can't be done D:");
		} else {
			this.colour = colour;
		}
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getLayers() {
		return layers;
	}

	public void setLayers(int layers) {
		this.layers = layers;
	}

	public boolean isSprinkles() {
		return sprinkles;
	}

	public void setSprinkles(boolean sprinkles) {
		this.sprinkles = sprinkles;
	}

	public int getNumberOfCandles() {
		return numberOfCandles;
	}

	public void setNumberOfCandles(int numberOfCandles) {
		this.numberOfCandles = numberOfCandles;
	}
	
	
	
	
	
	
	
	
	

}
