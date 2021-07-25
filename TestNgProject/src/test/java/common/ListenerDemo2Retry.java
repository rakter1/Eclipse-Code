package common;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ui.BaseTest;
import com.ui.Retry;

public class ListenerDemo2Retry extends BaseTest{
	
	
	@Test(retryAnalyzer =common.Retry.class) 
	public void launchApp() {
		driver.get("https://amazon.com/");
		Assert.assertTrue(false);
		Assert.fail();
	}

}
