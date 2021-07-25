package tests.properties.read.write;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
		
		Properties properties =new Properties();
	
		// For reading 
		FileInputStream inputstream1 =new FileInputStream("C:\\Users\\rumab\\OneDrive\\Desktop\\SeleniumTraining"
				+ "\\src\\test\\resources\\Properties\\testdata.properties");
		properties.load(inputstream1);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		
		//For write 
		FileOutputStream outputstream1 =new FileOutputStream("C:\\Users\\rumab\\OneDrive\\Desktop\\SeleniumTraining"
				+ "\\src\\test\\resources\\Properties\\testdata.properties");
		properties.setProperty("testdata", "564946");
		properties.store(outputstream1, null); // or 
		properties.store(outputstream1, "This is customer data from Test case 2");
	}}
		


