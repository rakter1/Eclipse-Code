package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateSlider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://jqueryui.com/slider/#colorpicker"); //https://jqueryui.com/slider/#colorpicker
		//dr.get("https://jqueryui.com/"); //https://jqueryui.com/droppable/
		dr.manage().window().maximize();
	
		
		
		// For frame 
		WebElement frame =dr.findElement(By.xpath("//*[@id=\"content\"]/iframe")); // parent iframe 
		dr.switchTo().frame(frame); 
			
				
		WebElement greenslider =dr.findElement(By.xpath("//div[@id=\"green\"]"));
		Actions action = new Actions(dr);
		//slide.dragAndDropBy(greenslider,200,125).perform(); //Forward moving 
		action.dragAndDropBy(greenslider,-100,100).perform(); // Backward moving
		
			
		
	}

}
