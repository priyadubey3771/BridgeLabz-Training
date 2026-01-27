package com.junit.main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.testing.*;

public class CalculatorTest
{
    Calculator calc = new Calculator();

    @Test
    void testAdd()
    {
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    void testSubtract()
    {
        assertEquals(4, calc.subtract(7, 3));
    }

    @Test
    void testMultiply()
    {
        assertEquals(21, calc.multiply(7, 3));
    }

    @Test
    void testDivide()
    {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivideByZero()
    {
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(6, 0));
        assertEquals("Division by zero", exception.getMessage());
    }
}
