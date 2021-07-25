package com.dev.signuppage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp extends TestBase{
	WebDriver dr;
	public void signUP() {
		
		dr.findElement(By.xpath("//*[@class=\"btn btn-success\"]")).click();
		
		
	}

}
