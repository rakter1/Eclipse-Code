package report;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGReportDemo extends BaseTest{
	
	@Test
	public void reporterTest1() {
		System.out.println("This is Test 1");
		//Reporter.log("This is test1");
		driver.get("https://www.salesforce.com/");
		Assert.assertTrue(false);
	}
	@Test
	public void reporterTest2() {
		System.out.println("This is test2");
	}
	@Test
	public void reporterTest3() {
		System.out.println("This is test3");
	}
	@Test
	public void reporterTest4() {
		System.out.println("This is test4");
	}
	
	
	

}
