package com.transport.bd;

public abstract  class Vehical {
		int Nooftyres;
		abstract void start(); }
	
	
// In this class We will declare a variable and method but we will not show the Value. That means we will not provide 
// the details. Vehical is common word. Vehical can be anything like it can be scooter, car , Bus, Motor cycle etc .
// It can have Tyres, steering,  It can be star by itself .So  here we are hiding implementation.
// So other class will inherit it and they will use it as per their need.
//The keyboard must be used in the method where there will be no body / or implementation  of the method.
//If there is an abstract method then that class must be abstract class.
//Without abstract method the abstract class may contain. We can not create object but we can create ref 
// So we can create object of Abstract class even even object of class of main class.
