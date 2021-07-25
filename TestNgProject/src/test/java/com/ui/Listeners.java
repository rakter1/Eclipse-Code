package com.ui;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {
	
	public void onTestStart() {
		System.out.println("Test case is starting ");
	}
	
	public void onTestSuccess() {
		System.out.println();
	}
	
	public void onTestFailure() {
		System.out.println("Test Failed -Screenshot captured");
	}
	
	public void onTestSkipped() {
		System.out.println();
	}
	
	public void onTestFailedButWithinSuccessPercentage() {
		System.out.println();
	}
	
	public void onStart(ITestContext context) {
		System.out.println();
	}
	
	public void onFinish(ITestContext context) {
		System.out.println();
	}
	
	



}
