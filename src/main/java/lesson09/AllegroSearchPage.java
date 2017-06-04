package lesson09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AllegroSearchPage {
	
    @FindBy(how=How.ID, using="main-search-text")
    private WebElement SearchInput;

    @FindBy(how=How.CSS, using="input[type='submit'][value='Szukaj']")
    private WebElement SearchButton;

	private WebDriver webDriver;
	
	public AllegroSearchPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void search(String searchString){
		WebElementUtils.sendKeys(SearchInput,searchString);
		WebElementUtils.click(SearchButton);
	}
}
