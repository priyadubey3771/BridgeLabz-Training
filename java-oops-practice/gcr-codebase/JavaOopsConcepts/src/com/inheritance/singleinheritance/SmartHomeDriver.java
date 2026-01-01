package com.inheritance.singleinheritance;

public class SmartHomeDriver {
  public static void main(String[] args) {

        // device reference pointing to Thermostat object
        Device device = new Thermostat("TH-101", true, 24.5);

        // Display device status
        device.displayStatus();
    }
}

