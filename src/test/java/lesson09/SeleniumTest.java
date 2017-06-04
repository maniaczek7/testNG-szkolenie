package lesson09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

public class SeleniumTest {
	protected static WebDriver webDriver;
	
	protected static final Logger LOGGER = Logger.getLogger(SeleniumTest.class);
	
	private static final String url = "http://www.allegro.pl";
	
	@BeforeTest
	public void setupBrowserAndLogIntoApplication(ITestContext context){
		webDriver = new FirefoxDriver();
		LOGGER.info("Browser created");
		webDriver.get(url);
		LOGGER.info("Page: " + url + " has been opened");
		context.setAttribute("webDriver", webDriver);
	}
	
	@AfterTest
	public void exitBrowser(){
		webDriver.quit();
		LOGGER.info("Browser closed");
	}
	
	@BeforeClass
	public void configureTestClass(ITestContext context){
		webDriver = (WebDriver) context.getAttribute("webDriver");
		Reporter.log("reporter log",5,true);
	}
}
