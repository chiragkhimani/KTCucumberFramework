package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.PropertyReader;

public class AddEmployeePage extends BasePage {

	@FindBy(id = "firstName")
	WebElement firstNameInput;

	@FindBy(id = "lastName")
	WebElement lastNameInput;

	@FindBy(id = "btnSave")
	WebElement saveBtn;

	@FindBy(xpath = "//span[@class='validation-error' and @for='firstName']")
	WebElement validationErrorMissingFirstName;

	public AddEmployeePage() {
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName() {
		firstNameInput.sendKeys(PropertyReader.getProperty("first.name"));
	}

	public void enterLastName() {
		lastNameInput.sendKeys(PropertyReader.getProperty("last.name"));
	}

	public void clickOnSaveBtn() {
		saveBtn.click();
	}

	public void verifyErrorForMissingFirstNameValue() {
		Assert.assertTrue("Firstname missing validation error is not displayed",
				validationErrorMissingFirstName.isDisplayed());

	}

}
