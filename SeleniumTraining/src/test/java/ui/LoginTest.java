package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class LoginTest {

	public static String browser = "Chrome"; //External Configuration XLs,CSV file ,Data Base
	public static WebDriver dr;
	public static void main(String[] args)  {

		if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();// Alter of System.setProperty 
			dr= new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{		
			WebDriverManager.chromedriver().setup();// Alter of System.setProperty 
			dr= new ChromeDriver(); // Launch the Browser 
		}
		dr.get("https://www.saucedemo.com/"); //To Open the Browser
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		dr.close();
	}}

