package dev.backup.jitendra.assignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Actions 
{
public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Actions action=new Actions(driver);
	
/*		//draggable
	driver.get("https://jqueryui.com/draggable");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	
	WebElement draggable=driver.findElement(By.id("draggable"));
	action.clickAndHold(draggable).moveByOffset(70,20).release(draggable).perform();
	
	Thread.sleep(4000);
	
	//droppable
	driver.get("https://jqueryui.com/droppable");
	driver.manage().timeouts();
	driver.switchTo().frame(0);
	
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	action.dragAndDrop(drag, drop).perform();

	Thread.sleep(4000);
	
	
	//Resizable
	driver.get("https://jqueryui.com/resizable/");
	driver.manage().timeouts();
	driver.switchTo().frame(0);
	WebElement resizable=driver.findElement(By.id("resizable"));
	action.clickAndHold(resizable).moveByOffset(100,50).release(resizable).build().perform();

	
	Thread.sleep(3000);

	//selectable
	driver.navigate().to("https://jqueryui.com/selectable/");
	driver.manage().timeouts();
	driver.switchTo().frame(0);
	
	WebElement select=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
	action.click(select).build().perform();
	
	Thread.sleep(2000);
	
	//sortable
	driver.get("https://jqueryui.com/sortable/");
	driver.manage().timeouts();
	driver.switchTo().frame(0);
	
	WebElement sort=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
	action.clickAndHold(sort).dragAndDropBy(sort, 0, 100).build().perform();
	Thread.sleep(2000);		
	
	
	//slider
	
	driver.navigate().to("https://jqueryui.com/slider/");
	driver.manage().timeouts();
	driver.switchTo().frame(0);
	WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	action.clickAndHold(slider).moveByOffset(100,0).release(slider).build().perform();
	Thread.sleep(4000);
	
	
	//Button
	driver.navigate().to("https://jqueryui.com/button/");
	driver.manage().timeouts();
	driver.switchTo().frame(0);
	
	WebElement btn=driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']"));
	action.click(btn).build().perform();
	Thread.sleep(2000);
	
	
	//////spinner
	driver.navigate().to("https://jqueryui.com/spinner/");
	driver.manage().timeouts();
	driver.switchTo().frame(0);
	
		//diasable/enable
	WebElement spin=driver.findElement(By.xpath("//button[@id='disable']"));
	action.click(spin).build().perform();
	Thread.sleep(1000);
			
	//toggle widget
	WebElement spin1=driver.findElement(By.xpath("//button[@id='destroy']"));
	action.click(spin1).build().perform();
			Thread.sleep(1000);
			
		//get value
	WebElement spin2=driver.findElement(By.xpath("//input[@id='spinner']"));
	spin2.sendKeys("2");
	
	WebElement spin3=driver.findElement(By.xpath("//button[@id='getvalue']"));
	action.click(spin3).build().perform();
	spin2.clear();
	
	//set value
	WebElement spin4=driver.findElement(By.xpath("//button[@id='setvalue']"));
	action.click(spin4).build().perform();	
	
	
	
	//datepicker
	driver.navigate().to("https://jqueryui.com/datepicker/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.switchTo().frame(0);

	//click on the datefield
	WebElement dtp=driver.findElement(By.id("datepicker"));
	dtp.click();
	Thread.sleep(2000);
	//find all element of datepicker
		
	List<WebElement>dates=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
	 int total_node=dates.size();

	 for (int i = 0; i <total_node; i++)
	 {

		 String date=dates.get(i).getText();
		 if (date.equalsIgnoreCase("30"))
		 {
		dates.get(i).click();	
		}
	}
	
	
	Thread.sleep(2000);
	
	//checkboxradio
	
	driver.navigate().to("https://jqueryui.com/checkboxradio/");
	driver.manage().timeouts();
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	
	List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio'and @class='']"));
	
	*/
	
	//tooltip
	driver.navigate().to("https://jqueryui.com/tooltip/");
	driver.manage().timeouts();
	driver.manage().window().maximize();
	
	//age textbox
	
	WebElement age=driver.findElement(By.id("age"));
	action.moveToElement(age).perform();
	Thread.sleep(1000);
	
	//tooltip link
	WebElement tool_link=driver.findElement(By.xpath("/html/body/p[1]/a"));
	action.moveToElement(tool_link).perform();
	Thread.sleep(1000);
	
	//themeroller link
	WebElement theme_roller_link=driver.findElement(By.xpath("/html/body/p[2]/a"));
	action.moveToElement(theme_roller_link).perform();
	
	
}
}
