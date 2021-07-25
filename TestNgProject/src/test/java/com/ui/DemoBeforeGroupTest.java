package com.ui;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;



@Test
public class DemoBeforeGroupTest {
	
	@BeforeGroups(value="regression")
	public void beforeClass() {
		System.out.println("Run before all group method executed- Run this method Before all regression");
	}
	
	@Test(priority = 1, groups = "regression")
	public void loginTest() {
		System.out.println("Login is successful");
	}

	@Test(priority = 2,  groups = "regression")
	public void signUP() {
		System.out.println("Logout is successful");
	}
	
	@Test(priority = 3, description = "This is logingTest", groups = "regression")
	public void logOut() {
		System.out.println("Logout is successful");
	}
	
	@AfterGroups(value="regression")
	public void afterClass() {
		System.out.println("Run after all group method executed- Run this method after all regression ");
	}

}
