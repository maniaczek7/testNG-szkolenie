package lesson09;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllegroTest extends SeleniumTest {
	
	@Parameters({"parameter_name"})
	@Test
	public void shouldSuccesfullyLogin(@Optional("optional") String testparam){
		System.out.println(testparam);
		AllegroSearchPage allegroSearchPage = new AllegroSearchPage(webDriver);
		AllegroResultsPage allegroResultsPage = new AllegroResultsPage(webDriver);
		allegroSearchPage.search("lufthansa");
		Assert.assertEquals(allegroResultsPage.searchPhraseTextExist(), false);	// true, because it is displayed.
		Reporter.log("testing reporter");
	}
}
