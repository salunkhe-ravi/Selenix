package stepDefinitions;




import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import drivers.SharedDriver;

import pageObjects.GoogleHomePO;
import pageObjects.GoogleSearchPO;


public class StepDefinitionTest {

	private GoogleHomePO googleHomePO;
	private GoogleSearchPO googleSearchPO;
	
	
	public StepDefinitionTest(SharedDriver driver, GoogleHomePO ghPO, GoogleSearchPO gsPO) {
		this.googleHomePO = ghPO;
		this.googleSearchPO = gsPO;
	}
	
	@Given("Go to google page")
	public void given() {
		googleHomePO.get();
	}
	
	@When("Enter search {string}")
	public void when(String search) {
		googleSearchPO = googleHomePO.performSearch(search);
		System.out.format("\nCount results for %s search is %s.\n", search, googleSearchPO.searchResultCount());
	}
}
