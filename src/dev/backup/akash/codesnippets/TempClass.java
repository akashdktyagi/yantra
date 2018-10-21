package dev.backup.akash.codesnippets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		
		//1. Initialize the Browser
		WebDriver driver = new ChromeDriver();
		
		//2 Navigate
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//3. Element Identify
		WebElement o_username = driver.findElement(By.name("username"));
		WebElement o_password = driver.findElement(By.name("password"));
		WebElement o_sign_in_btn = driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']"));
		//*[@id="leftPanel"]/ul/li[4]/a
		//4. OPeration
		o_username.sendKeys("john");
		o_password.sendKeys("demo");
		o_sign_in_btn.click();
		
		//5. Verification
		String title_expected = "ParaBank | Accounts Overview";
		String title_actual = driver.getTitle();
		if (title_expected.equals(title_actual)){
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login Failed");
		}
		
		//Find Locators
		WebElement link_transfer_funds = driver.findElement(By.linkText("Transfer Funds"));


		
		//Click on Tranfer Funds
		link_transfer_funds.click();

		//Set Ammount text found
		WebElement txtbox_ammount = driver.findElement(By.id("amount"));
		WebElement list_from_account = driver.findElement(By.id("fromAccountId"));
		WebElement list_to_account = driver.findElement(By.id("toAccountId"));
		WebElement btn_tranfer = driver.findElement(By.xpath("//input[@value = 'Transfer']"));
		txtbox_ammount.sendKeys("1000");
		
		//Select from account
		Select oFromList = new Select(list_from_account);
		oFromList.selectByVisibleText("12789");
		
		//Select to account
		Select oToList = new Select(list_to_account);
		oFromList.selectByIndex(1);
		
		//Click on Transfer Button
		btn_tranfer.click();
	}//end method

}
