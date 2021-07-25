package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printLink {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.sugarcrm.com/au/request-demo/");
		dr.manage().window().maximize();
		
		//To find all the elements that have the tag a 
		List<WebElement> all_tag =dr.findElementsByTagName("a");
		System.out.println("Total tags are "+ all_tag.size());
		// 0- 241 :  242
		for(int i=0; i<all_tag.size(); i++) {
			
		System.out.println("Links on page are "+all_tag.get(i).getAttribute("href"));
		System.out.println("Links on page are "+all_tag.get(i).getAttribute("option"));
		System.out.println("Links on page are "+all_tag.get(i).getText());
		
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	

}
