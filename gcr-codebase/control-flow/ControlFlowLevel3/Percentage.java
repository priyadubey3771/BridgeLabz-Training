
import java.util.Scanner;
public class Percentage {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        //taking marks of physics, chemistry and maths from the user
        System.out.print("Enter Physics marks:");
        double physics= input.nextDouble();
		System.out.print("Enter Chemistry marks:");
		double chemistry= input.nextDouble();
		System.out.print("Enter Maths marks:");
		double maths= input.nextDouble();

        // calculating total and average marks
		double total = physics+chemistry+maths;
		double percentage = total/3;

         // printing the average marks, grade and remarks
        System.out.println("Average Mark:"+percentage);
        if(percentage>=80)
		{
			System.out.println("Grade: A \n");
			System.out.println("Remarks: Level 4, above agency-normalized standards");
		}
		else if(percentage>=70&&percentage<=79)
		{
			System.out.println("Grade: B \n");
			System.out.println("Remarks: Level 3, at agency-normalized standards");
		}
		else if(percentage>=60&&percentage<=69)
		{
			System.out.println("Grade: C \n");
			System.out.println("Remarks: Level 2, below but approaching agency-normalized standards");
		}
		else if(percentage>=50&&percentage<=59)
		{
			System.out.println("Grade: D \n");
			System.out.println("Remarks: Level 1, well below agency-normalized standards");
		}
		else if(percentage>=40&&percentage<=49)
		{
			System.out.println("Grade: E \n");
			System.out.println("Remarks: Level 1, too below agency-normalized standards");
		}
		else
		{
			System.out.println("Grade: R \n");
			System.out.println("Remarks: Remedial standards");
		}

		input.close();
		}
	}
