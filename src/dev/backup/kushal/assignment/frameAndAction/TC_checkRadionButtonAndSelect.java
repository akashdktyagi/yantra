/**
 * 
 */
package dev.backup.kushal.assignment.frameAndAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author kushal
 *
 */
public class TC_checkRadionButtonAndSelect {

	String  url = "https://jqueryui.com/";
	WebDriver driver;
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void checkAndRadioMethod() {

		TC_commonForAll.chromeDriver("webdriver.chrome.driver","G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		try {
//			Script Of The Selection of Radio Button............
			driver.findElement(By.xpath("//a[@href='https://jqueryui.com/checkboxradio/']")).click();
			driver.switchTo().frame(0);
			List<WebElement> radio_value = driver.findElements(By.xpath("/html/body/div/fieldset[1]/label"));
			//		System.out.println(radio_value.size());
			for(WebElement ele : radio_value) {
				String get_radio_val = ele.getText();
				//		System.out.println(get_radio_val);
				if(get_radio_val.equalsIgnoreCase("London")) {
					ele.click();

				}
			}
			
//			Script Of The Selection of Checkbox............
			Thread.sleep(3000);
			List<WebElement> checkBox  = driver.findElements(By.xpath("/html/body/div/fieldset[2]/label"));
			//		System.out.println(checkBox.size());
			for(WebElement check_b : checkBox) {
				String select_val = check_b.getText();
				System.out.println(select_val);
				if(select_val.equalsIgnoreCase("2 Star")){
					check_b.click();		}
				else if(select_val.equalsIgnoreCase("3 Star")){
					check_b.click();
				}
				else if(select_val.equalsIgnoreCase("4 Star")){
					check_b.click();
				}
			}
			
			Thread.sleep(3000);
//			Script Of The Selection of Nested Checkbox............
			List<WebElement> nested_check  = driver.findElements(By.xpath("/html/body/div/fieldset[3]/label"));
			//		System.out.println(checkBox.size());
			for(WebElement nested_chk : nested_check) {
				String final_selection = nested_chk.getText();
				System.out.println(final_selection);
				if(final_selection.equalsIgnoreCase("2 Double")){
					nested_chk.click();		}
				else if(final_selection.equalsIgnoreCase("2 Queen")){
					nested_chk.click();
				}
				else if(final_selection.equalsIgnoreCase("1 King")){
					nested_chk.click();
				}
			}
		}catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
