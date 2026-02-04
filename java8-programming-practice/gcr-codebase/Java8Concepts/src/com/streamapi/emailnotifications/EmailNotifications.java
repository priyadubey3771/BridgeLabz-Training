package com.streamapi.emailnotifications;

import java.util.*;

public class EmailNotifications {
   public static void main(String[] args) {

	    List<String> emails = Arrays.asList("amit@gmail.com","priya@gmail.com","rahul@gmail.com","sneha@gmail.com");
	
	    // Using forEach to send notifications
	    emails.forEach(email -> sendEmailNotification(email));
}

	    // method to send email
	    public static void sendEmailNotification(String email) 
	    {
	        System.out.println("Notification email sent to: " + email);
	    }
}


