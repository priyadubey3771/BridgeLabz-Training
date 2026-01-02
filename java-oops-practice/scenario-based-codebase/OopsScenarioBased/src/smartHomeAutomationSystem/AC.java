package smartHomeAutomationSystem;

//Inheritance
class AC extends Appliance {

 public AC(int powerUsage) 
 {
     super(powerUsage);
 }

 @Override
 public void turnOn() 
 {
     setState(true);
     System.out.println("AC turned ON. Temperature set to 24°C.");
 }

 @Override
 public void turnOff() 
 {
     setState(false);
     System.out.println("AC turned OFF.");
 }

 @Override
 public void displayInfo() 
 {
     System.out.println("AC | Power Usage: " + getPowerUsage() + "W | Status: " + (isOn() ? "ON" : "OFF"));
 }
}
