
import java.util.Scanner;
public class BMIArrayProgram {
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);

        //taking the number of persons as input
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

         // initializing the array height, weight, bmi, status
        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        //taking height and weight of the person as input
        for (int i = 0; i< number; i++)
        {
            System.out.println("Person " + (i+1));
			System.out.print("Enter height (in meters): ");
            height[i] = input.nextDouble();
			System.out.print("Enter weight (in kg): ");
            weight[i] = input.nextDouble();

            if (height[i] <= 0 || weight[i] <= 0)
            {
                System.out.println("Invalid input. Enter positive values.");
                i--;
                continue;
            }
        }
         //calculating bmi
        for (int i = 0; i < number; i++)
        {
            bmi[i] = weight[i] / (height[i]*height[i]);
            if (bmi[i]<= 18.4)
			{
                status[i] = "Underweight";
			}
            else if (bmi[i] <= 24.9)
			{
                status[i] = "Normal";
			}
            else if (bmi[i] <= 39.9)
			{
                status[i] = "Overweight";
			}
            else
			{
                status[i] = "Obese";
			}
        }

         // displaying the details of the persons
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++)
        {
            System.out.println("Person " + (i+1) +" Height: " + height[i] +" Weight: " + weight[i] +" BMI: " + bmi[i] +" Status: " + status[i]);
        }
		input.close();
    }
}
