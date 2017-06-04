package lesson03;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
  @Test(groups = {"smoke", "aut"})
  public void test1() {
	  System.out.println("@Test1 smoke, aut");
  }
  
  @Test(groups = "smoke")
  public void test2() {
	  System.out.println("@Test2 smoke");
  }

  @Test(groups = "test")
  public void test3() {
	  System.out.println("@Test3 test");
  }

  @Test(groups = "aut")
  public void test4() {
	  System.out.println("@Test4 aut");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest\n");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }

  @BeforeGroups({"test","smoke"})
  public void beforeGroups() {
	  System.out.println("@BeforeGroups before smoke, test, aut");
  }

  @AfterGroups("smoke")
  public void afterGroups() {
	  System.out.println("@AfterGroups after smoke");
  }
  
}
