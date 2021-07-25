package com.QAclick.academy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import qa.academy.util.TestUtil;

public class QAClick {
	public static WebDriver dr;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		dr= new ChromeDriver();
		dr.get("http://www.qaclickacademy.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//button[contains(text(),\"NO THANKS\")]")).click();
		dr.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
		

}
	
	
}
