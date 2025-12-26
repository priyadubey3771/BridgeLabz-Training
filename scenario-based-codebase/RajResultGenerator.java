
import java.util.Scanner;
public class RajResultGenerator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        int total = 0;

        // Input marks using a for loop
        for (int i=0; i<numSubjects; i++) 
		{
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i]= sc.nextInt();
            total += marks[i];
        }
		// Calculate average
        double average = total / (double) numSubjects;
        System.out.println("\nAverage Marks: " + average);
		// Assign grade using switch-case
        int gradeIndicator = (int) average / 10;
        String grade;

        switch(gradeIndicator) 
		{
            case 10:
			    {
					grade = "A+";
					break;
				}
            case 9:
				{
					grade = "A+";
					break;
				}
            case 8:
				{
					grade = "A";
					break;
				}
            case 7:
				{
					grade = "B";
					break;
				}
            case 6:
				{
					grade = "C";
					break;
				}
            case 5:
				{
					grade = "D";
					break;
				}
            default:
				{
					grade = "F";
				}
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
