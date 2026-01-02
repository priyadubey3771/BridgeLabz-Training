package smartHomeAutomationSystem;

public class SmartHomeApp {
   public static void main(String[] args) {

        // Creating appliances with custom power
        Appliance light = new Light(60);
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        // User controller
        UserController controller = new UserController();

       // Turning on appliances
       light.turnOn();
        fan.turnOn();
        ac.turnOn();
        System.out.println();

       // Display appliance status
       light.displayInfo();
        fan.displayInfo();
        ac.displayInfo();
        System.out.println();

       // Compare energy usage
        controller.compareEnergy(light, fan);
        controller.compareEnergy(fan, ac);
        controller.compareEnergy(light, ac);

        System.out.println();

        // Turning off appliances
        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }
}
