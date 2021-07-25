package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggessionDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.makemytrip.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//span[text()='From']")).click();
		
		WebElement from = dr.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		from.sendKeys("Sydney");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		
	}

}





