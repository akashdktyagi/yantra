package dev.backup.pooja.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
	public static void main(String[] args) throws InterruptedException
	{
		//Autogenreated method
		System.setProperty ("webdriver.chrome.driver","D:\\chromedriver.exe");
		// Create driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Navigate and click on link
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");

		WebElement link_try_it_urself =driver.findElement(By.partialLinkText("Try it Yourself" ));
		//this link will open new tab because of its implementation of <a target= "_blank">
		link_try_it_urself.click();

		//switch to new tab
		//windows handles
		ArrayList <String> tabs=new ArrayList <String>(driver.getWindowHandles());

		//two handle will be returned
		System.out.println(tabs.size());

		//Switch two 2nd tabs
		driver.switchTo().window(tabs.get(1));

		//Switch to frame bcoj choose from file is present in the frame
		WebElement frame=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);

		//click on try it
		WebElement  btn_try_it =driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		btn_try_it.click();

		//To slow down the execution
		Thread.sleep(4000);

		//To click on ok 
		//driver.switchTo().alert().accept();
		//USe Dismiss to Click on cancel button

		//https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm
		//driver.switchTo().alert().dismiss();  // to cancel
		//driver.switchTo().alert().sendKeys("pooja"); // to send keys
	}





}

