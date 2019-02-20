package com.yantra.core.managers;

import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class CmnMethods {

	public static void WriteLog(String logType, String msg) {
		String callerMethodName = Thread.currentThread().getStackTrace()[2].getMethodName();

		Date date= new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);

		msg = "--" + ts + " " + logType+ " " + callerMethodName + " " + msg + "<br>" + "<br>";
		Reporter.log(msg,true);
	 	
		
		//Taking Screen shot and attaching it to the Test NG report

	}
}
