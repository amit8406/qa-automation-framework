package com.qa.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	
	public static ExtentReports extent; 
	
	public static ExtentReports getReporter()
	{
		if(extent==null)
		{
			ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
			spark.config().setReportName("Automation Report");
			spark.config().setDocumentTitle("BDD Framework Report");
			extent = new ExtentReports();
			extent.attachReporter(spark);//expected
		}
		return extent;
		
	}

}
