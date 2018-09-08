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
public class TC_spinner {
	String url = "https://jqueryui.com/";
	@Test
	public void spinnerMethod() {
		
		TC_commonForAll.chromeDriver("webdriver.chrome.driver","G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.linkText("Spinner")).click();
			driver.switchTo().frame(0);
			
			WebElement toggleButton = driver.findElement(By.id("disable"));
			Actions spinnerAction = new Actions(driver);
			
			
			Thread.sleep(3000);
			driver.quit();
		}catch(Exception spinnerCatchException) {
			
		}
	}
}
