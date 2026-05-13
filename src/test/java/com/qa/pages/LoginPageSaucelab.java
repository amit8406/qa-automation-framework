package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageSaucelab {
	
	WebDriver driver;
	
	By username = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.xpath("//input[@id='login-button']");
	
	public LoginPageSaucelab(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	 public void loginBtnClick()
	 {
		 driver.findElement(btnLogin).click();
	 }

}
