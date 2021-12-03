package com.automtion.steps;

import com.automation.pages.ViewPersonDetailsPage;

import io.cucumber.java.en.Then;

public class ViewPersonalDetailsSteps {
	
	ViewPersonDetailsPage pdPage = new ViewPersonDetailsPage();
	
	@Then("verify employee details on personal details page")
	public void verify_employee_details_on_personal_details_page() {
		pdPage.verifyEmployeeDetailsOnPersonalDetailsPage();
	}
}
