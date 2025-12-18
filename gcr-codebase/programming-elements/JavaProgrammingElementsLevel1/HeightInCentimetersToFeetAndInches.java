import java.util.* ;
        //creating a HeightInCentimetersToFeetAndInches class to convert height in centimeters to inches and feet
public class HeightInCentimetersToFeetAndInches {
   public static void main(String args[]) {
   Scanner input = new Scanner(System.in) ;
   
   //creating variable to store height in centimeters, foot and inches
   double Height ;
   double Foot ;
   double Inches ;
   
   //Taking user height as input
   System.out.println("Enter your height in centimeters") ;
   Height = input.nextDouble() ;
   
   //computing height
   Inches = Height / 2.54 ; 
   Foot = Inches / 12 ;
   
   //Displaying height in feet annd inches
   System.out.println(" Your Height in cm is " +Height +" while in feet is " +Foot +" and in inches is " +Inches) ; 
   
   }
}
