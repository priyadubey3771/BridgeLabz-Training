package smartHomeAutomationSystem;

class Fan extends Appliance {

 public Fan(int powerUsage) 
 {
     super(powerUsage);
 }

 @Override
 public void turnOn() 
 {
     setState(true);
     System.out.println("Fan turned ON. Speed set to medium.");
 }

 @Override
 public void turnOff() 
 {
     setState(false);
     System.out.println("Fan turned OFF.");
 }

 @Override
 public void displayInfo() 
 {
     System.out.println("Fan | Power Usage: " + getPowerUsage() + "W | Status: " + (isOn() ? "ON" : "OFF"));
 }
}
