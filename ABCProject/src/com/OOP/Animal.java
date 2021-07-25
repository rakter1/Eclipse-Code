package com.OOP;

public class Animal {
	
	String color;
	int age;
	
	//Taking variable inside the method and These variables value  will come when we call the methods from outside
	// Then These variable's  value will be initialized inside / among the Instance variable 
	
	void initObj(String s , int a ) { // 
		
		color=s;
		age=a;
	}
	
	void display() {
		System.out.println(color+ " " + age);
	}
	
	public static void main(String[] args) {
		
	Animal buzo = new Animal ();// Create object 
	buzo.initObj("black", 10);
	buzo.display();

}
}