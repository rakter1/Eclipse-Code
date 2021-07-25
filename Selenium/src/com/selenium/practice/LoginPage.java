package com.selenium.practice;

import org.openqa.selenium.support.ui.LoadableComponent;

public class LoginPage extends LoadableComponent<LoginPage>{

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
	}

	
	// I extends Base class where we have open browser and Close browser and that is Inheritance  
	// use of override .a) parent child relation b) In my framework already inherit LoadableComponent class. it provides two 
	// two override method.
	//c) it has two method that comes as Override method -- one is load() and isLoaded(). 
}
