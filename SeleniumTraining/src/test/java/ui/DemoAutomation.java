package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","B:\\JAVA and Selenium\\Driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup(); //Instead of System.setProperty 
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

		driver.close();

	}
	}
