package com.ui;
import org.testng.annotations.Test;

public class DataProviderTestCaseSingle {
	
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderSingleFileDemo.class)
	public void test(String username, String pass) {
		System.out.println(username + "========" + pass);
	}
	
	
	  @Test(dataProvider= "create",dataProviderClass=DataProviderSingleFileDemo.class)
	  public void test1 (String username, String password, String test) {
			System.out.println(username+"========"+ password+ "======="+ test);
	
	  }

	  @Test(dataProvider= "create",dataProviderClass=DataProviderSingleFileDemo.class)
	  public void test2 (String username, String password, String test,String test1) {
			System.out.println(username+"========"+ password+ "======="+ test+"======="+test1);
	
	  }
	  
}


 

