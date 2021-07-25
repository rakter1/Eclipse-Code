package booking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight {
	
	/*@BeforeMethod
	public void beforeMethod_TestCase1() {
	System.out.println("This code will run before every test case");
	}
	@Test(dependsOnMethods= {"bookflight_roundTrip_testCase2"})
	public void bookflight_roundTrip_testCase1() {
		System.out.println("TestCase_one ");
	}
	@Test
	public void bookflight_roundTrip_testCase2() {
		System.out.println("TestCase_two ");
	}
	
	@BeforeTest
	public void beforeTestcase1() {
		System.out.println("This should be first");
	}
	
	@AfterTest
	public void afterTestcase2() {
		System.out.println("This should be last");
	}
	
	@Test
	public void bookflight_oneWay_testCase3() {
		System.out.println("TestCase_three");
	}
	@Test(enabled=false)
	public void bookflight_oneWay_testCase4() {
		System.out.println("TestCase_four ");
	}
	@AfterMethod
	public void afterMethod_TestCase2() {
	System.out.println("This code will run after every test case");

	}*/
//=======================================================================

	@Test 
	public void bookflight_roundTrip_testCase1() {
		System.out.println("bookflight_BookTestCase_one");

	}
	@Test 
	public void bookflight_roundTrip_testCase2() {
		System.out.println("bookflight_BookTestCase_two");

	}

	@Test
	public void bookflight_oneWay_testCase1() {
		System.out.println("bookflight_oneWay_TestCase_one");
	}
	@Test
	public void bookflight_oneWay_testCase2() {
		System.out.println("bookflight_oneWay_TestCase_three");
	}











}







