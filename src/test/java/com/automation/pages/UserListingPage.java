package com.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

public class UserListingPage {

	@FindBy(id = "btnAdd")
	WebElement addBtn;

	@FindBy(id = "btnDelete")
	WebElement deleteBtn;

	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td/a")
	List<WebElement> listOfUsers;

	public void clickOnAddBtn() {
		addBtn.click();
	}

	public void verifyUserListingPage() {
		Assert.assertTrue("Add button is missing from user listing page", addBtn.isDisplayed());
		Assert.assertTrue("Delete button is missing from user listing page", deleteBtn.isDisplayed());
	}

	public void verifyNewUserInUserList() {
		boolean flag = false;
		
		for (WebElement user : listOfUsers) {
			if (user.getText().equals(PropertyReader.getProperty("new.user.name"))) {
				flag = true;
			}
		}

		Assert.assertTrue("New users not listed on user listing page", flag==true);
	}

}
