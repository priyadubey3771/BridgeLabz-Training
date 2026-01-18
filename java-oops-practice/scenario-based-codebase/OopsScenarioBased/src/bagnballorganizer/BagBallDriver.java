package bagnballorganizer;

import java.util.ArrayList;

public class BagBallDriver {
  public static void main(String[] args) {

        // create bags
        Bag bag1 = new Bag("B1", "Red", 2);
        Bag bag2 = new Bag("B2", "Blue", 3);

        // create balls
        Ball ball1 = new Ball("BL1", "Yellow", "Small");
        Ball ball2 = new Ball("BL2", "Green", "Medium");
        Ball ball3 = new Ball("BL3", "Red", "Large");

        // store bags
        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        // add balls
        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); 
        bag2.addBall(ball3);

        // display balls
        bag1.displayBalls();
        bag2.displayBalls();

        // remove a ball
        bag1.removeBall("BL1");

        // display all bags
        System.out.println("\nAll Bags:");
        for (Bag b : bags) 
        {
            b.displayInfo();
        }
    }
}
