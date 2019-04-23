package org.arshedworld.automation.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	ResourceBundle element;
	WebDriver driver;

	public Loginpage(WebDriver driver)

	{
		this.driver = driver;
		element = ResourceBundle.getBundle("element");
	}

	public void enterusername(String uname)

	{
		driver.findElement(By.id(element.getString("login_username_id"))).sendKeys(uname);
	}

	public void enterpassword(String pass)

	{
		driver.findElement(By.id(element.getString("login_password_id"))).sendKeys(pass);
	}

	public void clicksignin()

	{
		driver.findElement(By.xpath(element.getString("login_signin.xpath"))).click();
	}
}
