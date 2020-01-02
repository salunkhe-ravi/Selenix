package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import drivers.DriverFactory;

public class GoogleSearchPO extends LoadableComponent<GoogleSearchPO>{


	@FindBy(css = "div[id='resultStats']")
	private WebElement searchResult;

	public GoogleSearchPO() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}

	public String searchResultCount() {
		return searchResult.getText();
	}

	@Override
	protected void load() {
	}

	@Override
	protected void isLoaded() throws Error {

	}
}
