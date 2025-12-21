
import java.util.Scanner;
public class StudentVote {

     //method to check if the student can vote or not
    public boolean canStudentVote(int age)
	{
        if(age<0) 
		{
            return false;
        }
        else if(age>=18) 
		{
            return true;
        }
		else
		{
          return false;
		}
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] ages= new int[10];
        StudentVote voteCheck = new StudentVote();

         // taking ages of 10 students as the input from the user
        for (int i=0; i<ages.length; i++) 
		{
            System.out.print("Enter age of student " +(i+1)+ ":");
            ages[i]= input.nextInt();

            // displaying whether the student can vote or not
            boolean result= voteCheck.canStudentVote(ages[i]);
			if (result) 
			{
                System.out.println("Student " + (i+1) + " can vote");
            } 
			else 
			{
                System.out.println("Student" + (i+1) + " cannot vote");
            }
        }

        input.close();
    }
}
