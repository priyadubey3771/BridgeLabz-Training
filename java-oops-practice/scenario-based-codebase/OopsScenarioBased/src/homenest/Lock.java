package homenest;

 public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId, 0.5);
    }

    @Override
    public void reset() {
        System.out.println("Resetting Lock: security keys refreshed.");
    }
}
