package lesson07;

import org.testng.TestNG;

public class TestNGTestGenerator {
	
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { StudentTest.class });
		testng.setVerbose(1);
		testng.run(); 
	}
}
