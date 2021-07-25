package booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseSpice {
	
	
	WebDriver driver; 
	public void setup() {
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	}

}
