package dev.backup.ravi.assignment.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://jqueryui.com/slider/");	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Actions action = new Actions(driver);
		 driver.switchTo().frame(0);
		 
   WebElement slider = driver.findElement(By.id("slider"));
   action.click(slider).moveByOffset(40, 0).release(slider).build().perform();
   Thread.sleep(4000);
   action.click(slider).moveByOffset(-40, 0).release(slider).build().perform();
   driver.quit();


	}

}
