package dev.backup.akash.codesnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*
To handle below Implementation
<iframe>

or

<frameset>
*/

public class FramesAndActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "E:\\_AkashStuff\\Automation\\dependencies\\gecko\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();//new HtmlUnitDriver();
		driver.get("https://jqueryui.com/slider/");
	
		/*
		 * Find Iframe in-side document
		 */
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		/* this will not work here
		driver.findElement(By.id("draggable"));
		*/
		//driver.switchTo().frame(0);
		driver.switchTo().frame(iframe);

		
		/*
		 * This will work as Driver has switched
		 */
		//driver.findElement(By.id("draggable"));

		/*
		 * Clicking on the element present in the Outer DOc
		 * Not possible with out switching back
		 * driver.findElement(By.linkText("Accordion")).click();
		 * You have to Switch Back
		 */
		
		//To Switch Back to the Original Content
		// driver.switchTo().defaultContent();
		
		
		
		Actions action  = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));


		action.clickAndHold(element);
		action.moveByOffset(200, 0);
		
		//action.build();

		action.perform();
		
		Thread.sleep(5000);
		action.moveByOffset(-170, 0);
		action.perform();
		
		//To switch to parent frame in multi-tier frame set up
		driver.switchTo().parentFrame();
		
		//to switch to default frame
		driver.switchTo().defaultContent();
		

	}
	
}
