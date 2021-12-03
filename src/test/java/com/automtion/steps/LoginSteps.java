package com.automtion.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage login = new LoginPage();

	@Given("user open website")
	public void user_open_website() {
		login.openWebsite();
	}

	@Given("user enter valid credentials")
	public void user_enter_valid_credentials() {
		login.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
	}

	@Given("user enter invalid credentials")
	public void enterInvalidCredential() {
		login.doLogin("Antwan", "admin123");
	}
	
	@When("verify invalid login error message")
	public void verifyInvalidLoginError() {
		login.verifyInvalidLoginError();
	}

}
