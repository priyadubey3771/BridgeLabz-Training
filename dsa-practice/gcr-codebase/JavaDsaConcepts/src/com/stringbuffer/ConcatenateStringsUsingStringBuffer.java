package com.stringbuffer;

public class ConcatenateStringsUsingStringBuffer {
   public static void main(String[] args) {

	        String[] arr = {"Java", " ", "is", " ", "powerful"};

	        // Creating StringBuffer object
	        StringBuffer sb = new StringBuffer();

	        // Appending each string from the array
	        for (int i = 0; i < arr.length; i++) 
	        {
	            sb.append(arr[i]);
	        }

	        // Converting StringBuffer to String
	        String result = sb.toString();
	        System.out.println("Concatenated String: " + result);
	        
	    }
	}

