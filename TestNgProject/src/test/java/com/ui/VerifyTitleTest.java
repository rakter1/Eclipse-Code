package com.ui;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	WebDriver driver;
	@Test(groups= "regression")
	public void titleTest() {
		
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay"; // this is Expected title that we are looking for
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/"); 
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(true); 
		//This except true condition but we are passing false. So this test case will fail nd we should get that particular
		//statement being printed as well. 
		
	}
	@Test
	public void currentLogoTest() {
		driver.findElement(By.xpath("//img[@id=\"gh-logo\"]")).click();
		Assert.assertTrue(true);	
		
		
	}


}
