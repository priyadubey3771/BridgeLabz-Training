package com.stringhandling;

public class MessageEncoder {

 public static void encodeMessage(String message) {
	 
	 if(message.length()<=4)
	 {
		 System.out.println("The string " + message + " has minimum length");
		 return;
	 }
	if(message.contains(" "))
	{
		 System.out.println("The string" + message + "should not contain space");
		 return;
	}
	
	int length = message.length();
	String encoded = "";
	
	for(int i=0; i<length; i++)
	{
		char ch = message.charAt(i);
		int ascii = (int) ch;
		int newAscii = ascii-length;
		encoded = encoded + ((char) newAscii);
	}
	
	System.out.println("Encoded Message:" + encoded);
	
 }
}


