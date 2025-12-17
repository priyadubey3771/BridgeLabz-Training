//creating class DividePen
public class DividePen {
   public static void main (String args[]) {
     
	 //creating variables to store number of pens, students, pens per studnet and number of undistributed pen
	 int Pens = 14 ;
	 int Students = 3 ;
	 int PenPerStudent;
	 int UndistributedPen;
	 
	 //checking for whether distribution is equal
	 if(Pens % Students == 0) {
	 PenPerStudent = Pens/Students;
	 UndistributedPen = 0;
	 }
	 else {
	 PenPerStudent = Pens/Students ;
	 UndistributedPen = Pens % Students ;
	 }
	 
	 //Displaying number of pens per student and the remaining pens not distributed
	 System.out.println ("The Pen Per Student is " +PenPerStudent +" and the remaining pen not distributed is " +UndistributedPen) ; 
	 
   }
}