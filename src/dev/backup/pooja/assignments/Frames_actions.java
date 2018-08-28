package dev.backup.pooja.assignments; 




import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


/*   Author pooja zade
 /*  Test cases for frames and Actions
 *  1.Dropable 
 *  2.DraggableS 
 */


public class Frames_actions {

	public static void main(String[] args) throws Exception {

		// Dropable

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		action.dragAndDrop(drag, drop).perform();

		Thread.sleep(4000);

		//Draggable
		driver.get("https://jqueryui.com/draggable/");

		driver.switchTo().frame(0);

		WebElement draggable =driver.findElement(By.xpath("//*[@id='draggable']"));	     

		action.clickAndHold(draggable).moveByOffset(150, 50).release(draggable).perform();

		driver.quit();




	}}


