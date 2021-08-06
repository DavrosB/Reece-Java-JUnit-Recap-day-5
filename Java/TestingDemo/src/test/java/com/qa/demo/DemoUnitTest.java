package com.qa.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.demo.Demo;

@SpringBootTest
public class DemoUnitTest {
	
	// I want to test when we run this method, 
	// it prints the string "Hello World"
	
	// tests are ordered semi randomly
	// Tests that haven't passed before (or failed previously) are ran 
	// semi randomly first
	
	// Its important that tests do not rely on eachother
	
	@Test
	public void testPrintsHello() {
		
		// Arrange
		String testString; 
		
		// Act
		testString = Demo.printsHello();
		System.out.println(testString);
		
		// Assert
		assertEquals("Hello World should match Hello World","Hello World", testString);
	}
	
	@Test
	public void testPrintsHelloName() {
		
		// Arrange
		String testString; 
		String testName = "Reece";
		
		// Act
		testString = Demo.printsName(testName);
		System.out.println(testString);
		
		// Assert
		assertEquals("Hello " + testName, testString);
		
		
	}
	
	@Test
	public void testDoubleSum() {
		
		// Arrange
		int result;
		int multiplyNum = 10;
		
		// Act
		result = Demo.doubleSum(multiplyNum);
		
		// Assert
		assertEquals("10 * 2 + 4 = 24", 24, result);
		
	}
	
	

}
