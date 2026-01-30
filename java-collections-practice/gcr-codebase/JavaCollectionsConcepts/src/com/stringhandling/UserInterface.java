package com.stringhandling;

import java.util.Scanner;
public class UserInterface {
	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the message:");
	String message = sc.nextLine();
	MessageEncoder.encodeMessage(message);
	
	sc.close();
 }
}
