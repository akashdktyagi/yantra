package dev.backup.kalyani.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItUseToHandleWindowPopUp 
{
public static void main(String[] args) throws IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver","F:\\VisionIT\\dependancy\\chromedriver_win32\\chromedriver.exe");
	//create driver object

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//navigate and click on the links
	driver.get("https://www.w3schools.com/jsref/dom_obj_fileupload.asp");
	WebElement lnk_try_it_urself = driver.findElement(By.partialLinkText("Try it Yourself"));
	
	//this link will open new tab because of its implementation of <a target= "_blank">
	lnk_try_it_urself.click();
	
	//Switch to New tab
			//Get windows handles
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			
			//Two handle will be returned
			System.out.println(tabs.size());
			
			//Switch to 2nd tab
			driver.switchTo().window(tabs.get(1));
			//Switch to Frame because Choose from File is present in the frame
			WebElement frame = driver.findElement(By.id("iframeResult"));
			driver.switchTo().frame(frame);
			
			//Find Element Choose from file
			WebElement btn_choose_from_file = driver.findElement(By.id("myFile"));
			btn_choose_from_file.click();
			
			
			//A Window pop Up will be invoked which could not be handled using Selenium
			//Auto It script need to be invoked in such cases
			String fileUploadPath =  "D:\\VisionITWorkspace\\dependencies\\FileUpload.txt";
		
		//Exe file has been paramaterized to accept file name at run time
		//Note the space after exe and file name";
			
			//Exe file has been paramaterized to accept file name at run time
			//Note the space after exe and file name
			
			Runtime.getRuntime().exec("F:\\VisionIT\\dependancy\\autoit\\w3school window popup1.exe " + fileUploadPath);
			
			/*
			 * Tips on How to pass command line parameters to auto it script
			 *	https://www.autoitscript.com/autoit3/docs/intro/running.htm#CommandLine
			 *
			 * Auto IT Code:
			 *  ControlFocus("Open","","Edit1")
				ControlSetText("Open","","Edit1",$CmdLine[1])
				ControlClick("Open","","Button1")

			 */
			//123
			
		}

	}

