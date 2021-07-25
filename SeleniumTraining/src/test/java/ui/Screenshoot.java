package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshoot {

	public static void main(String[] args) throws IOException {
		
		Date currentdate =new Date();
		System.out.println(currentdate);
		String screenshotfilename =currentdate.toString().replace(" ","-").replace(":", "-");
		System.out.println(screenshotfilename);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com.au"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait 
	
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotfilename+".png"));
		
	}

}
