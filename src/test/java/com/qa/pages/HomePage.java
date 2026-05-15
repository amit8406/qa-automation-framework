package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By optionBtn = By.xpath("//button[@id=\"react-burger-menu-btn\"]");
	By logoutLink = By.xpath("//a[@id=\"logout_sidebar_link\"]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void clickOptionBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(optionBtn));
		driver.findElement(optionBtn).click();
	}
	public void clickLogoutBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		driver.findElement(logoutLink).click();
	}
	public boolean optionDisplayed()
	{
		boolean a = driver.findElement(logoutLink).isDisplayed();
		if(a==true)
		{
			System.out.println("Logout option is available");
		}
		else
		{
			System.out.println("Logout option is not displayed");
		}
		return a;
	}
	
	
	
}
