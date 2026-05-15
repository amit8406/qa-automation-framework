package com.qa.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver;
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
