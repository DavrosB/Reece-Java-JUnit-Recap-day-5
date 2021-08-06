package com.qa.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleServiceTest {
	
	// I want to test the createVehicle creates a vehicle, and I want
	// to validate the colour and number of wheels are the same
	
	@Test
	public void createVehicleTest() {
		
		// Test would be testing if the return is equal to the return
		
		// Arrange
		// Creating a test vehicle for our expected
		Vehicle testVehicle = new Vehicle("test_colour", 4, 6, true);
		
		// Creating variables to pass into the method
		String colour = "test_colour";
		int wheels = 4;
		int size = 6;
		boolean spoiler = true;
		
		// Variable for the method to be equal to
		Vehicle resultVehicle;
		
		// Act - Do the method we're testing, save it as a variable
		// resultVehicle = class.method(Pass in paramaters)
		resultVehicle = VehicleService.createVehicle(colour, wheels, size, spoiler);
		
		// Assert
		System.out.println("=========================");
		System.out.println(testVehicle);
		System.out.println(resultVehicle);
		System.out.println("=========================");
		assertEquals(colour, resultVehicle.getColour());
//		assertEquals(testVehicle.getColour(), resultVehicle.getColour());
		
	}

}
