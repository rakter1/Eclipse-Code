package booking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemo2 {
	@Test
	public void class_2_testcase1() {
		Assert.assertEquals("Hi", "Hi");
		System.out.println("This is basic test case 1");
	}
	@Test
	public void class_2_testcase2() {
		Assert.assertEquals("Hi", "Hello");
		System.out.println("This is basic test case 2");
	}
}
