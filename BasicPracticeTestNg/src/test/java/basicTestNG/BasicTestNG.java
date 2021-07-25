package basicTestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class BasicTestNG {
	
	
	@Test(priority=3)
	public void tc1() {
		Assert.assertEquals(14, 12);
	// 12 is actual. 12 is not equals to 14. So test case tc1 should be failed, becasue of wrong statements 
		
		System.out.println("My First TestNG testcase");
	}
	@Test(priority=1)
	public void tc2() {
		System.out.println("My 2nd Test case");
	}
	@Test(priority=2)
	public void tc3() {
		System.out.println("My third Test case");
	}

}
