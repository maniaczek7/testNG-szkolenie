package lesson07;

import lesson01.Student;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

public class StudentTest {
	
	private Student student;
	private SoftAssert softAssert = new SoftAssert();;
	
  @BeforeTest
  public void fillStudentWithValues(){
	student = new Student();
	student.setAge(15);
	student.setName("Radek");
	student.setSurname("test");
  }

  @Test
  public void getAge() {
    Assert.assertEquals(student.getAge(), 15);
  }

  @Test
  public void getName() {
	  Assert.assertEquals(student.getName(), "radek");	  
  }

  @Test
  public void getSurname() {
	Assert.assertEquals(student.getSurname(), "test");
  }
  
  @Test
  public void getAgeSoftAssert() {
    softAssert.assertEquals(student.getAge(), 15, "Age error");
    softAssert.assertEquals(student.getName(), "radek", "Name error");	  
    softAssert.assertEquals(student.getSurname(), "test", "Surname error");
    softAssert.assertAll();
  }
  
  
  
  
  
}
