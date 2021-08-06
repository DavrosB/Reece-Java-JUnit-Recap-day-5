package com.qa.demo;

public class Person {
	
	private String name;
	private String favColour;
	private int age;
	
	public Person(String name, String favColour, int age) {
		super();
		this.name = name;
		this.favColour = favColour;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavColour() {
		return favColour;
	}

	public void setFavColour(String favColour) {
		this.favColour = favColour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}
