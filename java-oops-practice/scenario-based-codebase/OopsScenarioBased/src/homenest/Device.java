package homenest;

//abstract base class
public abstract class Device implements IControllable {

 protected String deviceId;
 private boolean status;       
 protected double energyUsage;     

 // secure firmware update log
 protected String firmwareLog;

 // constructor
 public Device(String deviceId, double energyUsage) 
 {
     this.deviceId = deviceId;
     this.energyUsage = energyUsage;
     this.status = false;
     this.firmwareLog = "Firmware OK";
 }

 // encapsulated access
 public boolean isOn() 
 {
     return status;
 }

 protected void setStatus(boolean status) 
 {
     this.status = status;
 }

 // energy calculation
 public double calculateEnergy(int hours) 
 {
     return energyUsage * hours;
 }

 // common turn on
 @Override
 public void turnOn() 
 {
     setStatus(true);
     System.out.println(deviceId + " turned ON");
 }

 // common turn off
 @Override
 public void turnOff() 
 {
     setStatus(false);
     System.out.println(deviceId + " turned OFF");
 }

 // abstract method
 @Override
 public abstract void reset();
}
