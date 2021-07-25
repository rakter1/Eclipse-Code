package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait 
		
		// Print the title of the page.
		JavascriptExecutor jsex=(JavascriptExecutor)driver;
		String script="return document.title;";
		String title =(String) jsex.executeScript(script);
		System.out.println(title);
		
		//Click the button 
		driver.switchTo().frame("iframeResult");
		jsex.executeScript("myFunction()");
		Thread.sleep(2000); //2 second
		driver.switchTo().alert().accept();
		
		//Highlight ---for highlighting the buttons and 
		// [which button we want to highlight  that we need to find by the locator ]
		//Highlight button
		WebElement button =driver.findElement(By.xpath("/html/body/button"));
		jsex.executeScript("arguments[0].style.border='3px solid red'", button);
		
		//Scroll 
		driver.navigate().to("https://www.w3schools.com/");
		WebElement cssrefbutton=driver.findElement(By.xpath("//a[text()=\"CSS Reference\"]"));
		jsex.executeScript("arguments[0].scrollIntoView(true);", cssrefbutton);
	}
	

}
