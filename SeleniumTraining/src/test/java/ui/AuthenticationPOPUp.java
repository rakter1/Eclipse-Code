package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPOPUp {
	
	public static String username="admin"; //Reading thing this from external XLS or CSV
	public static String password="admin"; //Reading thing this from external XLS or CSV

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/"); 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait 
	
		
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth"); 
		
	}
	
	
}
