package com.variable;

public class AV {
	
	int a = 10;
	static int b= 20;
		
	public static void main(String[] args) {
		AV obj= new AV();
		System.out.println(obj.a);
		System.out.println(obj.b); //static 
		obj.a=1000; // change the value of a and b.
		obj.b=2000;
		System.out.println(obj.a);
		System.out.println(obj.b);// here it will show  change value
		
		// If I create another object of AV class
		AV obj1= new AV();
		System.out.println(obj1.a);
		System.out.println(obj1.b); }}
		
	