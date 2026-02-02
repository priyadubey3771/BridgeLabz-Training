package com.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVDataBeforeProcessing {
  public static void main(String[] args) {

	        String filePath = "users.csv";

	        // Regex patterns
	        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
	        Pattern phonePattern = Pattern.compile("^\\d{10}$");

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
	        {
	        	String line;

	            // Skip header
	            br.readLine();

	            System.out.println("Invalid Records:\n");

	            while ((line = br.readLine()) != null) 
	            {
	            	if (line.trim().isEmpty()) continue;

	                String[] data = line.split(",");

	                String id = data[0];
	                String name = data[1];
	                String email = data[2];
	                String phone = data[3];

	                boolean isEmailValid = emailPattern.matcher(email).matches();
	                boolean isPhoneValid = phonePattern.matcher(phone).matches();

	                if (!isEmailValid || !isPhoneValid) 
	                {
	                    System.out.println("Row: " + line);

	                    if (!isEmailValid) 
	                    {
	                        System.out.println("  -> Invalid Email format");
	                    }
	                    if (!isPhoneValid) 
	                    {
	                        System.out.println("  -> Invalid Phone number");
	                    }

	                    System.out.println("---------------------------");
	                }
	            }

	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


