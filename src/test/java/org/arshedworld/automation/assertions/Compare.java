package org.arshedworld.automation.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {

	public static boolean validatePageURL(WebDriver driver, String expecterdURL)

	{
		boolean result = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expecterdURL)) {
			result = true;
		}

		return result;
	}

	public static boolean validateelementbyxpath(WebDriver driver, String xpath)

	{
		boolean result = false;
		try {

			driver.findElement(By.xpath(xpath));
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
