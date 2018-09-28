package dev.backup.pooja.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItUseToHandleWindowPopUp
{
	public static void main(String[] args) throws IOException   
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		// Create driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Navigate and click on link
		driver.get("https://www.w3schools.com/jsref/dom_obj_fileupload.asp");

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
		WebElement  btn_Choose_file =driver.findElement(By.id("myFile"));
		btn_Choose_file.click();
		//A Window pop Up will be invoked which could not be handled using Selenium
		//Auto It script need to be invoked in such cases
		String FileUploadPath = "‪‪D://Autoit saved files//Fileupload.txt";
		
	
		//Exe file has been paramaterized to accept file name at run time
		//Note the space after exe and file name
		Runtime.getRuntime().exec("D:\\Autoit saved files\\w3school windowpopup1.exe "+ FileUploadPath);
		/*
		 * Tips on How to pass command line parameters to auto it script
		 *	https://www.autoitscript.com/autoit3/docs/intro/running.htm#CommandLine
		 *
		 * Auto IT Code:
		 *  ControlFocus("Open","","Edit1")
			ControlSetText("Open","","Edit1",$CmdLine[1])
			ControlClick("Open","","Button1")

		 */
		//////
		


	}

}
