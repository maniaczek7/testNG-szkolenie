package lesson05;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTestParameters {
	
	@Parameters({"number-of-times"})
	@Test
	public void accessPage(int numberOfTimes) {
		int i = 0;
		while (numberOfTimes-- > 0) {
			System.out.println("Web access: " + i++);
		}
	}
} 
   