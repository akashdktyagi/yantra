package dev.backup.pooja.assignments; 




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.impl.xs.identity.Selector;
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
 *  9.datepicker
 *  10.menu
 *  11.select menu
 *  12.checkboxradio
 *  13.control group
 *  14.resizable = not working
 *  15.autocomplete by ajax = not working
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
		driver.navigate().to("https://jqueryui.com/draggable/");

		driver.switchTo().frame(0);

		WebElement draggable =driver.findElement(By.xpath("//div[@id='draggable']"));	     

		action.clickAndHold(draggable).moveByOffset(150, 50).release(draggable).perform();

		Thread.sleep(4000);


		//Slider
		driver.navigate().to("https://jqueryui.com/slider/");

		driver.switchTo().frame(0);

		WebElement slider =driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));


		action.clickAndHold(slider).moveByOffset(150, 0).release(slider).build().perform();

		Thread.sleep(4000);

		//Seletable
		driver.navigate().to("https://jqueryui.com/selectable/");

		driver.switchTo().frame(0);

		WebElement selectable =driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));


		action.click(selectable).build().perform();

		Thread.sleep(4000);

		//Sortable
		driver.navigate().to("https://jqueryui.com/sortable/");

		driver.switchTo().frame(0);

		WebElement sortable =driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));


		action.clickAndHold(sortable).dragAndDropBy(sortable, 0,100).build().perform();

		Thread.sleep(4000);

		//Spinner
		driver.navigate().to("https://jqueryui.com/spinner/");

		driver.switchTo().frame(0);


		WebElement spinner1 =driver.findElement(By.xpath("//button[@id='setvalue']"));
		action.click(spinner1).build().perform();

		WebElement spinner2 =driver.findElement(By.xpath("//button[@id='disable']"));
		action.click(spinner2).build().perform();

		WebElement spinner3 =driver.findElement(By.xpath("//button[@id='destroy']"));
		action.click(spinner3).build().perform();

		WebElement spinner4=driver.findElement(By.xpath("//input[@id='spinner']"));
		spinner2.sendKeys("1");
		// WebElement spinner4 =driver.findElement(By.xpath("//button[@id='getvalue']"));

		//action.click(spinner4).build().perform();
		//spinner2.clear();


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

		//Datepicker
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
		// by using concept of collection and by applying for loop we can reduce code but its not running 

		//Checkboxradio
		driver.navigate().to("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//Radio Group
		WebElement select_location0=driver.findElement(By.xpath("//label[@for='radio-1']"));
		action.click(select_location0).perform();
		Thread.sleep(3000);
		WebElement select_location1=driver.findElement(By.xpath("//label[@for='radio-2']"));
		action.click(select_location1).perform();
		Thread.sleep(3000);
		WebElement select_location2=driver.findElement(By.xpath("//label[@for='radio-3']"));
		action.click(select_location2).perform();
		Thread.sleep(3000);
		//Cheakbox
		WebElement sel_hotel_ratings=driver.findElement(By.xpath("//label[@for='checkbox-1']"));
		action.click(sel_hotel_ratings).perform();
		Thread.sleep(3000);
		WebElement sel_hotel_ratings1 =driver.findElement(By.xpath("//label[@for='checkbox-2']"));
		action.click(sel_hotel_ratings1).perform();
		Thread.sleep(3000);
		WebElement sel_hotel_ratings2 =driver.findElement(By.xpath("//label[@for='checkbox-3']"));
		action.click(sel_hotel_ratings2).perform();
		Thread.sleep(3000);
		WebElement sel_hotel_ratings3=driver.findElement(By.xpath("//label[@for='checkbox-4']"));
		action.click(sel_hotel_ratings3).perform();
		Thread.sleep(3000);
		//Checkbox nested in label
		WebElement sel_bedtype=driver.findElement(By.xpath("//label[@for='checkbox-nested-1']"));
		action.click(sel_bedtype).perform();
		Thread.sleep(3000);
		WebElement sel_bedtype1 =driver.findElement(By.xpath("//label[@for='checkbox-nested-2']"));
		action.click(sel_bedtype1).perform();
		Thread.sleep(3000);
		WebElement sel_bedtype2 =driver.findElement(By.xpath("//label[@for='checkbox-nested-3']"));
		action.click(sel_bedtype2).perform();
		Thread.sleep(3000);
		WebElement sel_bedtype3=driver.findElement(By.xpath("//label[@for='checkbox-nested-4']"));
		action.click(sel_bedtype3).perform();
		Thread.sleep(3000);


		//Resizable
		// its not working
		driver.navigate().to("https://jqueryui.com/resizable/");

		driver.switchTo().frame(0);
		WebElement Resizable =driver.findElement(By.id("resizable"));
		//action.clickAndHold(Resizable).release(Resizable).build().perform();
		action.clickAndHold(Resizable).dragAndDropBy(Resizable, 70, 0).build().perform();

		Thread.sleep(5000);


		//tooltip
		driver.navigate().to("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		//your age textbox
		WebElement age=driver.findElement(By.id("age"));
		action.moveToElement(age).perform();
		Thread.sleep(3000);

		//for tooltip link
		WebElement tooltip=driver.findElement(By.xpath("/html/body/p[1]/a"));
		action.moveToElement(tooltip).perform();
		Thread.sleep(3000);

		//themeroller
		WebElement theme_roller=driver.findElement(By.xpath("/html/body/p[2]/a"));
		action.moveToElement(theme_roller).perform();
		Thread.sleep(3000);





		//menu

		driver.navigate().to("https://jqueryui.com/menu/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement list_of_menu=driver.findElement(By.xpath("//ul[@id='menu' and @class='ui-menu ui-widget ui-widget-content']"));
		action.moveToElement(list_of_menu).perform();
		Thread.sleep(3000);

		WebElement music =driver.findElement(By.id("ui-id-9"));
		action.moveToElement(music).perform();
		Thread.sleep(3000);

		WebElement music_list =driver.findElement(By.id("ui-id-13"));//[@id='ui-id-13']"));
		action.moveToElement(music_list).perform();
		Thread.sleep(3000);

		//select menu
		driver.navigate().to("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement select_speed=driver.findElement(By.id("speed-button"));
		action.click(select_speed).perform();
		//Thread.sleep(3000);

		//its working only when others elements is in select_menu are in comment
		WebElement select_file =driver.findElement(By.id("files-button"));
		action.click(select_file).perform();
		Thread.sleep(3000);  


		WebElement select_num =driver.findElement(By.id("number-button"));
		action.click(select_num).perform();
		Thread.sleep(3000);

		//its working only when others elements in select_menu are in comment
		WebElement select_title =driver.findElement(By.id("salutation-button"));
		action.click(select_title).perform();
		Thread.sleep(3000);

		//Control group
		driver.navigate().to("https://jqueryui.com/controlgroup/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement cheak_box1 =driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[1]"));
		action.click(cheak_box1).perform();
		Thread.sleep(3000);

		WebElement drop_down1 =driver.findElement(By.id("car-type-button"));
		action.click(drop_down1).perform();
		Thread.sleep(3000);

		WebElement cheak_box2 =driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[2]/span[1]"));
		action.click(cheak_box2).perform();
		Thread.sleep(3000);

		WebElement checkbox_radio2 =driver.findElement(By.xpath("//label[@class='ui-button ui-widget ui-checkboxradio-label ui-controlgroup-item']"));
		action.click(checkbox_radio2).perform();
		Thread.sleep(3000);  


		WebElement toggle =driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']"));
		action.click(toggle).perform();
		Thread.sleep(3000);

		WebElement button =driver.findElement(By.xpath("//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']"));
		action.click(button).perform();
		Thread.sleep(3000);

		//Auto_complete for ajax handling 
		//not getting ajax elements
		driver.navigate().to("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		// to supply initial string
		WebElement Auto_complete =driver.findElement(By.id("tags"));
		Auto_complete.sendKeys("a");
		Thread.sleep(4000);
		WebElement list_ele =driver.findElement(By.id("ui-id-60"));
		action.click(list_ele).perform();
		Thread.sleep(3000);
		//List<WebElement> radio_group=driver.findElements(By.xpath("//div[@id='ui-id-87'and @class='ui-menu-item-wrapper']"));






		driver.close();





















	}}


