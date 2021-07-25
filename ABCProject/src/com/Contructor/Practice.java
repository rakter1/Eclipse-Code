package com.Contructor;
public class Practice {
	String name ;
	int studentID;

	public static void main(String[] args) {
		Practice p1 = new Practice(); //by default- p1 (name=null, ID= 0)
		Practice p2 = new Practice();// by default- p2 (name=null, ID= 0)
	}
}
// by putting value 
class student2{


	String name ="sumi";// if I put the value , after object creation
	//y default same name and id will store in the memory
	int stdID= 101;


	public static void main(String[] args) {
		student2 obj1= new student2(); // by default obj1(name = sumi and id= 101
		student2 obj2= new student2(); // by default obj1(name = sumi and id= 101
	}	

}

// using reference variable 
class student3{

	String name ="sumi";
	int stdID= 101;


	public static void main(String[] args) {
		student2 obj1= new student2(); 
		obj1.name="sumi";
		obj1.stdID=101;

		student2 obj2= new student2();
		obj2.name="Rumi";
		obj2.stdID=102; // Extra 2 lines will be added for each object 
		}}







