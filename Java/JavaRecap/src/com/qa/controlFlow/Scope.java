package com.qa.controlFlow;

public class Scope {
	
//	Scope is the level of access and visibility a variable or method has
// 	Two types of basic scope
// 	Global - Variables in global are accessible ANYWHERE within the class
// 	Local  - Varibales that are local are accessible in the method they're created
	
	// Global as declared outside of a method within the class
	public static int numberVar = 123;
	
	public static int passportNumber = 123456789;
	
	public static void fakeMethod() {
		// Local as declared inside of a method within a class
		String stringVar = "test";
		
		System.out.println(numberVar);
		System.out.println(stringVar);
	}
	
	public static void newMethod() {
		// Won't work as local variable
//		System.out.println(stringVar);
	}
	
	public static void showName() {
		System.out.println(passportNumber);
	}
	
//	Scope Priorities
//	1) Local
//	2) Global (if no security concerns)

}
