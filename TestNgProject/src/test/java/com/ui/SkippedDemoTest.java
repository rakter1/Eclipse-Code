package com.ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippedDemoTest {
	
	Boolean datasetup= true;
	
	@Test(enabled= false)
	public void skipedTest1() {
		
		System.out.println("Skipping this test as it is not complete");
	}
	
	@Test
	public void skipedTest2() {
			System.out.println("Skipping this test forcefully ");
			throw new SkipException("Skipping this test");
	}
	
	@Test 
	public void skipedTest3() {
		
		System.out.println("Skipping this test based on conditions ");
	}
	
	@Test
	public void skipedTest4() {
		
		System.out.println("Skipping this test as it is not complete");
		if(datasetup==true) {
			System.out.println("Execute the Test");
		}
		else {
			
			System.out.println("Do not Execute further steps");
			throw new SkipException("Do not Execute further steps");
		} } }
