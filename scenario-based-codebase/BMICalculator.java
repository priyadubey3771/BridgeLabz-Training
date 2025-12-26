
import java.util.Scanner;
public class BMICalculator {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
		System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight /(height * height);

        System.out.println("Your BMI is: " + bmi);
		if(bmi < 18.5) 
		{
            System.out.println("BMI Category: Underweight");
        } 
		else if(bmi >= 18.5 && bmi < 25) 
		{
            System.out.println("BMI Category: Normal");
        } 
		else 
		{
            System.out.println("BMI Category: Overweight");
        }

        sc.close();
     }
   }
