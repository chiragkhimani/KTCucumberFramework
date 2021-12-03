package com.automtion.steps;

import com.automation.pages.SaveUserDetailsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaveUserDetailsSteps {
	
	SaveUserDetailsPage sudPage = new SaveUserDetailsPage();
	
	@Then("verify save user details page is displayed")
	public void verify_save_user_details_page_is_displayed() {
		sudPage.verifySaveUserDetailsPage();
	}

	@When("user fill all user details")
	public void user_fill_all_user_details() {
		sudPage.fillAllUserDetails();
	}

}
