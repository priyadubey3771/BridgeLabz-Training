package ambulanceroute;

//Manages ambulance routing using Circular Linked List
class AmbulanceRoute {

 private HospitalUnit head;   // Starting unit

 // Add a hospital unit to the circular route
 public void addUnit(String name, boolean available) {

     HospitalUnit newUnit = new HospitalUnit(name, available);

     // If route is empty
     if (head == null) {
         head = newUnit;
         newUnit.next = head; // Circular link
         return;
     }

     // Traverse to last unit
     HospitalUnit temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     // Insert new unit at end
     temp.next = newUnit;
     newUnit.next = head;
 }

 // Remove a unit if it is under maintenance
 public void removeUnit(String name) {

     // If route is empty
     if (head == null)
         return;

     HospitalUnit curr = head;
     HospitalUnit prev = null;

     do {
         if (curr.name.equals(name)) {

             // If only one unit exists
             if (curr == head && curr.next == head) {
                 head = null;
             }
             // If head is being removed
             else if (curr == head) {
                 prev.next = curr.next;
                 head = curr.next;
             }
             // If middle or last unit
             else {
                 prev.next = curr.next;
             }
             System.out.println(name + " removed for maintenance.");
             return;
         }

         prev = curr;
         curr = curr.next;

     } while (curr != head);
 }

 // Find nearest available unit
 public void redirectPatient() {

     // If no units available
     if (head == null) {
         System.out.println("No hospital units available.");
         return;
     }

     HospitalUnit temp = head;

     do {
         if (temp.available) {
             System.out.println("Redirect patient to: " + temp.name);
             return;
         }
         temp = temp.next;
     } while (temp != head);

     System.out.println("All units are currently unavailable.");
 }

 // Display the circular route
 public void displayRoute() {

     if (head == null) {
         System.out.println("Route is empty.");
         return;
     }

     HospitalUnit temp = head;

     do {
         System.out.print(temp.name + " → ");
         temp = temp.next;
     } while (temp != head);

     System.out.println("(back to " + head.name + ")");
 }
}
