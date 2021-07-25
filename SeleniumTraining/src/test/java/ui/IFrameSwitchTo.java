package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameSwitchTo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert2");
		dr.manage().window().maximize();
	
		WebElement frame1= dr.findElement(By.id("iframeResult"));
		dr.switchTo().frame(frame1);
		dr.findElement(By.xpath("/html/body/button")).click();
		
		String alerttext = dr.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(3000);
		dr.switchTo().alert().accept();
		
		dr.switchTo().parentFrame();
		System.out.println(dr.getTitle());
		
			}}

//no such element: Unable to locate element
//Unexpected alert open:
	

