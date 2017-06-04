package lesson05_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContextDataProviderTest {
	
	@Test(dataProvider = "range-provider")
	public void testIsBetween(int n, int lower, int upper, boolean expected) {
		System.out.println("Received " + n + " " + lower + "-" + upper + " expected: " + expected);
		Assert.assertEquals(expected, isBetween(n, lower, upper));
	}

	@DataProvider(name = "range-provider")
	public Iterator<Object[]> remoteServiceDataProvider()
	{
		int lower = 5;
		int upper = 10;
	    Collection<Object[]> dp = new ArrayList<Object[]>();  
		dp.add(new Object[] { lower - 1, lower, upper, false });
		dp.add(new Object[] { lower, lower, upper, true });
		dp.add(new Object[] { lower + 1, lower, upper, true });
		dp.add(new Object[] { upper, lower, upper, true });
		dp.add(new Object[] { upper + 1, lower, upper, false });
	    return dp.iterator();
	}
	
	
	private boolean isBetween(int n, int lower, int upper) {
		if((n <= upper) && (n >= lower)){
			return true;
		} else {
			return false;
		}
	}
}
