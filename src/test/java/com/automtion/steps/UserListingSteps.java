package com.automtion.steps;

import com.automation.pages.UserListingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserListingSteps {
	
	UserListingPage ulPage = new UserListingPage();
	
	@When("click on add button")
	public void click_on_add_button() {
		ulPage.clickOnAddBtn();
	}
	
	@Then("verify user is on user listing page")
	public void verify_user_is_on_user_listing_page() {
		ulPage.verifyUserListingPage();
	}

	@Then("verify user can see new user in the user list")
	public void verify_user_can_see_new_user_in_the_user_list() {
		ulPage.verifyNewUserInUserList();
	}


}
