package homenest;

public class Light extends Device {

    public Light(String deviceId) 
    {
        super(deviceId, 1.5);
    }

    @Override
    public void reset() 
    {
        System.out.println("Resetting Light: brightness restored.");
    }
}
