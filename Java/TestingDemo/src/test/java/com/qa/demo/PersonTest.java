//package com.qa.demo;
//
//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.qa.demo.Person;
//import com.qa.demo.PersonService;
//
//@SpringBootTest
//public class PersonTest {
//		
//	@Test
//	public void createPersonTest() {
//		
//		// Arrange
//		Person testPerson = new Person("test_name", "test_colour", 123);
//		String name = "test_name";
//		String colour = "test_colour";
//		int age = 123;
//		
//		// Act
//		
//		Person personResult = PersonService.createPerson(name, colour, age);
//		
//		// Arrange
//		assertEquals(testPerson.getName(), personResult.getName());
//		assertEquals(testPerson.getFavColour(), personResult.getFavColour());
//		assertEquals(testPerson.getAge(), personResult.getAge());
//		assertEquals(testPerson.getClass(), personResult.getClass());
//		
//		
//		
//	}
//	
//}
//
