package com.junit.main;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.testing.TestingParameterizedTest;

public class TestingParameterizedTestDriver {
	
		TestingParameterizedTest ec = new TestingParameterizedTest();

	    @ParameterizedTest
	    @ValueSource(ints = {2, 4, 6})
	    void testEvenNumbers(int number)
	    {
	        assertTrue(ec.isEven(number));
	    }

	    @ParameterizedTest
	    @ValueSource(ints = {7, 9})
	    void testOddNumbers(int number)
	    {
	        assertFalse(ec.isEven(number));
	    }
	}


