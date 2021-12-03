package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

public class SaveUserDetailsPage {
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id = "systemUser_userName")
	WebElement userName;
	
	@FindBy(id = "systemUser_password")
	WebElement password;
	
	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmPassword;

	public void verifySaveUserDetailsPage() {
		Assert.assertTrue("Employee name is missing from save user details page", employeeName.isDisplayed());
		Assert.assertTrue("username is missing from save user details page", userName.isDisplayed());
	}

	public void fillAllUserDetails() {
		employeeName.sendKeys("Alice Duval");
		userName.sendKeys(PropertyReader.getProperty("new.user.name"));
		password.sendKeys("Test@123");
		confirmPassword.sendKeys("Test@123");
	}

}
