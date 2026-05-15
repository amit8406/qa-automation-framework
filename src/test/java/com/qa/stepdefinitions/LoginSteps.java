package com.qa.stepdefinitions;

import io.cucumber.java.en.And;

import com.qa.base.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.qa.pages.*;

public class LoginSteps extends BaseTest {
	
	
	
	LoginPageSaucelab loginPage;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		
		driver.get("https://www.saucedemo.com/");
	    loginPage = new LoginPageSaucelab(driver);
	}

	@When("user enters the valid uname and pass")
	public void user_enters_the_valid_uname_and_pass() {
	    loginPage.enterUsername("standard_user");
	    loginPage.enterPassword("secret_sauce");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    loginPage.loginBtnClick();
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
	    System.out.println("Logged in successfully!");
	}
//	@Then("user accepts the alert displayed")
//	public void user_accepts_the_alert_displayed()
//	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		//wait.until(ExpectedConditions.presenceOfElementLocated(null))
//		System.out.println("Alert is accepted which was displayed on screen");
//	}
	
	
	


}
