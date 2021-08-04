package com.qa.arraysDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsDemo {
	
	// ArrayLists are a `collection type` - this means we have to import them 
	
	// First we create a List and pass in the data type we want and give it a name
	// This is equal to new ArrayList<>();
	
	// Next we need to import java.util.List AND java.util.ArrayList
	public static List<String> pizzaList = new ArrayList<>();
	
	// Pressing Ctrl + Shift + O will import everything you need
	
	// This method should take in a string and add a pizza of name <String>
	// Create
	public static void addPizza(String pizzaName) {
		
		// How do we add stuff to our array? 
		// arrayListName.add(What you want to add)
		pizzaList.add(pizzaName);
	
	}
	
	// Read
	public static void getOnePizza(int pizzaNumber) {
		
		// Want to get one pizza (by index)
		System.out.println(pizzaList.get(pizzaNumber));
		
	}
	
	// Update
	public static void updatePizza(int pizzaNumber, String pizzaName) {
		
		// Get one pizza (by index)
		// Update the value of pizza
		// Takes in the index number AND what you're wanting to replace with
		
//		for(String pizza : pizzaList) {
//			if(pizza == pizzaName) {
//				pizzaList.set(thisIndex, updatedPizzaName)
//			}
//		}
		
		pizzaList.set(pizzaNumber, pizzaName);
		
	}
	
	// Delete
	public static void deletePizza(int pizzaNumber) {
		
		// Deleting a pizza by index
		pizzaList.remove(pizzaNumber);
		
	}
	
	
	// ReadAll
	public static void getAllPizzas() {
		System.out.println(pizzaList);
	}

}
