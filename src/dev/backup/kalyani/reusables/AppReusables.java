package dev.backup.kalyani.reusables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppReusables 
{
		public AppReusables(){
			// TODO Auto-generated constructor stub
		}
	public static void LoginToTheApplication(WebDriver driver, String username, String passward){
		//Locators for Login
		WebElement txt_username = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
		WebElement txt_password = driver.findElement(By.xpath("//input[@name='password' and @class='input']"));
		WebElement btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));

		//Operation on- Login in to application
		txt_username.sendKeys("john");
		txt_password.sendKeys("demo");
		btn_submit.click();
	}
	}



