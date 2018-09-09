package dev.backup.kalyani.reusables;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GenericReusables
{	
		public static void Writelogs(String logtype , String msg)
		{
			System.out.println(logtype + " , " + msg);
			
		}
	public static   WebDriver webDriverManager(String browsertype , String url){
		//Create driver object
		WebDriver driver=new ChromeDriver();
		//Navigate
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		

	}
	}


