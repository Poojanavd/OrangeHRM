package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Dashboard {

	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	public void validateDashboardURL() {
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
	}

}
