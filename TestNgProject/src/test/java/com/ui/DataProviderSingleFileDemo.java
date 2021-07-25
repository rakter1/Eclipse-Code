package com.ui;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataProviderSingleFileDemo {
	
	
		@DataProvider(name="create")  	
		public Object[][] dataSet1(Method m) {
			
		Object [][] testdata=null;
		if(m.getName().equals("test")) {
			
			testdata = new Object[][] 
				{
				{"username","password"}, 
				{"username1","password1"},
				{"username1","password1"},
				{"username2","password2"}
			   }; 
		}
			   
			   else if (m.getName().equals("test1")) {
				   testdata= new Object[][] 
				{
				   
				   {"username","password","third"},
				   {"username1","password1","third"},
				   {"username1","password1","third"},
				   {"username2","password2","third"}
				   };
				   
			   }
		
			   else if (m.getName().equals("test2")) {
				   testdata= new Object[][] 
				{
				   
				   {"username","password","third","fouth"},
				   {"username1","password1","third","fouth"},
				   {"username1","password1","third","fouth"},
				   {"username2","password2","third","fouth"}
				   };
				   
			   }
			   return testdata;
			   }
		}
		 
			   
		
	
	

