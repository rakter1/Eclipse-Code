package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	public static WebDriver dr;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		dr= new ChromeDriver();
		dr.get("https://www.seleniumeasy.com/test/");
		dr.manage().window().maximize();
		
		
		WebElement deselectdropdown=dr.findElement(By.id("multi-select"));
		Select select = new Select( deselectdropdown);
		select.selectByValue("California");
		Thread.sleep(2000);
				
		select.selectByIndex(4);
		Thread.sleep(2000);
		
		select.selectByVisibleText("Pennsylvania");
		Thread.sleep(2000);
		
		List<WebElement>allselect=select.getAllSelectedOptions();
		System.out.println(allselect.size());
		select.deselectAll();
		Thread.sleep(2000);
		
		select.selectByValue("California");
		Thread.sleep(2000);
		select.selectByIndex(4);
		Thread.sleep(2000);
		
		select.deselectByIndex(4);
		List<WebElement>allselect1=select.getAllSelectedOptions();
		System.out.println(allselect1.size());
		// to find the Option tag 
		
		List<WebElement> all_option =dr.findElementsByTagName("option");
		System.out.println("Total Option are "+all_option.size());
		
		for(int i=0; i<all_option.size();i++) {
			System.out.println("Total option are"+all_option.get(i).getAttribute("Value"));
		}
		
	
	
	}
	

}
