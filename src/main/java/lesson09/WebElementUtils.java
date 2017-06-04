package lesson09;

import org.openqa.selenium.WebElement;

public class WebElementUtils {

	public static void sendKeys(WebElement webElement, String string) {
		webElement.sendKeys(string);
	}

	public static void click(WebElement webElement) {
		webElement.click();
	}
}
