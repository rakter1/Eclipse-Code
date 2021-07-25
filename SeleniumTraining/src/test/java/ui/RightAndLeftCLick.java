package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightAndLeftCLick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker"); 
		driver.manage().window().maximize();
		
		// I will click inside this frame. that's why we need to create this code 
		WebElement frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")); // parent iframe 
		driver.switchTo().frame(frame); 
		
		//I want to click on box, so I took inspect and xpath of this box
		WebElement rectanglebox =driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
		Actions action = new Actions(driver);
		action.contextClick(rectanglebox).perform();;

	}

}
