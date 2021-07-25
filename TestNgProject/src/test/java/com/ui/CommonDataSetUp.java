package com.ui;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

// BeforeSute and AfterSuite
public class CommonDataSetUp {
	
	@BeforeSuite
	public void dataSetup() {
		System.out.println("Common Data Setup");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Common Data Cleanup");
		
	}
	
	

}
