package com.stringbuilder;

import java.util.HashSet;
public class RemoveDuplicatesFromStringUsingStringBuilder {
   public static void main(String[] args) {

	    String input = "programming";

	   // StringBuilder to build result
	      StringBuilder result = new StringBuilder();

	   // HashSet to track already seen characters
	      HashSet<Character> seen = new HashSet<>();

	  // Traversing each character
	     for (int i = 0; i < input.length(); i++) 
	     {
	         char ch = input.charAt(i);
	         // If character not seen before
	            if (!seen.contains(ch)) 
	            {
	                seen.add(ch);       
	                result.append(ch);
	            }
	     }
	     
	   // Converting StringBuilder to String
	      System.out.println("Output: " + result.toString());
	      
	    }
	}

