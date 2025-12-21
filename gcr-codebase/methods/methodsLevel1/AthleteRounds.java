
import java.util.Scanner;
public class AthleteRounds{

    // find the number of rounds
    double calculateRounds(double side1, double side2,double side3)
    {
        double perimeter= side1 + side2 + side3;
        double distance = 5000;
        return distance / perimeter;
    }

  public static void main(String[] args){
     Scanner input = new Scanner(System.in);

       // taking three sides as input from the user
       System.out.print("Enter first side of the park(in meters): ");
       double side1= input.nextDouble();
	   System.out.print("Enter second side of the park(in meters): ");
       double side2= input.nextDouble();
	   System.out.print("Enter third side of the park (in meters): ");
       double side3= input.nextDouble();

       // calculating the number of rounds
       AthleteRounds numberOfRounds = new AthleteRounds();
       double rounds = numberOfRounds.calculateRounds(side1,side2,side3);

        // displaying the result
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km run");
        input.close();
     }
   }
