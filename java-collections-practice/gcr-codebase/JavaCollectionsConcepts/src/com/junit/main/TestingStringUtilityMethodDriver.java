package com.junit.main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.testing.*;

	public class TestingStringUtilityMethodDriver {
		
		TestingStringUtilityMethod su = new TestingStringUtilityMethod();

	    @Test
	    void testReverse()
	    {
	        assertEquals("avaJ", su.reverse("Java"));
	    }

	    @Test
	    void testIsPalindromeTrue()
	    {
	        assertTrue(su.isPalindrome("madam"));
	    }

	    @Test
	    void testIsPalindromeFalse()
	    {
	        assertFalse(su.isPalindrome("hello"));
	    }

	    @Test
	    void testToUpperCase()
	    {
	        assertEquals("JAVA", su.toUpperCase("java"));
	    }
	}


