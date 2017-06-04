package lesson05_01;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MethodDataProviderTest {
	
	@Test(dataProvider = "provideNumbers")
	public void two(int param) {
		System.out.println("Two received: " + param);
	}

	@Test(dataProvider = "provideNumbers")
	public void three(int param) {
		System.out.println("Three received: " + param);
	}
	
	@DataProvider
	public Object[][] provideNumbers(Method method) {
		Object[][] result = null;
		if (method.getName().equals("two")) {
			result = new Object[][] { new Object[] { 2 }};
		} else if (method.getName().equals("three")) {
			result = new Object[][] { new Object[] { 3 }};
		}
		return result;
	}
}
