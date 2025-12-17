//creating class AveragePercent to calculate the total average percent marks of Sam
public class AveragePercent {
   public static void main ( String args[] ) {
   
      //creating variables to assign marks of different subjects
      int maths = 94 ;
	  int physics = 95 ;
	  int chemistry = 96 ;
	  
	  //creating the variables to calculate the total marks of the subjects
	  int TotalMarks = (maths + physics + chemistry) / 3  ;
	  
	  //Displaying the average percent mark of Sam
	  System.out.println ( "Sam average mark in PCM is" + " " +TotalMarks) ;
   }
 }