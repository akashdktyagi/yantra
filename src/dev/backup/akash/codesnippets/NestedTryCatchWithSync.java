package dev.backup.akash.codesnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedTryCatchWithSync {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		 
		 /*
		 //click on Remove button
		 WebElement remove_button = driver.findElement(By.xpath("//button[@type='button' and text()='Remove']"));
		 remove_button.click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,20);

		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		 
		 //Check the text
		driver.findElement(By.xpath("//p[@id='message']")).getText();
		
		*/
		//***************Enable Disable
		 WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		 textbox.sendKeys("akash");
	}
	
	public void NestedTryCatchWithSyncq() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		 
		 /*
		 //click on Remove button
		 WebElement remove_button = driver.findElement(By.xpath("//button[@type='button' and text()='Remove']"));
		 remove_button.click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,20);

		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		 
		 //Check the text
		driver.findElement(By.xpath("//p[@id='message']")).getText();
		
		*/
		//***************Enable Disable
		 WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		 textbox.sendKeys("akash");
		 /*
		 for(int i=0;i<10;i++) {
			 try {
				 WebElement str1 = driver.findElement(By.xpath("//*[@id='message']"));
				 System.out.println(str1.getText());
				 break;
			 }catch(Exception e) {
				 Thread.sleep(1000);
			 } 
		 }
		 */


		 //Explicit wait
		 //Thread.sleep(10000);
		 /*
		 //dynamic wait
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='message']")));
		 
		 //Fetching Message
		 WebElement str = driver.findElement(By.xpath("//*[@id='message']"));
		 System.out.println(str.getText());
		 
		 //click on Enable button
		 WebElement Enable_button = driver.findElement(By.xpath("//button[@type='button' and text()='Enable']"));
		 Enable_button.click();
		 
		 //dynamic wait
		 WebDriverWait wait1= new WebDriverWait(driver,20);
		 wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='message']")));
		 
		 //Fetching Message
		 WebElement str1 = driver.findElement(By.xpath("//*[@id='message']"));
		 System.out.println(str1.getText());
		 
		 //Printing message
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rahul..!!!");
*/
	}

}
