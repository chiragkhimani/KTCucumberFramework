package com.automtion.steps;

import com.automation.pages.AddEmployeePage;

import io.cucumber.java.en.When;

public class AddEmployeeSteps {
	
	AddEmployeePage aePage = new AddEmployeePage();

	@When("enter first name")
	public void enter_first_name() {
		aePage.enterFirstName();
	}

	@When("enter last name")
	public void enter_last_name() {
		aePage.enterLastName();
	}

	@When("click on save button")
	public void click_on_save_button() {
		aePage.clickOnSaveBtn();
	}

}
