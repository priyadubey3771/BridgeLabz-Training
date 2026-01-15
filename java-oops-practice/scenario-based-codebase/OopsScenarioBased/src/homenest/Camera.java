package homenest;

public class Camera extends Device {

    public Camera(String deviceId) 
    {
        super(deviceId, 3.0);
    }

    @Override
    public void reset() 
    {
        System.out.println("Resetting Camera: rebooting lens and storage.");
    }
}
