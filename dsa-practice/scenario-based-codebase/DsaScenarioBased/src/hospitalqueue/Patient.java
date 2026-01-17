package hospitalqueue;

//represents a patient 
class Patient {

 String name;
 int criticality; 

 // Constructor
 public Patient(String name, int criticality) 
 {
     this.name = name;
     this.criticality = criticality;
 }

 // displaying patient details
 public void display() 
 {
     System.out.println(name + " | Criticality: " + criticality);
 }
}
