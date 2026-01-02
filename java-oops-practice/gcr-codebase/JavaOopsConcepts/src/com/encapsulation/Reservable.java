package com.encapsulation;

//Interface defining reservation behavior
public interface Reservable {

 void reserveItem(String borrowerName);
 boolean checkAvailability();
 
}
