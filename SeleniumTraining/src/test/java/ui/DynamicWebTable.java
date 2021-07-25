package ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.asx.com.au/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait 
		
	driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		
		
		//step-1: Switch to frame which has the particular table 
		//Step-2: Get the number of Rows. [tr]
		//Step-3: Get the number of Coloums
		//Step-4: Iterate Rows and Coloums and get text and print it 
		
		WebElement frame1 =driver.findElement(By.id("announcements-frame"));
		driver.switchTo().frame(frame1);
		
		// To get the no of right . There are multiple Elements and it will return List of Web Elements 
		List<WebElement> rowelements= driver.findElements(By.xpath("//*[@id=\"announcements_data_widget\"]/table/tbody/tr"));
		System.out.println(rowelements.size()); // this will print the number of rows that are available in that particular table 
		int rowsize= rowelements.size();
		
				
				// For number of coloms 
		List<WebElement> colomnelements= driver.findElements(By.xpath("//*[@id=\\\"announcements_data_widget\\\"]/table/tbody/tr[1]/td)"));
		System.out.println(colomnelements.size()); // this will print the number of colomns  that are available in that particular table 
		int colomsize= colomnelements.size();
		
		
		// we have to iterate through size
		for(int i=1; i<=rowsize; i++) {
			
			for(int j=1; j<=colomsize; j++) {
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\"announcements_data_widget\"]/table/tbody/tr["+ i +"]/td["+ j +"]")).
				getText());
				//we have removed that hard coding of rows and column and we have got the Xpart and then we need to take getText.
			}
		
			}
}
}
