package stepDefinitions;


import drivers.SharedDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.GoogleHomePO;
import pageObjects.GoogleSearchPO;


public class StepDefinitionTest2 {

	private GoogleHomePO googleHomePO;
	private GoogleSearchPO googleSearchPO;
	
	
	public StepDefinitionTest2(SharedDriver driver, GoogleHomePO ghPO, GoogleSearchPO gsPO) {
		this.googleHomePO = ghPO;
		this.googleSearchPO = gsPO;
	}
	
	@Given("Go to google page1")
	public void given() {
		googleHomePO.get();
	}
	
	@When("Enter search1 {string}")
	public void when(String search) {
		googleSearchPO = googleHomePO.performSearch(search);
		System.out.format("\nCount results for %s search is %s.\n", search, googleSearchPO.searchResultCount());
	}
}
