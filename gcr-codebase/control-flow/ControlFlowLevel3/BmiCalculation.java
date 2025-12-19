
import java.util.Scanner;
public class BmiCalculation {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking weight and height as the input from the user
		 double weight, height,bmi;
		System.out.println("enter the weight in kg:");
		weight = input.nextDouble();
		System.out.println("enter the height in cm:");
		height = input.nextDouble();

        // calculating and displaying the BMI 
        height= height/ 100;
        bmi= weight/ (height*height);
        System.out.println("BMI:"+bmi);

         // checking if the person is underweight, normal, overweight or obese and displaying the result
        if(bmi<=18.4)
			{
			System.out.println("Underweight");
			}
		else if(bmi>=18.5&&bmi<=24.9)
			{
			System.out.println("Normal");
			}
		else if(bmi>=25.0&&bmi<=39.9)
			{
			System.out.println("Overweight");
			}
		else
			{
		System.out.println("Obese");
			}

		input.close();
		}
	}
