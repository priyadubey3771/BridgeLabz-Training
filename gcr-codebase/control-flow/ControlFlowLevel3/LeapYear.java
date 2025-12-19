
import java.util.Scanner;
public class LeapYear {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking year as the input from the user
		int year;
		System.out.println("enter the year:");
		year = input.nextInt();
		
		// checking if the year is leap or not using multiple if else
		 
		if(year<1582) 
		{
            System.out.println("Leap Year calculation is not possible");
        } 
		else 
		{
            if(year%400==0) 
			{
                System.out.println("Year is a Leap Year");
            } 
			else if(year%100==0) 
			{
                System.out.println("Year is not a Leap Year");
            } 
			else if(year%4==0) 
			{
                System.out.println("Year is a Leap Year");
            } 
			else 
			{
                System.out.println("Year is not a Leap Year");
            }
        }

        // checking if the year is leap or not using only one if statement and logical operators
		
        if(year>=1582 && ((year%4==0 && year%100!=0) || (year%400==0))) 
		{
            System.out.println("Year is a Leap Year");
        } 
		else if(year>=1582) 
		{
            System.out.println("Year is not Leap Year");
        }
		else 
		{
            System.out.println("Leap Year calculation is possible only for year>=1582");
        }

        input.close();
    }
}
