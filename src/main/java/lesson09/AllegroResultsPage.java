package lesson09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AllegroResultsPage {
	
	WebDriver webDriver;
	
	@FindBy(how = How.CSS, using = ".search-phrase" )
	private WebElement searchPhraseText;
	
	public AllegroResultsPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	public boolean searchPhraseTextExist(){
		if (searchPhraseText.isDisplayed()){
			return true;
		} else {
			return false;
		}
	}
}
