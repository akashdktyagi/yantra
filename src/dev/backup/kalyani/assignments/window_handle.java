package dev.backup.kalyani.assignments;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","F:\\VisionIT\\dependancy\\chromedriver_win32\\chromedriver.exe");
//create driver object

WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//navigate and click on the links

driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
WebElement lnk_try_it_urself = driver.findElement(By.partialLinkText("Try it Yourself"));

//this link will open new tab because of implementation of <a target="blank">
lnk_try_it_urself.click();

//Switch to New tab
//Get windows handles

ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());

//two handle will be returned
System.out.println(tabs.size());

//switch to second tab
driver.switchTo().window(tabs.get(1));

//Switch to Frame because Choose from File is present in the frame
WebElement frame=driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(frame);
//Click on Try it
WebElement btn_try_it = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		btn_try_it.click();
		
//TO slow down the Execution
Thread.sleep(5000);
				
//to click on ok
driver.switchTo().alert().accept();


//USe Dismiss to Click on cancel button
		//https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm
		//driver.switchTo().alert().dismiss();  // to cancel
		//driver.switchTo().alert().sendKeys("kalyani"); // to send keys
	


				

}
}
