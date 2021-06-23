package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Dashboard;

public class Login {

	WebDriver driver;
	Dashboard dashboard;

	
	@Given("^user enters valid (.+) and (.+)$")
	public void userEntersValidAnd(String username, String password)  {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@Then("^Dashboard page is been displayed$")
	public void dashboardPageIsBeenDisplayed()  {
		dashboard = new Dashboard(driver);
		dashboard.validateDashboardURL();
		driver.close();
	}

	@And("^clicks on Login button$")
	public void clicksOnLoginButton()  {
		driver.findElement(By.id("btnLogin")).click();
	}
}
