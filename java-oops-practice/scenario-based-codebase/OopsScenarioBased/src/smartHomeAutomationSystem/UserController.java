package smartHomeAutomationSystem;

//Controls multiple appliances
class UserController {

 // Compare power usage between two appliances
 public void compareEnergy(Appliance a1, Appliance a2) 
 {
     System.out.println("Comparing power usage:");
     if (a1.getPowerUsage() > a2.getPowerUsage()) 
     {
         System.out.println(a1.getClass().getSimpleName() + " uses more power than " + a2.getClass().getSimpleName());
     } 
     else if (a1.getPowerUsage() < a2.getPowerUsage()) 
     {
         System.out.println(a2.getClass().getSimpleName() + " uses more power than " + a1.getClass().getSimpleName());
     }
     else 
     {
         System.out.println("Both appliances use the same power.");
     }
 }
}
