package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import drivers.DriverFactory;



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

