package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDev {

	public static WebDriver dr;
	public static String browser = "Chrome";

	public static void main(String[] args) {

		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			dr=new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dr=new FirefoxDriver();
		}
		//select[@name="user[country]"]//child::option[1]

		dr.get("https://developer.salesforce.com/");
		dr.findElement(By.xpath("//a[@type=\"button\"]")).click();
		dr.findElement(By.id("first_name")).sendKeys("afshu");
		dr.findElement(By.name("user[last_name]")).sendKeys("taseen");
		//dr.findElement(By.id("email")).sendKeys("afsh@developer.com");
		dr.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("afsh@developer.com");
		//dr.findElement(By.xpath("//a[text()='Terms of Use']")).click();



	}

}
