package com.qa.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// This file will be the starting point for executing all the test cases. 

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.qa.stepdefinitions","com.qa.hooks"}, 
    plugin = {
    		"pretty",
    	    "html:target/cucumber-report.html",
    	   },
    monochrome = true
   
)
public class TestRunner extends AbstractTestNGCucumberTests {

}