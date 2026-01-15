package homenest;

public class HomenestDriver {
  public static void main(String[] args) {

        Device[] devices = { new Light("LIGHT-01"), new Camera("CAM-02"), new Thermostat("THERMO-03"), new Lock("LOCK-04")};

        for (Device d : devices) 
        {
            d.turnOn();
            System.out.println("Energy for 5 hours: " + d.calculateEnergy(5) + " units");
            d.reset();   
            d.turnOff();
            System.out.println(" ");
        }
    }
}
