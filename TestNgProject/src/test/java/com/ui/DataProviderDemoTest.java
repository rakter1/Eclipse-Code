package com.ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider = "dataSet")
	public void test(String username, String pass) {
		System.out.println(username + "========" + pass);
	}

	@DataProvider // data provider has been configured
	public Object[][] dataSet() {
		Object[][] dataset = new Object[4][2]; // Multi Dimentional object Array.
		// ** Allocation of DATA in multi-dimentioanl object Array.
		// First Row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";

		// 2nd Row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";

		// 3rd Row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";

		// 4rd Row
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";

		return dataset;

	}
	//==========================================================================
	// Alternative way to provide data
	  @Test(dataProvider= "create")
	  public void test1 (String username, String password, String test) {
			System.out.println(username+"========"+ password+ "======="+ test);
	
						}
// Alternative way to provide data
	@DataProvider(name="create")  	
	public Object[][] dataSet1() {
		return new Object[][] {{"username","password","test"},// I can add value like "test"
							   {"username1","password1","test1"},
							   {"username1","password1","test2"},
							   {"username2","password2","test3"}
							   };
							   
							   
// you can achieve basically adding multiple rows of data very easily
//you can provide the name of the data provider. and then use that name instead of the method name					   
			 
	}

}
