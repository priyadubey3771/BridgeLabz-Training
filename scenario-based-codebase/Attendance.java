
import java.util.Scanner;
public class Attendance{
 public static void main(String args[]){
 
     Scanner sc = new Scanner(System.in);
	 
	 // storing 10 student names in the array
	 String[] studentsName = {"Priya", "Piyush", "Saurav", "Som", "Golu", "Pihu", "Ram", "Sandhya", "Priyanka", "Salil Krishna"};
     System.out.println("If the person is available then enter \"present\" else enter \"absent\"");
	 int present = 0;
	 int absent = 0;
	 
	 
	 for(String name: studentsName)
	 {
	   // asking if the person is present or not
	   System.out.println("Is " + name+ " present or absent");
       String attendance = sc.next();
	   
	   //checking if the person is present or not
	   if( attendance.equalsIgnoreCase("present"))
	   {
	       present++;
	   }
	   else
	   {
	       absent++;
	   }
	  }
	   
	   //displaying the total number of present and absent students
	   
	   System.out.println("Total number of present students is:"+ present);
	   System.out.println("Total number of absent students is:"+ absent);
 
        sc.close();
		
	}
  }