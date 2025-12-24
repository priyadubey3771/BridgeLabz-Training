
import java.util.Scanner;
public class BMICalculator{

    // Method to calculate BMI and Status and return 2D String array
    static String[][] calculateBMI(double[][] data)
    {
        String[][] result=new String[data.length][4];

        for(int i=0;i<data.length;i++)
        {
            double weight= data[i][0];
            double heightCm= data[i][1];
            double heightM= heightCm / 100;
			double bmi= weight/(heightM*heightM);
            String status;
			if(bmi<=18.4)
            {
                status="Underweight";
            }
            else if(bmi<=24.9)
            {
                status="Normal";
            }
            else if(bmi<=39.9)
            {
                status="Overweight";
            }
            else
            {
                status="Obese";
            }
			result[i][0]= String.valueOf(heightCm);
            result[i][1]= String.valueOf(weight);
            result[i][2]= String.format("%.2f", bmi);
            result[i][3]= status;
        }
        return result;
    }
	// Method to display BMI details in tabular format
    static void displayResult(String[][] result)
    {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println(" ");
		for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i][0] + "\t\t" + result[i][1] + "\t\t" +result[i][2] + "\t\t" + result[i][3]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		double[][] data=new double[10][2];
		for(int i=0;i<10;i++)
        {
            System.out.print("Enter weight(kg) of person "+(i+1)+": ");
            data[i][0]= sc.nextDouble();
			System.out.print("Enter height(cm) of person "+(i+1)+": ");
            data[i][1]= sc.nextDouble();
        }
		String[][] bmiResult= calculateBMI(data);
        displayResult(bmiResult);
     }
   }
