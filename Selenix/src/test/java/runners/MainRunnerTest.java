package runners;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "src/test/resources/features", 
		plugin = {"pretty", "html:target/cucumber-html-report"},
		glue = {"stepDefinitions"},
		tags = "@regression"
		)
public class MainRunnerTest extends AbstractTestNGCucumberParallelTests {}
