package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.sugarcrm.com/request-demo/");
		dr.manage().window().maximize();
		
		// For Radio Button 
		WebElement radioButton =dr.findElement(By.id("doi0"));
		Actions action = new Actions(dr); 
		action.moveToElement(radioButton).click();
		action.perform();
		
		// For Select
		dr.findElement(By.id("interest_market_c0")).click();
		dr.findElement(By.id("interest_market_c0")).isSelected();
		Thread.sleep(2000);
		//For DeSelection .
		dr.findElement(By.id("interest_sell_c0")).click();
		
		//to find all the checkboxes or select all the checkboxes
		System.out.println(dr.findElements(By.xpath("//input[@type='checkbox']")).size());
			
		
		
		
	}

}
