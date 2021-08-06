package com.qa.demo;

public class PersonService {
	
	public static Person createPerson(String name, String colour, int age) {
		
		Person newPerson = new Person(name, colour, age);
		
		return newPerson;
		
	}


}
