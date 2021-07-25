package booking;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="myData1")
	public void testcase1(String uname, String pwd) {
		System.out.println("TestCase 1 should run for 4 sets of users");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@Test(dataProvider="myData1")
	public void testcase2(String uname, String pwd) {
		System.out.println("TestCase 2 should run for 4 sets of users");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@DataProvider(name="myData1")
	public Object[][] myDataProvider1() {
		Object[][] obj=new Object[4][2]; // first Row or types. here 4 types of users  
		obj[0][0]="user1"; // first row and first colum and value is just I call it as user1.
		obj[0][1]="pass1";// object of first row and 2nd column
		obj[1][0]="user2";// 2nd row and first col
		obj[1][1]="pass2";
		obj[2][0]="uses3";
		obj[2][1]="pass3";
		obj[3][0]="user4";
		obj[3][1]="pass4";
		
		return obj; }}
		
		
