package com.dev.test;

import com.dev.signuppage.LoginPage;
import com.dev.signuppage.SignUp;
import com.dev.signuppage.TestBase;

public class TestDevPage extends TestBase {

	public static void main(String[] args) {
		//DevSignuppage obj =obj.openBrowser();
		openBrowser();
		
		/*LoginPage login = new LoginPage();
		login.login();*/
		
		SignUp up =new SignUp();
		up.signUP();
		

	}

}
