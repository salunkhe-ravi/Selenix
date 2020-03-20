package runners;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "src/test/resources/features", 
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue = {"stepDefinitions"}
		//		tags = tagsList
		)
public class MainRunnerTest extends AbstractTestNGCucumberParallelTests {

//	com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

}
