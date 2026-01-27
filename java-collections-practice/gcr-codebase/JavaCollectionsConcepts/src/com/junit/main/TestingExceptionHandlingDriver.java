package com.junit.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.testing.TestingExceptionHandling;

public class TestingExceptionHandlingDriver
{
	TestingExceptionHandling d = new TestingExceptionHandling();

    @Test
    void testDivideNormal()
    {
        assertEquals(5, d.divide(10, 2));
    }

    @Test
    void testDivideByZeroException()
    {
        Exception exception = assertThrows(ArithmeticException.class,
                () -> d.divide(10, 0));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
