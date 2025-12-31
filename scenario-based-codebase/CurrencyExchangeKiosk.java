
import java.util.Scanner;
public class  CurrencyExchangeKiosk{
   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   char choice;
     do
	 {
		 // taking the amount of Indian rupee a person wants to convert as input
		System.out.println("Enter the amount of Indian Rupee you want to convert");
		double indianAmount = sc.nextDouble();
		
		// asking the user into which currency does he want to convert
		System.out.println("\nYou want to convert the Indian rupee to which of the currency?");
		System.out.println("1)Nepalese Rupee\n2)Sri Lankan Rupee\n3)Thai Baht\n4)Russian Ruble\n5) Bhutanese Ngultrum");
	    int CurrencyChoice = sc.nextInt();
		double targetCurrency= 0;
		
		// taking the currency conversion choice of user and converting accordingly and displaying the result
		switch(CurrencyChoice)
		{
		      case 1:
			         {
					      targetCurrency= indianAmount* 1.6;
					      System.out.println("Rs "+ indianAmount+ " in Nepalese Rupee is: "+ targetCurrency);
						  break;
					 }	  
					      
		       case 2:
			         {
					      targetCurrency= indianAmount* 3.45;
					      System.out.println("Rs "+ indianAmount+ " in Sri Lankan Rupee is: "+ targetCurrency);
						  break;
					 }	
				
			   case 3:
			         {
					      targetCurrency= indianAmount* 0.35;
					      System.out.println("Rs "+ indianAmount+ " in Thai Baht is: "+ targetCurrency);
						  break;
					 }
					 
		       case 4:
			         {
					      targetCurrency= indianAmount* 1.08;
					      System.out.println("Rs "+ indianAmount+ " in Russian Ruble is: "+ targetCurrency);
						  break;
					 }
					 
			    case 5:
			         {
					      targetCurrency= indianAmount* 1;
					      System.out.println("Rs "+ indianAmount+ " in Bhutanese Ngultrum is: "+ targetCurrency);
						  break;
					 }
				default :
				    {
					     System.out.println("You entered the wrong choice");
					}
		 }
		 
		 // asking the user that does he want to convert the currency again
		 System.out.println("Do you want to convert currency again(Y/N)?");
		 choice = sc.next().charAt(0);
	  }
	  while(choice=='y' || choice =='Y');
	  
	  sc.close();
	  }
	}