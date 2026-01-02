package smartHomeAutomationSystem;

//Inheritance
class Light extends Appliance {

 public Light(int powerUsage) 
 {
     super(powerUsage);
 }

 // turnon behaves differently for Light
 @Override
 public void turnOn() 
 {
     setState(true);
     System.out.println("Light turned ON. Brightness is full.");
 }

 @Override
 public void turnOff() 
 {
     setState(false);
     System.out.println("Light turned OFF.");
 }

 @Override
 public void displayInfo()
 {
     System.out.println("Light | Power Usage: " + getPowerUsage() + "W | Status: " + (isOn() ? "ON" : "OFF"));
 }
}
