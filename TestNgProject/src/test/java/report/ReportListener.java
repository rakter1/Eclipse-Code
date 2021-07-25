package report;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.TestUtil;

public class ReportListener implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is -"+result.getName());
		   System.out.println("Test case is starting"); 
	  }
	 public void onTestSuccess(ITestResult result) {
		 Reporter.log("Status of execution is--"+result.getStatus()); // it will print the status
		 System.out.println("My Testcase passed"+result.getName());
	  }
	
	 
	 public void onTestFailure(ITestResult  result) {
		 TestUtil util =new TestUtil();
		    System.out.println("Test Failed --Screenshot Captured");
		    try {
		    	util.getScreenshot();
			} catch (IOException e) {
				e.printStackTrace();
			}
		   Reporter.log("C:\\Users\\rumab\\OneDrive\\Desktop\\TestNgProject"); 
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
	


	
	


