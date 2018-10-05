package dev.backup.ravi.assignment.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
     
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			
		 ChromeDriver driver = new ChromeDriver();//launch chrome
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 
		   driver.findElement(By.name("proceed")).click();//click on Go btn
		   Thread.sleep(5000);
	       Alert alert = driver.switchTo().alert();
	       System.out.println(alert.getText());
	       alert.accept();//click on ok btn
	      //alert.dismiss();//click on cancel btn
	       driver.close();

	}

}
