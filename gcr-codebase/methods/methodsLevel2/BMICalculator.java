
import java.util.Scanner;
public class BMICalculator {

    // method to calculate the BMI of each person using their weight and height
    public void calculateBMI(double[][] data) 
	{
        for (int i=0; i<data.length; i++) 
		{
            double weight= data[i][0];
            double heightInMeters= data[i][1] / 100;
            data[i][2]= weight/(heightInMeters*heightInMeters);
        }
    }
        // method to check the status of each person
      public String[] getBMIStatus(double[][] data) 
	  {
            String[] status = new String[data.length];
        for (int i=0; i<data.length; i++) 
		{
            double bmi= data[i][2];

            if (bmi<= 18.4) 
			{
                status[i]="Underweight";
            } 
			else if (bmi>= 18.5 && bmi<= 24.9) 
			{
                status[i]= "Normal";
            } 
			else if (bmi>= 25.0 && bmi<= 39.9) 
			{
                status[i]= "Overweight";
            } 
			else 
			{
                status[i]= "Obese";
            }
        }
        return status;
    }

 public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

        double[][] data= new double[10][3];
		// taking weight and height of each person as input from the user
		for (int i=0; i<10;i++) 
		{
            System.out.print("Enter weight(kg) of person  " + (i+1) + " " );
            data[i][0]=input.nextDouble();
			System.out.print("Enter height(cm) of person  " + (i+1) + " ");
            data[i][1]=input.nextDouble();
        }

       // displaying the weight, height, bmi, status of each person
        BMICalculator bmi =new BMICalculator();
        bmi.calculateBMI(data);
        String[] status =bmi.getBMIStatus(data);
        for (int i=0;i<10;i++)
		{
            System.out.println("\nWeight:" +data[i][0] + "Height:" +data[i][1] + "BMI:" + data[i][2] +"Status:" +status[i]);
        }

        input.close();
     }
   }
