package dev.backup.kushal.assignment.frameAndAction;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TC_dragAndDrop {

	static WebDriver driver;

	@Test
	public static void frame_and_action() throws InterruptedException {		
		TC_commonForAll.chromeDriver("webdriver.chrome.driver","G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Element which need to drop.		
			try {
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();

				driver.switchTo().frame(0);
				WebElement drag = driver.findElement(By.id("draggable"));
				WebElement drop = driver.findElement(By.id("droppable"));
				//   Using Action class for drag and drop.		
				Actions act=new Actions(driver);					

				//   Drag and Drop.		
				act.dragAndDrop(drag , drop).perform();

				Thread.sleep(4000);

				driver.navigate().back();
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();

				driver.switchTo().frame(0);

				//     Find element for dragging.....
				WebElement drag_return = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
				act.clickAndHold(drag_return).moveByOffset(230, 0).release(drag_return).perform();
				Thread.sleep(3000);
				driver.quit();
			  }catch(Exception obj) {
		  }
	}
}
