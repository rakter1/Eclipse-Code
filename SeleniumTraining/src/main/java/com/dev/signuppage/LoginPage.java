package com.dev.signuppage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends TestBase{
	
	
	
	public void login() {
		
		dr.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		dr.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("devlogin");
		dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("dev123");
		dr.findElement(By.xpath("//input[@id=\"Login\"]")).click();
}	
	
	
}




