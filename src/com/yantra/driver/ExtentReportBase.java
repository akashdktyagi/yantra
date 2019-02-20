package com.yantra.driver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportBase {

	 static   reports;
	 static ExtentTest test;
	 
	 public ExtentReportBase() {
		 reports = new ExtentReports("E:\\_AkashStuff\\Automation\\EclipseWorkspace\\Distributable\\ExtentReportResults.html");
	 }
}
