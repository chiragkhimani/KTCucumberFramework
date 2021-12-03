package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.PropertyReader;
import com.automation.utils.WaitUtils;

public class ViewPersonDetailsPage extends BasePage {

	@FindBy(id = "empPic")
	WebElement empPhoto;

	@FindBy(id = "personal_txtEmpFirstName")
	WebElement firstNameValue;

	@FindBy(id = "personal_txtEmpLastName")
	WebElement lastNameValue;

	public ViewPersonDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyEmployeeDetailsOnPersonalDetailsPage() {
		Assert.assertTrue("Employee photo is not present on personal details page", empPhoto.isDisplayed());
		Assert.assertTrue("First name is not present on personal details page", !firstNameValue.getAttribute("value").isEmpty());
		Assert.assertTrue("last name is not present on personal details page", !lastNameValue.getAttribute("value").isEmpty());
	}

}
