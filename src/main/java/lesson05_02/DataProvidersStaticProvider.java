package lesson05_02;

import org.testng.annotations.DataProvider;

public class DataProvidersStaticProvider {
	
	@DataProvider(name = "create")
	public static Object[][] createData() {
		return new Object[][] {
		new Object[] { new Integer(42) } };
	}
}