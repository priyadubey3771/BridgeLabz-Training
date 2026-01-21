package com.flipkeylogicalproblem;

import java.util.Scanner;
public class Driver{
public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the password");
	 String str = sc.next();
	 
	 StringManipulation manipulation = new StringManipulation();
	 String output = manipulation.CleanseAndInvert(str);
	 if(output.isEmpty())
	 {
		  System.out.println("Invalid input");
	 }
	 else
	 {
		 System.out.println("The generated key is - " + output);
	 }
	 sc.close();
  }
 }