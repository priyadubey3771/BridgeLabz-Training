package com.streamapi.eventattendeewelcomemessage;

import java.util.*;
import java.util.stream.*;

public class EventAttendeeWelcomeMessage {
  public static void main(String[] args) {

	        List<String> attendees = Arrays.asList("Amit","Priya","Rahul","Sneha","Karan");

	        System.out.println("Welcome Messages:");

	        attendees.stream().forEach(name ->System.out.println("Welcome to the event, " + name + "!"));
	    }
	}


