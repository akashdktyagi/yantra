package dev.backup.kalyani.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*   Author kalyani gaikwad
/*   frames and Actions
*  1.Droppable 
*  2.Draggable
*  3.slider
*  4.selectable
*  5.sortable
*  6.spinner
*  7.tabs
*  8.datepicker
*  9.checkboxradio
*  10.tooltip
*  11.menu
*  12.select menu
*  13.control group
*  14.resizable
*/

public class Frames_and_actions {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\VisionIT\\dependancy\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//creating object of action
		Actions action=new Actions(driver);


		//droppable
		driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.switchTo().frame(0);
WebElement drag=driver.findElement(By.id("draggable"));
WebElement drop=driver.findElement(By.id("droppable"));

action.dragAndDrop(drag, drop).perform();

Thread.sleep(4000);


//draggable
driver.navigate().to("https://jqueryui.com/draggable/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
WebElement dragable=driver.findElement(By.xpath("//*[@id='draggable']"));
action.clickAndHold(dragable).moveByOffset(70, 10).release(dragable).perform();

Thread.sleep(4000);


//slider
driver.navigate().to("https://jqueryui.com/slider/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
action.clickAndHold(slider).moveByOffset(200, 0).release(slider).build().perform();
action.clickAndHold(slider).moveByOffset(-50, 0).release(slider).build().perform();

Thread.sleep(4000);


//selectable.
driver.navigate().to("https://jqueryui.com/selectable/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
WebElement selectable=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
action.click(selectable).build().perform();

Thread.sleep(4000);


//sortable
driver.navigate().to("https://jqueryui.com/sortable/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
WebElement sortable=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
action.clickAndHold(sortable).dragAndDropBy(sortable, 0, 100).build().perform();

Thread.sleep(4000);



//spinner
driver.navigate().to("https://jqueryui.com/spinner/");
driver.manage().window().maximize();
driver.switchTo().frame(0);

//click on toggle enable/disable
WebElement spinner=driver.findElement(By.xpath("//button[@id='disable']"));
action.click(spinner).build().perform();

//click on toggle widget
WebElement spinner1=driver.findElement(By.xpath("//button[@id='destroy']"));
action.click(spinner1).build().perform();

Thread.sleep(4000);


//click on get value
WebElement spinner2=driver.findElement(By.xpath("//input[@id='spinner']"));
spinner2.sendKeys("3");
WebElement spinner3=driver.findElement(By.xpath("//button[@id='getvalue']"));
action.click(spinner3).build().perform();
spinner2.clear();

//click on set value
WebElement spinner4=driver.findElement(By.xpath("//button[@id='setvalue']"));
action.click(spinner4).build().perform();

Thread.sleep(4000);

//Tabs
driver.navigate().to("https://jqueryui.com/tabs/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
WebElement Tabs =driver.findElement(By.xpath("//a[@href='#tabs-2']"));
action.click(Tabs).build().perform();
WebElement Tabs1 =driver.findElement(By.xpath("//a[@href='#tabs-1']"));
action.click(Tabs1).build().perform();
WebElement Tabs2 =driver.findElement(By.xpath("//a[@href='#tabs-3']"));
action.click(Tabs2).build().perform();

Thread.sleep(4000);


//Datepicker
driver.navigate().to("https://jqueryui.com/datepicker/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.switchTo().frame(0);

//click on date field
WebElement Datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
Datepicker.click();
Thread.sleep(4000);

//find all elements of datepicker table
List<WebElement> dates=driver.findElements(By.xpath("//div[@ id='ui-datepicker-div']/table//td"));

int total_node=dates.size();
for(int i=0;i<total_node;i++)
{
String date=dates.get(i).getText();
if(date.equalsIgnoreCase("29"))
{
	dates.get(i).click();

}

}

Thread.sleep(3000);


		//checkboxradio
		driver.navigate().to("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement select_location_element=driver.findElement(By.xpath("//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
		action.click(select_location_element).perform();
		Thread.sleep(4000);

		WebElement select_hotel_rating_element=driver.findElement(By.xpath("//label[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']"));
		action.click(select_hotel_rating_element).perform();
		Thread.sleep(4000);

		WebElement select_bed_type_element=driver.findElement(By.xpath("//label[@for='checkbox-nested-3']"));
		action.click(select_bed_type_element).perform();
		Thread.sleep(4000);

		
		
		

		WebElement select_location_element1=driver.findElement(By.xpath("//label[@for='radio-2']"));
		action.click(select_location_element1).perform();
		Thread.sleep(4000);

		WebElement select_hotel_rating_element1=driver.findElement(By.xpath("//label[@for='checkbox-2']"));
		action.click(select_hotel_rating_element1).perform();
		Thread.sleep(4000);

		WebElement select_bed_type_element1=driver.findElement(By.xpath("//label[@for='checkbox-nested-4']"));
		action.click(select_bed_type_element1).perform();
		Thread.sleep(4000);

		//tooltip
		driver.navigate().to("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		//1.for your age textbox
		WebElement your_age_Element =driver.findElement(By.id("age"));
		action.moveToElement(your_age_Element).perform();
		Thread.sleep(4000);
		
        //2.for tooltip link
		WebElement tooltipElement=driver.findElement (By.xpath("/html/body/p[1]/a"));
		action.moveToElement(tooltipElement).perform();
		Thread.sleep(4000);
		
		//3.for theme roller link
		WebElement theme_Roller_Element=driver.findElement(By.xpath("/html/body/p[2]/a"));
		action.moveToElement(theme_Roller_Element).perform();
		Thread.sleep(4000);
		
		
		//menu
		driver.navigate().to("https://jqueryui.com/menu//");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement list_of_menu_elements=driver.findElement(By.xpath("//ul[@id='menu'and @class='ui-menu ui-widget ui-widget-content']"));
		action.moveToElement(list_of_menu_elements).perform();
		Thread.sleep(4000);
		WebElement music_element=driver.findElement(By.id("ui-id-9"));
		action.moveToElement(music_element).perform();
		Thread.sleep(4000);
		WebElement list_of_sub_menu_elements=driver.findElement(By.id("ui-id-10"));
		action.moveToElement(list_of_sub_menu_elements).perform();
		Thread.sleep(4000);

		
		//select menu
		driver.navigate().to("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement select_speed_elements=driver.findElement(By.xpath("//span[@class='ui-selectmenu-text']"));
		action.click(select_speed_elements).perform();
		Thread.sleep(4000);
		
		//working only when other elements in select_menu are in comment
		WebElement select_a_file_elements=driver.findElement(By.xpath("//span[2][@class='ui-selectmenu-text']"));
		action.click(select_a_file_elements).perform();
		Thread.sleep(4000);
		
		WebElement select_a_no_elements=driver.findElement(By.id("number-button"));
		action.click(select_a_no_elements).perform();
		Thread.sleep(4000);
		
		//working only when other elements in select_menu are in comment
		WebElement select_a_title_elements=driver.findElement(By.id("salutation-button"));
		action.click(select_a_title_elements).perform();
		Thread.sleep(4000);
		
		
		//control_group
		driver.navigate().to("https://jqueryui.com/controlgroup/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement control_group=driver.findElement(By.xpath("//span[@class='ui-selectmenu-text']"));
		action.click(control_group).moveToElement(control_group).perform();
		Thread.sleep(4000);
		WebElement control_group_list=driver.findElement(By.id("ui-id-5"));
		action.click( control_group_list).perform();
		Thread.sleep(4000);
		WebElement checkbox=driver.findElement(By.xpath("//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
		action.click( checkbox).perform();
		Thread.sleep(4000);
		WebElement checkbox_radio=driver.findElement(By.xpath("//label[@class='ui-button ui-widget ui-checkboxradio-label ui-controlgroup-item']"));
		action.click( checkbox_radio).perform();
		Thread.sleep(4000);
		WebElement toggle=driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']"));
		action.click( toggle).perform();
		Thread.sleep(4000);
		WebElement book_now=driver.findElement(By.xpath("//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']"));
		action.click( book_now).perform();
		Thread.sleep(4000);
		
		//resizable
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
