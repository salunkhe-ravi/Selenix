package stepDefinitions;


import drivers.SharedDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.GoogleHomePO;
import pageObjects.GoogleSearchPO;


public class StepDefinitionTest {

	private GoogleHomePO ghPO;
	private GoogleSearchPO gsPO;
	
	public StepDefinitionTest(SharedDriver driver, GoogleHomePO ghPO, GoogleSearchPO gsPO) {
		this.ghPO = ghPO;
		this.gsPO = gsPO;
	}
	
	@Given("Go to google page")
	public void given() {
		ghPO.get();
	}
	
	@When("Enter search {string}")
	public void when(String search) {
		gsPO = ghPO.performSearch(search);
		System.out.format("\nCount results for %s search is %s.\n", search, gsPO.searchResultCount());
	}
}
