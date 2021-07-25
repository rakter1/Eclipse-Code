package booking;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo {
	
	@Parameters({"url","username","password"})
	@Test
	public void testCase1(@Optional("Default parameter will execute if parameter tag misses in the parameter.xml")String Url,String uname,String pass) {
		System.out.println("My url name is "+Url);
		System.out.println("My database username is "+uname);
		System.out.println("My database password is "+pass);
		
		
		
	}
}
