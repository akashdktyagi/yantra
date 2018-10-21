package dev.backup.akash.codesnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAndActions {

	public FramesAndActions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new HtmlUnitDriver();//new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.
		
		
		/*
		 * Find Iframe in-side document
		 */
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		/* this will not work here
		driver.findElement(By.id("draggable"));
		*/
		//driver.switchTo().frame(0);
		driver.switchTo().frame(iframe);
		
		driver.switchTo().alert()..defaultContent();
		
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
		 //driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		 /*
		Actions action  = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
		action.clickAndHold(element);
		action.moveByOffset(200, 0);

		action.perform();
		
		action.moveByOffset(-170, 0);
		action.perform();
		
*/

		
//driver.switchTo().alert().accept();

	}
	
}
