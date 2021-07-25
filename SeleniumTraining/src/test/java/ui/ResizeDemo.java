package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeDemo {

	public static void main(String[] args)  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://jqueryui.com/");
		//dr.get("https://jqueryui.com/"); //https://jqueryui.com/droppable/
		dr.manage().window().maximize();
	
		//For Click on Resizable 
		dr.findElement(By.xpath("//a[text()='Resizable']")).click();
		
		// For frame 
		WebElement frame =dr.findElement(By.xpath("//*[@id=\"content\"]/iframe")); // parent iframe 
		dr.switchTo().frame(frame); // resizing webelement 
			
		WebElement element =dr.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions resize = new Actions(dr);
		resize.dragAndDropBy(element,300,100).perform(); 
		
	}
	}
		


		
				


