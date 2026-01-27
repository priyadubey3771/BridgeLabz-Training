package com.junit.testing;

public class TestingStringUtilityMethod {

	   public String reverse(String str)
	    {
	        StringBuilder reversed = new StringBuilder();

	        for (int i = str.length() - 1; i >= 0; i--)
	        {
	            reversed.append(str.charAt(i));
	        }

	        return reversed.toString();
	    }

	    public boolean isPalindrome(String str)
	    {
	        return str.equalsIgnoreCase(reverse(str));
	    }

	   public String toUpperCase(String str)
	    {
	        return str.toUpperCase();
	    }
	}


