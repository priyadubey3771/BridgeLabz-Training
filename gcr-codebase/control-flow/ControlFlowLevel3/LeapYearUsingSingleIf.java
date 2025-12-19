
import java.util.Scanner;
public class LeapYearUsingSingleIf {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking year as the input from the user
		int year;
		System.out.println("enter the year:");
		year = input.nextInt();
		
        //determining Leap Year with single if condition using logical &&  and || operators
		if(year>=1582&&((year%4==0&&year%100!=0)||year%400==0))
		{
		System.out.println("Year is Leap Year");
		}
		else
		{
		System.out.println("Year is not a leap year");
		}

		input.close();
	}
	}
