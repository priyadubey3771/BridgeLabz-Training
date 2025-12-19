
import java.util.Scanner;
public class VoteStudents {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        // declaring the array age and taking age of ten students as input from the user
		int[] age = new int[10];
        System.out.println("Enter age of 10 students:");
		 for(int i=0; i< age.length; i++)
		{
			age[i]= input.nextInt();
		}

        // checking if the student is eligible to vote and displaying the result
		for(int i=0; i<age.length; i++)
		{
			if(age[i]<0)
			{
					System.out.println("Invalid age");
			}
			else if(age[i]>= 18)
			{
					System.out.println("The student with the age "+ age[i] +" can vote");
			}
			else
			{
					System.out.println("The student with age "+ age[i] +" cannot vote");
			}
		}

		input.close();
		}
	}
