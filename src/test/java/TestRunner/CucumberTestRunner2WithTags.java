package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@smoke and @regression",
		features = {"src/test/resources/FeatureWithTags"},
		glue = {"StepDefinitions"},
		plugin = {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunner2WithTags extends AbstractTestNGCucumberTests{

}
