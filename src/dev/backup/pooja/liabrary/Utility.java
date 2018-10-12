package dev.backup.pooja.liabrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility 
{
public static void captureScreenShot(WebDriver driver, String ScreenShotName) throws Exception
{

	try {
		TakesScreenshot ts =(TakesScreenshot)driver;
		//Take screenShot and keep in memory
		File source= ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFileToDirectory(source,new File("./Sreenshot/"+ScreenShotName+"png"));
		
		
			
			//System.out.println("Sreenshot Captured"+e.getMessage());
	} catch (Exception e) 
	{
		System.out.println("Sreenshot Captured"+e.getMessage());
} 
	
			

}
}
