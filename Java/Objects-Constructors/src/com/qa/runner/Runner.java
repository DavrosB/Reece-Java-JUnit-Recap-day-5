package com.qa.runner;

import java.util.ArrayList;
import java.util.List;

import com.qa.model.Cake;
import com.qa.model.CakeEncapsulated;

public class Runner {
	
	public static void main(String[] args) {
		
		// Create a new object of cake with the following qualities
		// Chocolatey brown
		// Black forest gateaux
		// Four layers
		// No Sprinkles
		
//		Cake newCake = new Cake("Chocolate", "Black forest Gateuax", 4, false);
//		Cake pancake = new Cake("Beige", 10, 4);
//		
//		System.out.println(pancake.colour);
//		System.out.println(pancake.layers);
//		System.out.println(pancake.flavour);
//		
//		System.out.println(newCake.flavour);
//		System.out.println(newCake);
//		System.out.println(newCake.layers);
//		
		// Create a birthday cake
		
//		Cake birthdayCake = new Cake("Vanillay beigey", "Victoria Sponge", 2, true);
//		System.out.println(birthdayCake.colour);
//		System.out.println(birthdayCake.flavour);
		
		CakeEncapsulated safeCake = new CakeEncapsulated("Brown", "Chocolate Caterpillar cake", 1, true, 25);
		System.out.println(safeCake.getFlavour());
		
		// Setting a new colour - change it to pink
		safeCake.setColour("purple");
		System.out.println(safeCake.getColour());
		
//		List<CakeEncapsulated> cakeList = new ArrayList<>();
//		
//		CakeEncapsulated newerCake = new CakeEncapsulated("pink", "almondy", 4, false, 0);
//		cakeList.add(newerCake);
//		cakeList.add(newerCake);
//		System.out.println(cakeList);
		
		// Creating an array list that takes in CakeEncapsulated..
		List<CakeEncapsulated> cakeList = new ArrayList<>();
		
		// Adding a cake that has already been constructed
		cakeList.add(safeCake);
		
		System.out.println(cakeList);
		
		
		
	}
	
}
