package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountOverview {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
		driver.get("http://parabank.parasoft.com");
		
		// Maximize window 
		driver.manage().window().maximize();
		
		WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button = driver.findElement(By.xpath("//input[@class='button' and @type='submit']"));
		user_name.sendKeys("john");
		password.sendKeys("demo");	
		button.click();
		
		WebElement acc_overview = driver.findElement(By.xpath("//a[@href='/parabank/overview.htm']"));
		acc_overview.click();
		// move to next link
		driver.navigate().forward();
		Thread.sleep(5000);
		
		WebElement account_no = driver.findElement(By.xpath("//a[@href='/parabank/activity.htm?id=12345']"));
		account_no.click();
		// select dropdown link
		Select DropDown = new Select(driver.findElement(By.xpath("//select[@name='month']")));
		//DropDown.selectByIndex(6);
		DropDown.selectByValue("April");
		
	    // perform boolean operation
		boolean a = driver.findElement(By.xpath("//select[@name='month']")).isDisplayed();
		System.out.println(a);
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
