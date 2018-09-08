/**
 * 
 */
package dev.backup.kushal.assignment.frameAndAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * @author Kushal Thadani
 *
 */
/*
 * Resizable file
 * 
 */

public class TC_resizable {

	String url = "https://jqueryui.com/";
	@Test
	public void resizableMethod(){
		TC_commonForAll.chromeDriver("webdriver.chrome.driver","G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a")).click();
			driver.switchTo().frame(0);
			WebElement resizable = driver.findElement(By.className("ui-resizable-handle"));
			Actions resize = new Actions(driver);
			resize.clickAndHold(resizable).moveByOffset(240, 100).release(resizable).build().perform();
			Thread.sleep(4);
			resize.clickAndHold(resizable).moveByOffset(-120, 50).release(resizable).build().perform();
			Thread.sleep(3000);
		}catch(Exception res) {
			
		}
		//driver.quit();
		
	}
}
