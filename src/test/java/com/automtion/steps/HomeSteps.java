package com.automtion.steps;

import com.automation.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
	
	HomePage home = new HomePage();

	@Then("verify login successful")
	public void verify_login_successful() {
		home.verifyHomePage();
	}
	
	@When("user select Add Employee from PIM menu")
	public void user_select_add_employee_from_pim_menu() {
		home.selectAddEmployeeFromPIMMenu();
	}
	
	@When("user click on users link from user management under admin tab")
	public void user_click_on_users_link_from_user_management_under_admin_tab() {
		home.clickUserLinkUnderAdmin();
	}


}
