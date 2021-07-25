package com.ArrayOneway;

public class SecondLarge {
	
	int[] a= {6,8,9,7,5,3,1,10};
	int temp;
	public void secLarge() {
		
		
		for(int i= 0; i<a.length; i++) {

			for(int j =i+1; j<a.length; j++) {
				if (a[i]< a[j]) { // a of i is smaller than a of j.. // i value start from Zero index
					temp= a[i];
					a[i]=a[j]; 
					a[j]=temp;
					
				}
			}
		}
		System.out.println("2nd largest element is "+ temp);
	}

	
	
	}

