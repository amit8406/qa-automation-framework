package com.qa.hooks;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.base.BaseTest;
import com.qa.utilities.ExtentReportManager;
import io.cucumber.java.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest{
	
	public static ExtentReports extent = ExtentReportManager.getReporter();
	public static ExtentTest test;
	@Before(order = 2)
	public void beforeScenario(Scenario scenario)
	{
		test = extent.createTest(scenario.getName());
	}
	@Before(order = 1)
	public void launchBrowser()
	{
		setup();
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			test.fail("Sceanrio is failed");
		}
		else
		{
			test.pass("Scenario is passed");
		}
		extent.flush();
	}
	
	@After(order=2)
	public void closeBrowser()
	{
		tearDown();
	}

}
