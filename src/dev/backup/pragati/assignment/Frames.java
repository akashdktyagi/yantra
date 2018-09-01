package dev.backup.pragati.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.switchTo().frame(0);
	     
	  
	     WebElement dragg=driver.findElement(By.id("draggable"));
	     WebElement drop=driver.findElement(By.id("droppable"));
	     action.dragAndDrop(dragg, drop).perform();

	     
	     //resizable
	     
	     //driver.get("https://jqueryui.com/resizable/");
	    // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    // WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	     //ction.clickAndHold().moveByOffset(20, 50).release().perform();
	    
	     

}
}