package dev.backup.kushal.frameWork.POM_paraBank;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locatorsLog {

	static By u_name = By.name("username");
	static By p_word = By.name("password");
	static By log_in_btn = By.xpath("//input[@type='submit']");
	public static WebDriver driver;
	locatorsLog(WebDriver driver){
		this.driver=driver;
	}
	public static void userNameMethod(String uname) {
		try {
//			WebDriverWait wait_obj = new WebDriverWait(driver , 20);
//			wait_obj.until(ExpectedConditions.visibilityOf(u_name);
			driver.findElement(u_name).sendKeys(uname);
			System.out.println("Pass "  +  " User Name has entered successfully. " + uname);
		}catch(NoSuchElementException obj1) {
			System.out.println("Fail "  +  " User name didn't enter. " + uname);
			obj1.printStackTrace();
		}

	}
	public  void clearData() {
		driver.findElement(u_name).clear();
	}
	public String CaptureData() {
		return driver.findElement(u_name).getAttribute("value");

	}
	public static void passWordMethod(String pWord) {
		try{
//			WebDriverWait wait_obj2 = new WebDriverWait(driver , 20);
//			wait_obj2.until(ExpectedConditions.visibilityOf(p_word);
			driver.findElement(p_word).sendKeys(pWord);
			System.out.println("Pass "  +  " User Name has entered successfully. " + pWord);
		}catch(NoSuchElementException obj2) {
			System.out.println("Fail "  +  " User name didn't enter. " + pWord);
		}

	}

	public static void loginMethod() {
		try {
//			WebDriverWait wait_obj3 = new WebDriverWait(driver , 40);
//			wait_obj3.until(ExpectedConditions.visibilityOf(log_in_btn);
			driver.findElement(log_in_btn).click();
			System.out.println("Pass "  +  " Login successfully." + log_in_btn);
		}catch(Exception obj3) {
			System.out.println("Fail "  +  " Login Unsuccessfully.!.." + log_in_btn);
		}
	}
}














//this.driver = drv;
//}
//
//@FindBy(how = How.NAME , using=" username")
//static
//WebElement txt_username;
//@FindBy(how = How.NAME , using = "password")
//static 
//WebElement txt_pwd;
//@FindBy(how = How.XPATH , using="//input[@type='submit']")
//static
//WebElement login_click;
//
////	Set User name
//public static void userNameMethod(String u_name) {
//try {
//	WebDriverWait wt = new WebDriverWait(driver , 20);
//	wt.until(ExpectedConditions.visibilityOf(txt_username));
//	txt_username.sendKeys(u_name);
//	System.out.println("Passed-:\t " + "User Name has been match. -:\t " + txt_username);
//}catch(NoSuchElementException E) {
//	System.out.println("Fail" + "Didn't Match" + txt_username);
//	E.printStackTrace();
//}
//}
//
////	Set Paasword
//public static void loginPassword(String pass_wrd) {
//try {
//	WebDriverWait wt1 = new WebDriverWait(driver , 20);
//	wt1.until(ExpectedConditions.visibilityOf(txt_pwd));
//	txt_pwd.sendKeys(pass_wrd);
//	System.out.println("Passed-:\t " + "Password has been match. -:\t " + txt_pwd);
//
//}catch(NoSuchElementException ob) {
//	System.out.println("Fail" + "Didn't Match" + txt_pwd);
//}
//}
//
////	Login click button
//public static void clickMethod() {
//try {
//	WebDriverWait wt2= new WebDriverWait(driver , 20);
//	wt2.until(ExpectedConditions.visibilityOf(login_click));
//	login_click.click();
//	System.out.println("Passed-:\t " + "Login Successfully. -:\t " + txt_pwd);
//
//}catch(Exception log) {
//	System.out.println("Passed-:\t " + "Exception Error. -:\t " + login_click);
//}
//}