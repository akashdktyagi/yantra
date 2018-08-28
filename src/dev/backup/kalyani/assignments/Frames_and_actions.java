package dev.backup.kalyani.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

driver.navigate().to("https://jqueryui.com/draggable/");
driver.switchTo().frame(0);
WebElement dragable=driver.findElement(By.xpath("//*[@id='draggable']"));
action.clickAndHold(dragable).moveByOffset(70, 10).release(dragable).perform();

Thread.sleep(4000);



driver.navigate().to("https://jqueryui.com/slider/");
driver.switchTo().frame(0);
WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
action.clickAndHold(slider).moveByOffset(100, 0).release(slider).build().perform();

Thread.sleep(4000);




driver.navigate().to("https://jqueryui.com/selectable/");
driver.switchTo().frame(0);
WebElement selectable=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
action.click(selectable).build().perform();

Thread.sleep(4000);



driver.navigate().to("https://jqueryui.com/sortable/");
driver.switchTo().frame(0);
WebElement sortable=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
action.clickAndHold(sortable).dragAndDropBy(sortable, 0, 100).build().perform();

Thread.sleep(4000);


driver.navigate().to("https://jqueryui.com/spinner/");
driver.switchTo().frame(0);
WebElement spinner=driver.findElement(By.xpath("//button[@id='disable']"));
action.click(spinner).build().perform();

WebElement spinner1=driver.findElement(By.xpath("//button[@id='destroy']"));
action.click(spinner1).build().perform();

Thread.sleep(4000);



WebElement spinner2=driver.findElement(By.xpath("//input[@id='spinner']"));
spinner2.sendKeys("3");
WebElement spinner3=driver.findElement(By.xpath("//input[@id='getvalue']"));
action.click(spinner3).build().perform();

Thread.sleep(4000);










WebDriver driver1;


	

driver1 = new ChromeDriver();
driver1.manage().window().maximize();
driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver1.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
WebElement rSizable=driver1.findElement(By.xpath("//div[@id='resizable']/div[3]"));  

		
	new Actions(driver1).clickAndHold(rSizable).moveByOffset(100,60).release().perform();
	driver1.quit();
Thread.sleep(4000);


	}

}
