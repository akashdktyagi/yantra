package dev.backup.akash.codesnippets;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		
		//1 Create Driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//Navigate and click on the link
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
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
		
		//Click on Try it
		WebElement btn_try_it = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		btn_try_it.click();
		
		//TO slow down the Execution
		Thread.sleep(5000);
		
		
		//To click on Ok
		driver.switchTo().alert().accept();
		
		//to fetch the text
		System.out.println(driver.switchTo().alert().getText());
		
		//USe Dismiss to Click on cancel button
		//https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm
		//driver.switchTo().alert().dismiss();  // to cancel
		//driver.switchTo().alert().sendKeys("Akash"); // to send keys
	}

}
