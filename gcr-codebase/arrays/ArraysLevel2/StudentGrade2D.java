
import java.util.Scanner;
public class StudentGrade2D{
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);

       // Declaring and taking input in 2D array marks and percentage as input
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
		double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade= new char[n];

        for (int i=0; i<n; i++)
        {
		    // taking marks of students in subjects and checking it is valid or not
            System.out.println("Enter marks for Student " +(i+1));
			System.out.print("Physics : ");
            marks[i][0] = input.nextDouble();
			System.out.print("Chemistry: ");
            marks[i][1]= input.nextDouble();
			System.out.print("Maths: ");
            marks[i][2] = input.nextDouble();
			if (marks[i][0]<0 || marks[i][1]<0 || marks[i][2]<0)
            {
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }
             
			 // calculating the percentage and grade
            percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2]) / 3;
			if (percentage[i] >= 80)
			{
                grade[i] = 'A';
			}
            else if (percentage[i] >= 70)
			{
                grade[i] = 'B';
			}
            else if (percentage[i] >= 60)
			{
                grade[i] = 'C';
			}
            else if (percentage[i] >= 50)
			{
                grade[i] = 'D';
			}
            else if (percentage[i] >= 40)
			{
                grade[i] = 'E';
			}
            else
			{
                grade[i] = 'R';
			}
        }

        // displaying the results
        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Student " + (i + 1) +" Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] +" Maths: " + marks[i][2] +" Percentage: " + percentage[i] +
                " Grade: " + grade[i]);
        }

        input.close();
    }
}
