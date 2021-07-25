package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {

	public static WebDriver dr; 
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		dr.get("https://www.sugarcrm.com/au/request-demo/");
		dr.manage().window().maximize();
		dr.findElement(By.name("firstname")).sendKeys("afsheen");
		dr.findElement(By.name("lastname")).sendKeys("taseen");
		dr.findElement(By.name("lastname")).clear();
		//To get value of the attribute 
		System.out.println(dr.findElement(By.name("lastname")).getAttribute("class"));
		System.out.println(dr.findElement(By.name("lastname")).getCssValue("background-color"));
		System.out.println(dr.findElement(By.name("lastname")).getCssValue("transition"));
		System.out.println(dr.findElement(By.name("lastname")).getSize());
		System.out.println(dr.findElement(By.name("lastname")).getLocation());
		System.out.println(dr.findElement(By.name("lastname")).getText());
		System.out.println(dr.findElement(By.name("lastname")).getTagName());
		//These last three method will return ture or false.
		System.out.println(dr.findElement(By.name("lastname")).isDisplayed());
		System.out.println(dr.findElement(By.name("lastname")).isEnabled());
		System.out.println(dr.findElement(By.name("lastname")).isSelected());
			}

}
