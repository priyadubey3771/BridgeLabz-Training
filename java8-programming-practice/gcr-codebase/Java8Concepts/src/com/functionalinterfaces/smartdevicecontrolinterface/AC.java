package com.functionalinterfaces.smartdevicecontrolinterface;

public class AC implements SmartDevice {

    @Override
    public void turnOn() 
    {
        System.out.println("AC is cooling now");
    }

    @Override
    public void turnOff() 
    {
        System.out.println("AC is turned OFF");
    }
}
