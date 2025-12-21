
import java.util.Scanner;
public class SimpleInterestCalculation{

    // find the simple interest by making method
   double calculateSimpleInterest(double principal, double rate, double time)
    {
        return (principal* rate*time)/100;
    }

 public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	    // taking principal, rate and time as input from the user
	    System.out.print("Enter Principal: ");
        double principal= input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate= input.nextDouble();
		System.out.print("Enter Time: ");
        double time= input.nextDouble();

        // calculating simple interest
        SimpleInterestCalculation simpleInt = new SimpleInterestCalculation();
        double simpleInterest = simpleInt.calculateSimpleInterest(principal,rate,time);
         
		// displaying the result
        System.out.println("The Simple Interest is " +simpleInterest+ " for Principal " + principal + ", Rate of Interest " + rate +" and Time " + time);
		input.close();
     }
   }

