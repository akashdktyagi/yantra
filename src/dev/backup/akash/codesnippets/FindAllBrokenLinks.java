package dev.backup.akash.codesnippets;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Devina\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//1 Create Driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//Navigate and click on the link
		driver.get("http://parabank.parasoft.com/");
		
		List<WebElement> col_all_links = driver.findElements(By.xpath("//a"));
		
		//Saving all urls in the Array List
		ArrayList<String> list_of_all_urls = new ArrayList<String>();
		for(int i=0;i<col_all_links.size();i++) {
			list_of_all_urls.add(col_all_links.get(i).getAttribute("href"));
			
			//Creating URL object
			URL url_link = new URL(list_of_all_urls.get(0));
			
			//creating conn object for the URL
			HttpURLConnection conn = (HttpURLConnection) url_link.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(2000);
			
			conn.connect();
			
			if (conn.getResponseCode()==200) {
				System.out.println("Link is not broken. Status code is:" + conn.getResponseCode() +" URL: " + list_of_all_urls.get(i) );
			}else {
				System.err.println("Link is broken. Status code :" + conn.getResponseCode() + " URL: " + list_of_all_urls.get(i) );
			}
			
			
		}
		
	}

}
