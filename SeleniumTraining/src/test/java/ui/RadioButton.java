package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");
		dr.manage().window().maximize();
		
		WebElement radio1 =dr.findElement(By.id("bookFlights"));
		WebElement radio2 =dr.findElement(By.id("redeemFlights"));
		Actions action = new Actions (dr);
		action.moveToElement(radio2);
		action.perform();
		
		radio2.click();
		Thread.sleep(3000);
		System.out.println(radio1.isSelected());
		Thread.sleep(3000);
		System.out.println(radio2.isSelected());
		
		
		
		
		
		
		
	}

}
