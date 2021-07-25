package com.ui;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.TestUtil;

public class Listener1 extends TestUtil implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		   System.out.println("Test case is starting"); 
	  }
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("My Testcase passed"+result.getName());
	  }
	
	 public void onTestFailure(ITestResult  result) {
	    System.out.println("Test Failed --Screenshot Captured");
	    try {
			getScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    }
	 
	  public void onTestSkipped(ITestResult  result) {
	    System.out.println();
	  }
	  public void onTestFailedButWithinSuccessPercentage(ITestResult  result) {
		    System.out.println();
		  }
	  public void onStart(ITestContext  context) {
		    System.out.println();
		  }
	  public void onFinish(ITestContext  context) {
		    System.out.println();
		  }}
	


