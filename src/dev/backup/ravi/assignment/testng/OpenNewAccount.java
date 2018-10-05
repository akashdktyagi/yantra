package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccount {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://parabank.parasoft.com");
		driver.manage().window().maximize();
		
		WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button = driver.findElement(By.xpath("//input[@class='button' and @type='submit']"));
		user_name.sendKeys("john");
		password.sendKeys("demo");	
		button.click();
						
			// click link open new account
		
		WebElement New_account = driver.findElement(By.xpath("//a[@href='/parabank/openaccount.htm']"));
		New_account.click();
		
		//navigate to next link
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		// select account type
		Select Dropdown = new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		Dropdown.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		
	}

}
