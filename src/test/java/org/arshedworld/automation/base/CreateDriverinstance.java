package org.arshedworld.automation.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateDriverinstance {

	public WebDriver generateDriverInstance()

	{
		WebDriver driver;
		ResourceBundle config = ResourceBundle.getBundle("config");
		if (config.getString("browser").equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (config.getString("browser").equalsIgnoreCase("firefox"))

		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get(config.getString("applicationUrl"));
		return driver;

	}

	public void closeDriver(WebDriver driver)

	{
		driver.quit();
	}

}
