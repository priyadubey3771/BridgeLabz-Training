package com.functionalinterfaces.smartdevicecontrolinterface;

public class TV implements SmartDevice {

    @Override
    public void turnOn() 
    {
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() 
    {
        System.out.println("TV is now OFF");
    }
}
