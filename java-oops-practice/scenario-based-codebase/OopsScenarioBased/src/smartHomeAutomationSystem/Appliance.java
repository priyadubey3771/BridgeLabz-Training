package smartHomeAutomationSystem;

//Abstract class representing appliance
abstract class Appliance implements Controllable {

 // Internal state and power usage are private
 private boolean isOn;
 private int powerUsage; 

 // Constructor with default power
 public Appliance(int powerUsage) 
 {
     this.isOn = false;
     this.powerUsage = powerUsage;
 }

 // Constructor with user-defined power
 public Appliance(boolean state, int powerUsage) 
 {
     this.isOn = state;
     this.powerUsage = powerUsage;
 }

 // Public getter for appliance state
 public boolean isOn() 
 {
     return isOn;
 }

 // Protected setter to allow subclasses to modify state internally
 protected void setState(boolean state) 
 {
     this.isOn = state;
 }

 // Public getter for power usage
 public int getPowerUsage() 
 {
     return powerUsage;
 }

 // Abstract method for displaying appliance info
 public abstract void displayInfo();
}
