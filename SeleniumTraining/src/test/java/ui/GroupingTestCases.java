package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupingTestCases {
	
	@Test
	public void searchBoxText() {
	
	SoftAssert softassert = new SoftAssert();
	String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	String expectedText= "Search";
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.ebay.com/"); 
	driver.manage().window().maximize();
	
	String actualTitle=driver.getTitle();
	System.out.println("Verifying Title");
	softassert.assertEquals(actualTitle, expectedTitle,"Title Vafification failed");
	
	String actualText= driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).getAttribute("value");
	System.out.println("Verifying Text");
	//Value is the attribute because value =search. 
	softassert.assertEquals(expectedText, actualText,"Text varification failed");
	System.out.println("Closing Browser Text");
	
	driver.close();
	
	softassert.assertAll();

}

}
