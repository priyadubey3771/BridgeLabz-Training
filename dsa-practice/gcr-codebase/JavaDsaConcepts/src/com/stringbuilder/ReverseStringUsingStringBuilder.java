package com.stringbuilder;

public class ReverseStringUsingStringBuilder {
   public static void main(String[] args) {

	        String input = "hello";
	        StringBuilder sb = new StringBuilder();

	        //Appending the string
	        sb.append(input);

	        //Reversing the string
	        sb.reverse();

	        //Converting back to String
	        String reversedString = sb.toString();

	        // Displaying output
	        System.out.println("Reversed string: " + reversedString);
	    }
	}



