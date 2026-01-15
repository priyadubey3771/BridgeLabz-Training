package homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) 
    {
        super(deviceId, 2.5);
    }

    @Override
    public void reset() 
    {
        System.out.println("Resetting Thermostat: temperature calibrated.");
    }
}
