package lesson05_01;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "range-provider")
	public void testIsBetween(int n, int lower, int upper, boolean expected) {
		System.out.println("Received " + n + " " + lower + "-" + upper + " expected: " + expected);
		Assert.assertEquals(expected, isBetween(n, lower, upper));
	}

	@DataProvider(name = "range-provider")
	public Object[][] rangeData() {
		int lower = 5;
		int upper = 10;
		return new Object[][] { { lower - 1, lower, upper, false },
								{ lower, lower, upper, true },
								{ lower + 1, lower, upper, true },
								{ upper, lower, upper, true },
								{ upper + 1, lower, upper, false }, };
	}
	
	private boolean isBetween(int n, int lower, int upper) {
		if((n <= upper) && (n >= lower)){
			return true;
		} else {
			return false;
		}
	}
}
