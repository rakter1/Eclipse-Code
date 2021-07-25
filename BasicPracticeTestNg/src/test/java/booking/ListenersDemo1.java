package booking;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// interface- ITestListener
public class ListenersDemo1 implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		   System.out.println("Test case is starting"); 
	  }
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("My Testcase passed"+result.getName());
	  }
	
	 public void onTestFailure(ITestResult  result) {
	    System.out.println("My Testcase Failed "+result.getName()+result.getTestClass());
	    System.out.println("Error message for my test case is "+result.getThrowable());
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
	 
	
	
 