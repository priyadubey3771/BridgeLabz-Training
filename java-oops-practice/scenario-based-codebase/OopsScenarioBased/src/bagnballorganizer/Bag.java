package bagnballorganizer;

import java.util.ArrayList;
public class Bag implements Storable {

    private String bagId;
    private String color;
    private int capacity;

    // composition- bag HAS balls
    private ArrayList<Ball> balls = new ArrayList<>();

    // constructor
    public Bag(String bagId, String color, int capacity) 
    {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
    }

    // add ball to bag
    public void addBall(Ball ball) 
    {
        if (balls.size() < capacity) 
        {
            balls.add(ball);
            System.out.println("Ball added to bag " + bagId);
        }
        else 
        {
            System.out.println("Bag " + bagId + " is full! Cannot add ball.");
        }
    }

    // remove ball by ID
    public void removeBall(String ballId) 
    {
        for (Ball b : balls) 
        {
            if (b.getBallId().equals(ballId)) 
            {
                balls.remove(b);
                System.out.println("Ball removed from bag " + bagId);
                return;
            }
        }
        System.out.println("Ball not found in bag.");
    }

    // display all balls in bag
    public void displayBalls() 
    {
        System.out.println("\nBalls in Bag " + bagId + ":");
        if (balls.isEmpty()) 
        {
            System.out.println("No balls in this bag.");
        }
        for (Ball b : balls) 
        {
            b.displayInfo();
        }
    }

    // Display bag info
    @Override
    public void displayInfo() 
    {
        System.out.println("Bag ID: " + bagId +  ", Color: " + color + ", Balls: " + balls.size() + "/" + capacity);
    }
}
