package com.polymorphism;
public class TestAOverloading {

	void show(int a, float b) {
		System.out.println("int float method");// parent class
	}
	void show(float a, int b) {
		System.out.println("float int method"); // child 
	}
	public static void main(String [] arg) {

		TestAOverloading obj = new TestAOverloading ();
		obj.show(10,20.5f);
		obj.show(20.5f, 15);
		//obj.now(10,20)// Compiler confuses and it is ambiguity error
	} }
//int float method
//float int method