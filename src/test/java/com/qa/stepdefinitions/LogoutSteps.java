package com.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.LoginPageSaucelab;
import com.qa.hooks.Hooks;
import com.qa.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	WebDriver driver;
	LoginPageSaucelab loginPage;
	HomePage homePage;
	@Given("user launch the application")
	public void user_launch_the_application() {
		driver=Hooks.driver;
		driver.get("https://www.saucedemo.com/");
	    loginPage = new LoginPageSaucelab(driver);
	    homePage = new HomePage(driver);
	    //System.out.println(homePage);
	}

	@And("enter the username and password")
	public void enter_the_username_and_password() {
	    loginPage.enterUsername("standard_user");
	    loginPage.enterPassword("secret_sauce");
	    loginPage.loginBtnClick();
	}

	@Then("user navigted to home page")
	public void user_navigted_to_home_page() {
	    System.out.println("User got loggeed in");
	}
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("User is on Home Page");
	}

	@When("clicks on option button")
	public void clicks_on_option_button() {
		homePage.clickOptionBtn();
	}

	@Then("options are displayed")
	public void options_are_displayed() {
		homePage.optionDisplayed();
	}

	@And("user clicks on Logout button")
	public void user_clicks_on_logout_button() {
		homePage.clickLogoutBtn();
	}

	@Then("user is logged out")
	public void user_is_logged_out() {
	    loginPage.loginPageText();
	}

}
