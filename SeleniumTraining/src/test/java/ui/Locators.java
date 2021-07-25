package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class Locators {

	
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
		dr.get("https://www.selenium.dev/documentation/en/introduction/types_of_testing/"); //To Open the Browser
		//dr.findElement(By.partialLinkText("Types of ")).click();
		
		//dr.findElement(WithBy.id("username"));
		dr.findElement(withTagName("input").above(password).sendkeys("Testing");
	}}


  