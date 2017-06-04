package lesson05_02;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersMultipleTest {
	
	@Test(dataProvider = "createData", priority = 1)
	public void verifyData1(String n1, Integer n2) {
		System.out.println(n1 + " " + n2);
	} 
	
	@Test(dataProvider = "shapes", priority = 2)
	public void testMethod(String string1) {
		System.out.println(string1);
	}
	
	@DataProvider
	public Object[][] createData() {
		return new Object[][] {
			{ "Cedric", new Integer(36)},
			{ "Anne", new Integer(37)}};
	}
	 
	@DataProvider(name = "shapes")
	public Object[][] getShapesData() throws IOException {
        return new Object[][] { 
			{ "Shape.Square" }, 
			{ "Shape.Circle" }, 
			{ "Shape.Triangle" }};
	}
}