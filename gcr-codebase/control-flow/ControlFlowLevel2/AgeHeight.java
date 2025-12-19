  
import java.util.Scanner;
public class AgeHeight {
   public static void main (String[] args){
     Scanner input = new Scanner(System.in);
   
	// taking ages and height of Amar, Akbar, Anthony as the input from the user
	System.out.println("enter the age of Amar:");
	int ageAmar = input.nextInt();
	System.out.println("enter the age of Akbar:");
	int ageAkbar = input.nextInt();
	System.out.println("enter the age of Anthony:");
	int ageAnthony = input.nextInt();
	System.out.println("enter the height of Amar:");
	int heightAmar = input.nextInt();
	System.out.println("enter the height of Akbar:");
	int heightAkbar = input.nextInt();
	System.out.println("enter the height of Anthony:");
	int heightAnthony = input.nextInt();
	
   
   
		// checking youngest among Amar, Akbar and Anthony
			if(ageAmar<ageAkbar && ageAmar<ageAnthony)
				{
					System.out.println("Amar is the youngest \n");
				}
			else if(ageAkbar<ageAmar && ageAkbar<ageAnthony)
				{
					System.out.println("Akbar is the youngest \n");
				}
			 else
				{
					System.out.println("Anthony is the youngest \n");
				}
			
		// checking tallest among Amar, Akbar and Anthony
	        if(heightAmar>heightAkbar && heightAmar>heightAnthony)
				{
					System.out.println("Amar is the tallest");
				}
			else if(heightAkbar>heightAmar && heightAkbar>heightAnthony)
				{
					System.out.println("Akbar is the tallest");
				}
			 else 
				{
					System.out.println("Anthony is the tallest");
				}
	  
	  input.close();
	 }
    }