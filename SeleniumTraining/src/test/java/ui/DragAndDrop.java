package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://jqueryui.com/"); //https://jqueryui.com/droppable/
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//a[text()=\"Droppable\"]")).click();
		
		WebElement frame= dr.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		dr.switchTo().frame(frame); // we will provide the webElement 
		WebElement drag= dr.findElement(By.id("draggable"));
		WebElement drop =dr.findElement(By.id("droppable"));
		
		Actions action =new Actions(dr);
		action.dragAndDrop(drag, drop).perform(); }}

