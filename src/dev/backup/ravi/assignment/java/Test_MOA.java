package dev.backup.ravi.assignment.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_MOA {
	

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

         WebDriver driver=new ChromeDriver();
			 
			 driver.get("http://jqueryui.com/droppable/");	
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 Actions action = new Actions(driver);
			 driver.switchTo().frame(0);
			 
             WebElement drag=driver.findElement(By.id("draggable"));
	         WebElement drop=driver.findElement(By.id("droppable"));
			 
			 
			 Thread.sleep(4000);
			 action.doubleClick(drag);
			 			 
			 action.clickAndHold(drag).moveToElement(drop).build().perform();
			 Thread.sleep(4000);
			 driver.quit();
			 
			 
			 
			
			


	}

}
