package hospitalqueue;

//manages patient sorting
public class HospitalQueue {
// bubble Sort by critical, descending order
   public static void sortByCriticality(Patient[] patients) {

     int n = patients.length;

     for (int i = 0; i < n - 1; i++) 
     {
         for (int j = 0; j < n - i - 1; j++) 
         {
        	 // if current patient is less critical than next
             if (patients[j].criticality < patients[j + 1].criticality) 
             {

                 // swap patients
                 Patient temp = patients[j];
                 patients[j] = patients[j + 1];
                 patients[j + 1] = temp;
             }
         }
     }
     
 }
}
