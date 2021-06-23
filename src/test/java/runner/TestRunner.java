package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(
		features= "classpath:features/Login.feature",
		glue = "classpath:stepDefinitions",
		tags="@valid",
		snippets = SnippetType.CAMELCASE
		)
@RunWith(Cucumber.class)
public class TestRunner{

	

}
