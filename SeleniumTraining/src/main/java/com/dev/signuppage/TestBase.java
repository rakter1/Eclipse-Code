package com.dev.signuppage;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static String browser = "Chrome";
	public static WebDriver dr;
	
	public void TestBase(WebDriver driver) {
		dr=driver;
		}
	public static void openBrowser() {
		
		if(browser.equals("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		dr= new ChromeDriver();
		
		}
		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup(); //<scope>test</scope>
			dr= new FirefoxDriver();
		}
		
		dr.get("https://developer.salesforce.com/");
		
	}
	
	
	public void tearDown() {
		dr.close();
		
	}
	

}
	

