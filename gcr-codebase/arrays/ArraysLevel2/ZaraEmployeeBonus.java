
import java.util.Scanner;
public class ZaraEmployeeBonus {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		double[] salary= new double[10];
		double[] yearsOfService= new double[10];
		double[] bonus= new double[10];
		double[] newSalary= new double[10];
        double totalBonus= 0.0;
		double totalOldSalary= 0.0;
		double totalNewSalary= 0.0;

        //Taking the salary and years of service of 10 employees as the input from the user
		System.out.println("Enter salary and years of service for 10 employees:");
        for(int i=0; i<10; i++)
		{
			System.out.print("Employee " +(i+1)+ " Salary: ");
			double sal= input.nextDouble();

			System.out.print("Employee " +(i+1)+ " Years of Service: ");
			double years= input.nextDouble();

			//checking if the input is invalid
			if(sal<=0 || years<0)
			{
				System.out.println("Invalid input.Please enter again.");
				i--;
				continue;
			}
			salary[i]= sal;
			yearsOfService[i]= years;
		}

        // calculating the new salary, total bonus, total old salary and new salary
		for(int i=0; i<10; i++)
		{
			if(yearsOfService[i] >5)
			{
				bonus[i]= salary[i] * 0.05;
			}
			else
			{
				bonus[i]=salary[i]* 0.02;
			}

			newSalary[i]= salary[i]+ bonus[i];
            totalBonus= totalBonus+ bonus[i];
			totalOldSalary= totalOldSalary+ salary[i];
			totalNewSalary= totalNewSalary+ newSalary[i];
		}
         // displaying the output
		System.out.println("\nTotal old salary of all employees: " + totalOldSalary);
		System.out.println("Total bonus payout by Zara: "+ totalBonus);
		System.out.println("Total new salary of all employees: "+ totalNewSalary);

		input.close();
		}
	}