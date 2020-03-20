package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import drivers.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;



public class Hooks {


	@Before
	public void setUp(){	

		System.out.println("*************this is before*************");
	}

	@After
	public void tearDown(){

		System.out.println("*************this is after*************");

	}


	@AfterStep(value = "@smoke")
	public void afterSite(Scenario scenario) {
		System.out.println("AFTER SITE");
		
		try {
			
			if(scenario.isFailed()) {
				scenario.write("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) DriverFactory.getDriver();
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				
				scenario.embed(screenshot, "image/png");
			}
		}
		catch(Exception e) {

			e.printStackTrace();
		}			
	}

}

