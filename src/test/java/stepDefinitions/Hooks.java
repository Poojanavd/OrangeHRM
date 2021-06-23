package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class Hooks {

	WebDriver driver;
	LoginPage loginPage;

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		loginPage = new LoginPage(driver);
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
