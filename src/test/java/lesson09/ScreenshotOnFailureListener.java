package lesson09;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotOnFailureListener implements ITestListener {

	WebDriver webDriver;

	public void onTestFailure(ITestResult result) {
		ITestContext context = result.getTestContext();
		webDriver = (WebDriver) context.getAttribute("webDriver");
		takeScreenShot();
	}

	public void takeScreenShot() {
		File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("screenShotOnFailureListener.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
	}

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}
}