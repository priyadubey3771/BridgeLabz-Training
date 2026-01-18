package bagnballorganizer;

public class Ball implements Storable {

    // encapsulated fields
    private String ballId;
    private String color;
    private String size; 

    // constructor
    public Ball(String ballId, String color, String size) 
    {
        this.ballId = ballId;
        this.color = color;
        this.size = size;
    }

    // getter
    public String getBallId() 
    {
        return ballId;
    }

    // display ball info
    @Override
    public void displayInfo() 
    {
        System.out.println("Ball ID: " + ballId + ", Color: " + color + ", Size: " + size);
    }
}
