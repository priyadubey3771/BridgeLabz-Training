
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class LibraryFine {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		// Fine amount per late day
        int finePerDay = 5;

             // Loop to calculate fine for 5 books
            for (int i=1; i<=5; i++) 
			{
                 // Taking due date input from user
				System.out.println("Book " + i);
				System.out.print("Enter due date (yyyy-mm-dd): ");
				
				// Taking return date input from user
				LocalDate dueDate = LocalDate.parse(sc.next());
				System.out.print("Enter return date (yyyy-mm-dd): ");
				LocalDate returnDate = LocalDate.parse(sc.next());

                // Calculate number of days between due date and return date
				long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

                  // Check if book is returned late
                 if (lateDays > 0) 
				 {
					// Calculate fine
					long fine = lateDays * finePerDay;
					System.out.println("Returned late by " + lateDays + " days");
					System.out.println("Fine = Rs" + fine);
			     } 
				 else 
				 {
					// No fine if returned on or before due date
					System.out.println("Returned on time. No fine.");
				 }

            System.out.println(" ");
        }

        sc.close(); 
     }
  }