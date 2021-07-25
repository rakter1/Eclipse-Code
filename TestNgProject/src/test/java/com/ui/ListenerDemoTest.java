package com.ui;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemoTest extends BaseTest{
	
	@Test(retryAnalyzer =Retry.class) 
	public void launchApp() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
		Assert.fail();
	}
	
	
}
