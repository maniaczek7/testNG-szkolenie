package lesson05_02;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersCombinedTest {

	@Test(dataProvider = "combined")
	public void testMethod(String string1, String string2) {
			
	}
	
	@DataProvider(name = "shapes")
	public Object[][] getShapesData() throws IOException {
        return new Object[][] { new Object[] { "Shape.Square" }, 
        						new Object[] { "Shape.Circle" }, 
				 				new Object[] { "Shape.Triangle" }};
	}	
	@DataProvider(name = "colors")
	public Object[][] getColorsData() throws IOException {
        return new Object[][] { new Object[] { "Color.Red" },
				        		new Object[] { "Color.Green" },
								new Object[] { "Color.Blue" }};
	}
	
	@DataProvider(name = "combined")
    public Object[][] getObjectCodes() throws IOException{
        return combine(getShapesData(),getColorsData());
    }
	
	
    public static Object[][] combine(Object[][] a1, Object[][] a2){
        List<Object[]> objectCodesList = new LinkedList<Object[]>();
        for(Object[] o1 : a1){
            for(Object[] o2 : a2){
            	objectCodesList.add(concat(o1, o2));
            }
        }
         return objectCodesList.toArray(new Object[0][0]);
    }
    
    public static Object[] concat(Object[] first, Object[] second) {
        Object[] result = ArrayUtils.addAll(first, second);
        return result;
    }
}
