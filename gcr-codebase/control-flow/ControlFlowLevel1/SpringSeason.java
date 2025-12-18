
  import java.util.Scanner;
  class SpringSeason {
  public static void main(String[] args){
 
  // taking month and day as input from the user
  int month = Integer.parseInt(args[0]);
  int day = Integer.parseInt(args[1]);
  
  // checking if the season is spring or not and printing the result
   if((month==3 && day>=20) || (month == 4) || (month==5) || (month==6 && day<=20))
   System.out.println("Its a Spring Season");
   else
   System.out.println("Not a Spring season ");
   
   }
   }