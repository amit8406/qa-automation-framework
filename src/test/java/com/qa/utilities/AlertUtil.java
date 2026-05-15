package com.qa.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertUtil {
	WebDriver driver;
	
	public AlertUtil(WebDriver driver)
	{
		this.driver = driver;
	}

	public void acceptAlert()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void rejectAlert()
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void alertGetText()
	{
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}
	public void enterTextinAlert(String text)
	{
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}
}
