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
 * @author kushal
 *
 */
public class TC_slider {
	private WebDriver driver;
	String url = "https://jqueryui.com/";

	@Test
	public void sliderMethod() {
		
//	Directory and browser path declaration.....
		TC_commonForAll.chromeDriver("webdriver.chrome.driver","G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
		
//	Driver initialize.....
		WebDriver driver = new ChromeDriver();
		driver.get(url );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//	Element  navigate....
		try {
			driver.findElement(By.linkText("Slider")).click();
			
			driver.switchTo().frame(0);
			
			Actions act = new Actions(driver);
			WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
			act.clickAndHold(slider).moveByOffset(340, 0).release(slider).build().perform();
			Thread.sleep(2000);
			act.clickAndHold(slider).moveByOffset(-170, 0).release(slider).build().perform();
			Thread.sleep(3);
		}catch(Exception slide) {
			slide.printStackTrace();
			System.out.println(slide);
		}
		driver.quit();
	}	
}
