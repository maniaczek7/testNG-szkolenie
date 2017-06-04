package lesson06;

import java.io.IOException;

import org.testng.annotations.Test;

public class Exception1Test {
	
	    @Test(expectedExceptions = { IOException.class })
	    public void exceptionTest1() throws IOException {
	        throw new IOException();
	    }
	 
	    @Test(expectedExceptions = { IOException.class, NullPointerException.class })
	    public void exceptionTest2() throws RuntimeException {
	        throw new RuntimeException();
	    }
	}