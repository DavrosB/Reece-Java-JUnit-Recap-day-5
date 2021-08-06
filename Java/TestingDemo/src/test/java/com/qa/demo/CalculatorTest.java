package com.qa.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.calculator.Calculator;

@SpringBootTest
public class CalculatorTest {
	
	// Write a test file for each class you have 
	// 4 classes, you'd have 4 test documents
	
	// I want to test the helloWorld method in my calculator
	
	static int result;
	static int x = 2;
	static int y = 5;
	static int z = 10;
	static int zero = 0;
	
	@Test
	public void helloTest() {
	
		// Arrange
		String testString;
		
		// Act 
		testString = Calculator.helloWorld();
		System.out.println(Calculator.helloWorld());
		System.out.println(testString);
		
		// Assert
		assertEquals("HelloWorld should return Hello World", "Hello World", testString);
		
	}
	
	// Write a test for my add sum method
	@Test
	public void addSumTest() {
		
		// Arrange - Using the global vars created

		// Act
		result = Calculator.addSum(x, y);
		
		// Assert
		assertEquals("addSum should return 2 + 5 = 7", 7, result);
		
	}
	
	// Write a test for sub Sum method
	
	@Test
	public void subSumTest() {
		
		// Arrange
		
		// Act
		result = Calculator.subSum(z, y);
		
		// Assert
		assertEquals("sub sum should return 10 - 5 = 5", 5, result);
		
	}
	
	@Test 
	public void subSumIfFailTest() {
		
		// Arrange
		
		// Act
		result = Calculator.subSum(x, y);
		System.out.println("result: " + result);
		
		// Assert
		assertEquals("If Y is bigger than X it returns 0", 0, result); 
		
		
	}
	
	@Test
	public void multiplyTest() {
		
		// Arrange
		
		// Act
		result = Calculator.multiplySum(x, y);
		
		// Assert
		assertEquals("2 * 5 should equal 10", 10, result);
		
	}
	
	@Test
	public void divideTest() {
		
		// Arrange
		
		// Act
		result = Calculator.divideSum(z, y);
		System.out.println("divide sum: " + result);
		
		// Assert
		assertEquals("10 / 5 should be 2", 2, result);
		
	}
	
	@Test
	public void divideZeroTest() {
		
		// Arrange
		
		// Act
		result = Calculator.divideSum(zero, y);
		System.out.println("Result: " + result);
		
		// Assert
		assertEquals("dont divide by zero",0, result);
		
	}
	
	@Test
	public void divideZeroTest2() {
		
		// Arrange
		
		// Act
		result = Calculator.divideSum(x, zero);
		System.out.println("Result: " + result);
		
		// Assert
		assertEquals("dont divide by zero",0, result);
		
	}
	
	

}
