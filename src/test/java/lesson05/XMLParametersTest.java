package lesson05;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLParametersTest {
	
	@BeforeMethod
	public void putLineBreak(){
		System.out.print("\n");
	}
	
	//DEPRECATED!	
	@Test(parameters = "domain")
	public void testMethodSingle(String string_jakakolwiek_nazwa) {
		System.out.println("Domain param: " + string_jakakolwiek_nazwa);
	}

	@Test
	@Parameters({"site", "title"})
	public void testMethodMultipe(String site, String title){
		System.out.println("Site param: " + site);
		System.out.println("Title param: " + title);
		// site will has value " /application”
		// title will has value " Welcome!”
	}

	@Test
	@Parameters({"siteShort", "title"})
	public void testMethodMultipeOptional(@Optional("/test") String siteShort, String title){
		System.out.println("SiteShort param: " + siteShort);
		System.out.println("Title param: " + title);
		// siteString will has value /application, if no parameter found "/test" will be used
		// titleString will has value Welcome!
	}

}
