package com.constructor.level1;

public class HotelBookingDriver {
	public static void main(String[] args) {

        // Using default constructor
        HotelBooking booking1= new HotelBooking();
        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Priya Dubey","Deluxe",3);
        // Using copy constructor
        HotelBooking booking3= new HotelBooking(booking2);

        System.out.println("Booking 1:");
        System.out.println(booking1.getGuestName() + ", "+ booking1.getRoomType() + ", "+ booking1.getNights());
		System.out.println("\nBooking 2:");
        System.out.println(booking2.getGuestName() + ", "+ booking2.getRoomType() + ", " + booking2.getNights());
		System.out.println("\nBooking 3 :");
        System.out.println(booking3.getGuestName() + ", "+ booking3.getRoomType() + ", "+ booking3.getNights());
     }
  }

