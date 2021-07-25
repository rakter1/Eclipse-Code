package com.javacore;

public class Person extends MethodOverridingDemo{
	
	public void setUP() {
		
		MethodOverridingDemo md = new MethodOverridingDemo();
		
		MethodOverridingDemo pr= new Person();// upcasting 
		
		Person pn =(Person)pr; //DownCasting
		
	}
	
	
	

}
