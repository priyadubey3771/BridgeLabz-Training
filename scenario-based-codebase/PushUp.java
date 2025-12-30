
import java.util.Scanner;
public class PushUp{
 public static void main(String[] args){
 
     Scanner sc = new Scanner(System.in);
	 
	 //declaring array to store push up for 7 days
	 int[] pushUp = new int[7];
	 int totalPushup = 0;
	 System.out.println("Enter the number of pushUps for each day");
	 
	 // taking push up for 7 days as input from the user
	 for(int i=0; i<7; i++)
	 {
	    System.out.println("Number of pushups for Day "+ (i+1));
         pushUp[i] = sc.nextInt();
     }	

     // calculating total pushup if the day is not a rest day	 
	 for(int count: pushUp)
	 {
	     if(count ==0)
		 {
			continue;
		 }
	     totalPushup = totalPushup + count;
	 }
	 
	 // displaying the total and average pushup
	 System.out.println("Total pushup for a week is" + totalPushup);
	 System.out.println("Average pushup is " + (double) totalPushup/7);
	 
	 sc.close();
	 }
   }
	 