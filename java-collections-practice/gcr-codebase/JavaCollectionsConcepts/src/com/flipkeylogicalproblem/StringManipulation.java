package com.flipkeylogicalproblem;

public class StringManipulation{

	  public String CleanseAndInvert(String input)
	  {
	      String text = " ";
	     if(input == null || input.length() < 6)
		 {
			 return "";
	     }
		 
		 char[] arr = input.toCharArray();
		 for(char ch : arr)
		 {
		    if(ch==32 ||  (ch>=48 && ch<=57) || (ch>=33 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126))
			{
			  return "";
			}
	     }
		 
		 String lower = input.toLowerCase();
		 char[] array = lower.toCharArray();
		 for(char ch : array)
		 {
		      if(ch% 2 !=0)
			  {
			     text = text + ch;
			  }
	     }
		 
		 String reversed = new StringBuilder(text).reverse().toString();
		 char[] arrayNew = reversed.toCharArray();
		 for(int i=0; i< arrayNew.length; i++)
		 {
		    if(i%2==0)
			{
			   arrayNew[i] = Character.toUpperCase(arrayNew[i]);
			}
		 }
		 String word = new String(arrayNew);
		 return word;
		 
   }
}