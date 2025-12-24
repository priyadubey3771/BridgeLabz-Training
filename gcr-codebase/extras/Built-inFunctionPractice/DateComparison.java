
import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison{

    // Method to compare two dates
    static void compareDates(LocalDate date1, LocalDate date2)
    {
        if(date1.isBefore(date2))
        {
            System.out.println("First date is before the second date");
        }
        else if(date1.isAfter(date2))
        {
            System.out.println("First date is after the second date");
        }
        else if(date1.isEqual(date2))
        {
            System.out.println("Both dates are the same");
        }
    }

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());
		System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());
		compareDates(date1, date2);
     }
  }
