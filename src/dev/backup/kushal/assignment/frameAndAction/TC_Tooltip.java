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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Kushal Thadani
 *
 */
public class TC_Tooltip {

	public String url = "https://jqueryui.com/";
	WebDriver driver;
	@BeforeTest
	public void driverPath() {
		TC_commonForAll.chromeDriver("webdriver.chrome.driver","G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void driverInitialized() {
		 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test
	public void toolTipMethod() {
		
		
//		Script For Getting Tooltip Value.......
		
		try {
			driver.findElement(By.xpath("//a[@href='https://jqueryui.com/tooltip/']")).click();
			driver.switchTo().frame(0);
			Actions tooltips = new Actions(driver);
			WebElement getTextOfTooltip = driver.findElement(By.xpath("//a[@href='http://jqueryui.com/themeroller/']"));
			String res = getTextOfTooltip.getAttribute("title");
			System.out.println(res);
			tooltips.moveToElement(getTextOfTooltip).build().perform();
			Thread.sleep(3000);
			driver.quit();
		}catch(Exception tool) {
			tool.printStackTrace();
		}
	}
}
