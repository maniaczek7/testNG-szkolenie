package lesson06;

import java.io.IOException;

import org.testng.annotations.Test;

public class Exception2MessageTest {
	
    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTest1() throws IOException {
        throw new IOException("Pass Message test");
    }
 
    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* Message .*")
    public void exceptionTest2() throws IOException {
        throw new IOException("Pass Message test");
    }
 
    @Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTest3() throws IOException {
        throw new IOException("Fail Message test");
    }
}