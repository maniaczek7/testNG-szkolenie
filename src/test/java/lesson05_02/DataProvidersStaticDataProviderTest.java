package lesson05_02;

import lesson05_02.DataProvidersStaticProvider;

import org.testng.annotations.Test;

public class DataProvidersStaticDataProviderTest {
	
	@Test(dataProvider = "create", dataProviderClass = DataProvidersStaticProvider.class)
	public void test(Integer n) {
		System.out.println("FromStaticDataProvider: " + n);
	}
}
