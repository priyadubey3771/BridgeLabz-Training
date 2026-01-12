package com.ambulanceroute;

//Node class representing a hospital unit
class HospitalUnit {

 String name;             // Unit name
 boolean available;       // Availability status
 HospitalUnit next;       // Points to next unit (circular link)

 // Constructor to initialize unit details
 public HospitalUnit(String name, boolean available) {
     this.name = name;
     this.available = available;
     this.next = null;
 }
}
