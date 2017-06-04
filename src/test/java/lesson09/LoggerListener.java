package lesson09;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class LoggerListener extends TestListenerAdapter {
		 
	  @Override
	  public void onTestFailure(ITestResult testResult) {
	    print("F A I L E D !\n");
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult testResult) {
	    print("S K I P P E D !\n");
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult testResult) {
	    print("S U C C E S S !\n");
	  }
	 
	  private void print(String string) {
		  System.out.print(string);
	  }
}
