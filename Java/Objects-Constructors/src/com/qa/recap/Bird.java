package com.qa.recap;

public class Bird {
	
	// What is the issue with the variables on lines 7 - 9 
	
	private String name;
	private int wingSpan;
	private boolean flight;

	// Create a constructor for this bird
	
	public Bird(String name, int wingSpan, boolean flight) {
		super();
		this.name = name;
		this.wingSpan = wingSpan;
		this.flight = flight;
	}
	
	// Overload this class and create a constructor that only looks at name and wingspan
	// It allows different forms of data to be assigned to a class
	
	public Bird(String name, int wingSpan) {
		super();
		this.name = name;
		this.wingSpan = wingSpan;
	}
	
	// Create getters and setters for this bird
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getWingSpan() {
		return wingSpan;
	}
	
	// How can I validate that the wingspan must be over 4

	// Original wingspan was 7, it wouldnt change 
	// setWingspan(4);
	
	public void setWingSpan(int wingSpan) {
		
		if(wingSpan < 4) {
			System.out.println("Too small to fly!");
		} else {
			this.wingSpan = wingSpan;
		}
		
		
		
	}

	public boolean isFlight() {
		return flight;
	}

	public void setFlight(boolean flight) {
		this.flight = flight;
	}
	
	
	
	
	
	

}
