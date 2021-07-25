package com.bd.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class GoogleProject {
	public WebDriver driver;
	@Test
	public void Login() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/"); 
		driver.manage().window().maximize();
		
	}

}
