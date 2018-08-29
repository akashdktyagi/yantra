package dev.backup.pooja.assignments; 




import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation;


/*   Author pooja zade
 /*  Test cases for frames and Actions
 *  1.Droppable 
 *  2.Draggable
 *  3.slider
 *  4.selectable
 *  5.sortable
 *  6.spinner
 *  7.tabs
 *  8.tooltabs
 *  9.datepickable
 */


public class Frames_actions {

	private static final WebElement resize = null;

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
		driver.navigate().to("https://jqueryui.com/draggable/");

		driver.switchTo().frame(0);

		WebElement draggable =driver.findElement(By.xpath("//div[@id='draggable']"));	     

		action.clickAndHold(draggable).moveByOffset(150, 50).release(draggable).perform();

		Thread.sleep(4000);


		//slider
		driver.navigate().to("https://jqueryui.com/slider/");

		driver.switchTo().frame(0);

		WebElement slider =driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));


		action.clickAndHold(slider).moveByOffset(150, 0).release(slider).build().perform();

		Thread.sleep(4000);

		//seletable
		driver.navigate().to("https://jqueryui.com/selectable/");

		driver.switchTo().frame(0);

		WebElement selectable =driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));


		action.click(selectable).build().perform();

		Thread.sleep(4000);

		//sortable
		driver.navigate().to("https://jqueryui.com/sortable/");

		driver.switchTo().frame(0);

		WebElement sortable =driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));


		action.clickAndHold(sortable).dragAndDropBy(sortable, 0,100).build().perform();

		Thread.sleep(4000);

		//spinner
		driver.navigate().to("https://jqueryui.com/spinner/");

		driver.switchTo().frame(0);
		//WebElement spinner1 =driver.findElement(By.xpath("//button[@id='setvalue']"));
		//WebElement spinner1 = driver.findElement(By.className("ui-button ui-corner-all ui-widget"));
		//action.click(spinner1).build().perform();

		WebElement spinner2 =driver.findElement(By.xpath("//button[@id='disable']"));
		action.click(spinner2).build().perform();

		WebElement spinner3 =driver.findElement(By.xpath("//button[@id='destroy']"));
		action.click(spinner3).build().perform();

		WebElement spinner4=driver.findElement(By.xpath("//input[@id='spinner']"));
		spinner2.sendKeys("1");
		// WebElement spinner4 =driver.findElement(By.xpath("//button[@id='getvalue']"));

		action.click(spinner4).build().perform();
		spinner2.clear();


		Thread.sleep(4000);

		//Tabs

		driver.navigate().to("https://jqueryui.com/tabs/");

		driver.switchTo().frame(0);

		WebElement tabs =driver.findElement(By.xpath("//a[@href='#tabs-2']"));
		action.click(tabs).build().perform();
		WebElement tabs1 =driver.findElement(By.xpath("//a[@href='#tabs-1']"));
		action.click(tabs1).build().perform();
		WebElement tabs2 =driver.findElement(By.xpath("//a[@href='#tabs-3']"));
		action.click(tabs2).build().perform();

		Thread.sleep(4000);

		//datepicker
		driver.navigate().to("https://jqueryui.com/datepicker/");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		driver.switchTo().frame(0);

		WebElement datepicker =driver.findElement(By.xpath("//input[@type='text']"));
		datepicker.click();


		Thread.sleep(4000);

		List<WebElement> dates =driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table//td"));

		int total_node=dates.size();

		for( int i=0; i<total_node; i++)
		{

			String date=dates.get(i).getText();
			if(date.equalsIgnoreCase("30")){

				dates.get(i).click();

			}
		}

		Thread.sleep(4000);


		//Resizable

		driver.navigate().to("https://jqueryui.com/resizable/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement Resizable =driver.findElement(By.id("resizable"));
		action.clickAndHold().dragAndDropBy(resize, 50, 20).release(resize).build().perform();


		Thread.sleep(5000);
		driver.quit();




	}}


