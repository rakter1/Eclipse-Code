package com.OOP;

public class Employee {
	
	private int empID;  // here varaibe / data is empID. 
	
	// provide public setter and getter method--
	public void setEmpID(int empID1) {
		
		empID= empID1; // To initialize instance variable 
	}
	// to view the Data and it returns empID[Instance varaible ]
	// Since empID is a Int type ,So We have to change the int from void.
	public int getEmpID() {
		return empID;
		
		}
	
	public static void main(String[] args) {
		Employee em= new Employee();
		em.setEmpID(102); // set the data 
		//Data view through the getter method-
		System.out.println(em.getEmpID());
	}}


