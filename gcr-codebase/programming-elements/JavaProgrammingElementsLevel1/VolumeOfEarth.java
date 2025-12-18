//creating the class VolumeOfEarth to calculate volume of Earth
public class VolumeOfEarth {
   public static void main (String args []) {
   
       //creating a variable radius and assigning it the radius of earth
   int radius = 6378 ;
   double VolumeInKilometers = (4/3)*3.14 * radius ;
   double VolumeInMiles = VolumeInKilometers * 1.6 ;
   
   //Displaying the Volume of Earth in Kilometers and miles
   System.out.println("The volume of the Earth in cubic kilometers is " +VolumeInKilometers +" and cubic miles is " +VolumeInMiles) ;
   
   }
}