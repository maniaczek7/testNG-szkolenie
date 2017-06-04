package lesson05;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

public class WebTestFactory {
	
	@Parameters("times")
	@BeforeTest
	public void beforeWebTest(int times){
		System.out.println("BeforeTest - times value (" + times + ")");
	}
	
	
	@Parameters("times")
	@Factory
	public Object[] createInstances(int times) {      
		Object[] result = new Object[times];       
		for (int i = 0; i < times; i++) {      
			result[i] = new WebTest(i);      
		}      
		return result;     
	}
}