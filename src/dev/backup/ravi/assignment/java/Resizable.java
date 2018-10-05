package dev.backup.ravi.assignment.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://jqueryui.com/resizable/");	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Actions action = new Actions(driver);
		 driver.switchTo().frame(0);
		 
		 WebElement element = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		 action.clickAndHold(element).moveByOffset(150, 50).release(element).build().perform();
		 Thread.sleep(4000);
		 driver.quit();
		 

	}

}
