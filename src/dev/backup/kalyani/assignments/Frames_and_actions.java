package dev.backup.kalyani.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Frames_and_actions {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","F:\\VisionIT\\dependancy\\chromedriver_win32\\chromedriver.exe");
		

WebDriver driver=new ChromeDriver();

Actions action=new Actions(driver);

driver.get("https://jqueryui.com/droppable/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.switchTo().frame(0);
WebElement drag=driver.findElement(By.id("draggable"));
WebElement drop=driver.findElement(By.id("droppable"));

action.dragAndDrop(drag, drop).perform();

Thread.sleep(4000);

driver.get("https://jqueryui.com/draggable/");
driver.switchTo().frame(0);
WebElement dragable=driver.findElement(By.xpath("//*[@id='draggable']"));
action.clickAndHold(dragable).moveByOffset(70, 10).release(dragable).perform();
driver.quit();

	
Thread.sleep(4000);
	

driver.get("https://jqueryui.com/resizable/");
driver.switchTo().frame(0);
WebElement rSizable=driver.findElement(By.cssSelector(".ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se"));
if(rSizable.isDisplayed()){
	action.clickAndHold(rSizable).moveByOffset(100, 50).release(rSizable).build().perform();	
}else{
	System.out.println("Element was not displayed to drag");
}

driver.quit();
Thread.sleep(4000);


	}

}
