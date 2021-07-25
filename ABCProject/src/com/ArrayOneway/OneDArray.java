package com.ArrayOneway;
public class OneDArray { // Single D- Array 

	int[] a = {10,20,25,30};

	public void singleArray() {
		for(int i=0; i<a.length;i++) {

			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		OneDArray array= new OneDArray();
		array.singleArray();
		// object create of 
		TwoDArray array2 =new TwoDArray();
		
		System.out.println();

		array2.matrix2D();
		
		System.out.println();
		maxNum mn =new maxNum();
		mn.maxMin();
		
		System.out.println();
		MinNum minN= new MinNum();
		minN.minNum();
	}}
//============================================================

// 2-D Array/ Matrix Array

class TwoDArray{
	int[][] a= {{25,23},{29,39,49}};

	public void matrix2D() {
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {

				System.out.println(a[i][j]);// a of i and j and 
				// to create better just type print instead of println
			}
			System.out.println();
		}}}

// Find out the Maximum number 
class maxNum{
	
	
	int [] a= {4,3,5,8,9,1};
	int max =a[0];
	
	public void maxMin() {
		for(int i =1; i<a.length; i++) { // for traverse the Array
			if(max<a[i]) {
			 max=a[i]; // if you got any number that is greater than max then put the number in the max.
				max=a[i];
				
			}
		}
		System.out.println("Maximum number  is "+ max);
		
		
	}
	
}

// Find out the Minimum number 

class MinNum{
	
	
	int [] a= {4,3,5,8,9,1};
	int min=a[0];
	
	public void minNum() {
		for(int i =1; i<a.length; i++) { // for traverse the Array
			if(min>a[i]) {
			 min=a[i]; // if you got any number that is greater than max then put the number in the max.
				
				
			}
		}
		System.out.println("Minimum number  is "+ min);
		
		
	}
	
}


	















