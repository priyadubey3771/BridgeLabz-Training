
import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic{

    // Method to perform date arithmetic
    static LocalDate calculateDate(LocalDate date)
    {
        LocalDate resultDate= date.plusDays(7);
        resultDate= resultDate.plusMonths(1);
        resultDate= resultDate.plusYears(2);
        resultDate= resultDate.minusWeeks(3);
		return resultDate;
    }

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String inputDate= sc.nextLine();
		LocalDate date= LocalDate.parse(inputDate);
		LocalDate finalDate= calculateDate(date);
		System.out.println("Final Date after calculations: " + finalDate);
    }
   }
