/**
 * 
 */
package dev.backup.kushal.frameWork.POM_paraBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.javascript.host.Plugin;
import com.yantra.product.parabank.pageaction.PA_AccountOverview;
import dev.backup.akash.codesnippets.WebDriverManager;

/**
 * @author Kushal Thadani
 *
 */
public class Logic_log {
	

@Test
public void logicBuildForLogin() {
	System.setProperty("webdriver.chrome.driver", "G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	locatorsLog log_in = new locatorsLog(driver);
	String expectedUrl = "http://parabank.parasoft.com/parabank/index.htm";
	driver.get(expectedUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	log_in.userNameMethod("john");
	log_in.passWordMethod("demo");
	log_in.loginMethod();
	
	String nextPageUrl = driver.getCurrentUrl();
	if(nextPageUrl.equals("http://parabank.parasoft.com/parabank/overview.htm")) {
		System.out.println("Login Successfull -: Passed");
	}else {
		System.out.println("Login Un-Successfull -: Failed");
	}
}
}

		