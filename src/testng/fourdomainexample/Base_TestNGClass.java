package testng.fourdomainexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Base_TestNGClass {
	WebDriver driver;


	@BeforeClass
	public void SetUpClassLevel() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Devina\\Downloads\\MicrosoftWebDriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Devina\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devina\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	
	@Parameters({"browser_name"})
	@BeforeMethod
	public void beforeMethod(String browser_name) {
		if (browser_name.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browser_name.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if (browser_name.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
