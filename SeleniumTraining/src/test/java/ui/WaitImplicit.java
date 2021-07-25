package ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class WaitImplicit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/"); 
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
		
			
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebDriverWait wait= new WebDriverWait(driver,(10));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Subcategory of Electronics 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='iPhones']"))).click();
		
		
	}
	

}
