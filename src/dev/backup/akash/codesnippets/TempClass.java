package dev.backup.akash.codesnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		
		//1. Intitilaize the Browser
		WebDriver driver = new ChromeDriver();
		
		//2 Navigate
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		//3. Element Identify
		WebElement o_username = driver.findElement(By.name("username"));
		WebElement o_password = driver.findElement(By.name("password"));
		WebElement o_sign_in_btn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		//4. OPeration
		o_username.sendKeys("john");
		o_password.sendKeys("demo");
		o_sign_in_btn.click();
		
		//5. Verification
		String title_expected = "ParaBank | Accounts Overview";
		String title_actual = driver.getTitle();
		if (title_expected.equals(title_actual)){
			System.out.println("Login SUccessfull");
		}else {
			System.out.println("Login Failed");
		}

	}

}
