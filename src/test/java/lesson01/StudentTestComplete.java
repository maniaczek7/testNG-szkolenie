package lesson01;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StudentTestComplete {
	
	private Student student;
	
	@BeforeTest
	public void fillStudentWithValues(){
		student = new Student();
		student.setAge(15);
		student.setName("Radek");
		student.setSurname("test");
	}
	
	@Test
	public void testGetAge() {
		Assert.assertEquals(student.getAge(), 15);
	}
	
	@Test
	public void testGetName() {
		Assert.assertEquals(student.getName(), "radek");	  
	}
	
	@Test
	public void testGetSurname() {
		Assert.assertEquals(student.getSurname(), "test");
	}
}
