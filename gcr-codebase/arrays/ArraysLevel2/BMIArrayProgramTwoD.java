
import java.util.Scanner;
public class BMIArrayProgramTwoD {
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);
       
	   // taking number of persons as input
		System.out.print("Enter number of persons: ");
        int number = input.nextInt();
		double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        //taking height and weight of the persons as input
        for (int i = 0; i < number; i++)
        {
            System.out.println("Person " + (i+1));
			System.out.print("Enter height (in meters): ");
            double height = input.nextDouble();
			System.out.print("Enter weight(in kg): ");
            double weight = input.nextDouble();

				if (height<= 0 || weight<= 0)
				{
					System.out.println("Invalid input. Enter positive values.");
					i--;
					continue;
				}
            personData[i][0] = height;
            personData[i][1]= weight;
        }

        //calculating bmi and checking the status of the person
        for (int i = 0; i < number; i++)
        {
            double height = personData[i][0];
            double weight = personData[i][1];
			double bmi = weight / (height * height);
            personData[i][2] = bmi;
			if (bmi <= 18.4)
			{
                weightStatus[i] = "Underweight";
			}
            else if (bmi <= 24.9)
			{
                weightStatus[i] = "Normal";
			}
            else if (bmi <= 39.9)
			{
                weightStatus[i] = "Overweight";
			}
            else
			{
                weightStatus[i] = "Obese";
			}
        }
		
         //displaying the person details
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++)
        {
            System.out.println("Person " + (i + 1) +" Height: " + personData[i][0] +" Weight: " + personData[i][1] +" BMI: " + 
				personData[i][2] +" Status: " + weightStatus[i]);
        }

        input.close();
    }
}
