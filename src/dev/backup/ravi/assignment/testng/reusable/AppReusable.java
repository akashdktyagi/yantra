
package dev.backup.ravi.assignment.testng.reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppReusable 
{
	public static void LoginInToTheApplication(WebDriver driver,String username,String password)

	{
		WebElement txt_username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement txt_password =driver.findElement(By.xpath("//input[@name='password']"));
		WebElement btn_submit = driver.findElement(By.xpath("//input[@class='button' and @type='submit']"));
		
		//operation ob login into application
		txt_username.sendKeys("john");
		txt_password.sendKeys("demo");
		btn_submit.click();
		
	}
}

	
	
	

