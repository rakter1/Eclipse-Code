package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleAlterWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.salesforce.com/au/");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//span[contains(text(),'Start my free trial')]")).click();
		Thread.sleep(4000);
		Set<String> windowhandles =dr.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator =windowhandles.iterator();
		String parentWindow =iterator.next();
		String childWindow = iterator.next();
		System.out.println(childWindow);
		
		dr.switchTo().window(childWindow);
		
		dr.findElement(By.name("UserFirstName")).sendKeys("Onamika");
		dr.findElement(By.name("UserLastName")).sendKeys("Sarker");
		dr.switchTo().window(parentWindow);  }}
		
	
	


