package com.dev.signuppage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumWebDriverMethod {
	public static String browser = "Chrome";
	public static WebDriver dr;

	public static void main(String[] args) {

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();

		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup(); // <scope>test</scope>
			dr = new FirefoxDriver();
		}

		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();

		String currentUrl = dr.getCurrentUrl();
		System.out.println(currentUrl);

		String title = dr.getTitle();
		// It gave this title--Salesforce Developers | API Documentation, Developer
		// Forums & More
		System.out.println(title); //

		String pagesource = dr.getPageSource();
		System.out.println(pagesource);
		// findElement
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		// findElements
		List<WebElement> weblist = dr.findElements(By.xpath("//div[@class='inventory_list']/div"));// it will find all
		// these 6 elements
		System.out.println(weblist);
		List<WebElement> eleSize = dr.findElements(By.tagName("a"));
		int a = eleSize.size();
		System.out.println(a);
		// getWindowHandle
		dr.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = dr.getWindowHandle();
		System.out.println(windowhandle);
		dr.findElement(By.xpath("//span[@class=\"btn btn-primary\"]")).click();
		Set<String> windowhandles = dr.getWindowHandles();
		System.out.println(windowhandles); // at this instance it should print two window handles
		// getWindowHandles
		dr.close();

	}

}
