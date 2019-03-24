package testng.fourdomainexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TC_Ecommerce extends Base_TestNGClass{

	@Parameters({"url_flipkart"})
	@Test
	public void t_01_check_flipkart(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"url_amazon"})
	@Test
	public void t_02_check_amazon(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"url_myntra"})
	@Test
	public void t_03_check_myntra(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"url_jabong"})
	@Test
	public void t_04_check_jabong(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}


}
