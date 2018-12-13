package edu.njtu.saasgateway;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/features/user.feature", plugin = {"pretty", "html:target/cucumber"})
public class UserCucumberIntegrationTest {
	public static void main(String[] args) {
		
	}
}
