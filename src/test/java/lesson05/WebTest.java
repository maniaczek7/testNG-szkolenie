package lesson05;

import org.testng.annotations.Test;

public class WebTest {     
	
	private int numberOfTimes;   
	
	public WebTest(int numberOfTimes) {      
		this.numberOfTimes = numberOfTimes;       
	}    
	
	@Test    
	public void testServer() {       
		System.out.println("Test run: " + numberOfTimes);
	}    
}    