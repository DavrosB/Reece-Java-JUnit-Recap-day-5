package com.qa.iteration;

import com.qa.arraysDemo.ArrayListsDemo;
import com.qa.arraysDemo.ArraysDemo;
import com.qa.recap.recap.RecapIteration;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println("Main working");
//		Demo.forLoop();
//		Demo.whileLoop();
//		Demo.doWhileLoop();
//		FlowChart.flowChart();
//		FlowChart.flowChartTwo();
//		FlowChart.countTen();
//		Coins.change(5f, 62.50f);
//		Coins2.changeCalculate(17.56f, 78.93f);
//		RecapIteration.forLoopMethod();
//		RecapIteration.conditional();
//		ArraysDemo.arrayDemo();
		ArrayListsDemo.getAllPizzas();
		ArrayListsDemo.addPizza("Chocolate Pizza");
		ArrayListsDemo.addPizza("Hawiaan");
		ArrayListsDemo.addPizza("Pepperoni");
		ArrayListsDemo.addPizza("Seafood");
		ArrayListsDemo.addPizza("Margherita");
		ArrayListsDemo.getAllPizzas();
		ArrayListsDemo.getOnePizza(4);
		ArrayListsDemo.getOnePizza(1);
		ArrayListsDemo.updatePizza(2, "Vegetarian Hot");
		
		ArrayListsDemo.deletePizza(3);
		
		ArrayListsDemo.getAllPizzas();
	}

}
