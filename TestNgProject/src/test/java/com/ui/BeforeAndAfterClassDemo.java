package com.ui;



import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAndAfterClassDemo {

	
	@Test
	public class GroupDemoTest {
		
		@BeforeGroups
		public void beforeClass() {
			System.out.println("I am before Group");
		}
		
		@Test(priority = 1, groups = "regression")
		public void loginTest() {
			System.out.println("Login is successful");
		}

		@Test(priority = 2, description = "This is logingTest", groups = "regression")
		public void signUP() {
			System.out.println("Logout is successful");
		}
		
		@Test(priority = 3, description = "This is logingTest", groups = "regression")
		public void logOut() {
			System.out.println("Logout is successful");
		}
		
		@AfterGroups
		public void afterClass() {
			System.out.println("I am After class method ");
		}

	}
}
