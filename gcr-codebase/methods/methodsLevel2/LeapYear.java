
import java.util.Scanner;
public class LeapYear {

     // method to check if year is leap year or not
    boolean isLeapYear(int year) 
	{
        if (year>= 1582 &&(year%4 ==0 && year%100!= 0 || year%400 ==0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        //taking year as input from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();
		
		//checking if the year is leap or not and displaying the result
		LeapYear leap = new LeapYear();
		if (leap.isLeapYear(year)) 
		{
            System.out.println("Year is Leap Year");
        } 
		else 
		{
            System.out.println("Year is not a Leap Year");
        }

        input.close();
      }
    }
