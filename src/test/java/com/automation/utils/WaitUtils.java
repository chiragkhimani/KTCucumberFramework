package com.automation.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	static WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), Duration.ofSeconds(60));

	public static void waitForElementText(WebElement element, String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

}
