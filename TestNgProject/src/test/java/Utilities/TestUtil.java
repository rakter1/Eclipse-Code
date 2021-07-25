package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ui.BaseTest;

public class TestUtil extends BaseTest{
	
	public void getScreenshot() throws IOException {
		Date currentdate= new Date();
		String screenshotfilename=currentdate.toString().replaceFirst("", "").replace(":", "-");
		System.out.println(screenshotfilename);
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotfilename+"."));
	}}


