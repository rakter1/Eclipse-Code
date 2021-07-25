package com.polymorphism;
public class Overriding2 extends TestBOverriding {

	
	
	
	String  show( )  {   
		System.out.println("I am C");
		return null; }

	@Override
	void display() {
		System.out.println("I am override method ");
		
	}} 
		

/*Note-- 
 
 	1) If a child class throws UncheckException and In Parent class there is no Exception, Then no error. 
	but if the child class throws an CheckException then it shows Compile time Error. 
	
 
 	
 	
 */


