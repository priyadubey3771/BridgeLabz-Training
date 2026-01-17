package hospitalqueue;

public class HospitalDriver {
  public static void main(String[] args) {

        Patient[] patients = { new Patient("Ramesh", 4), new Patient("Anita", 9), new Patient("Suresh", 2), new Patient("Meena", 7),new Patient("Rahul", 5)};

        System.out.println("Before Sorting:");
        for (Patient p : patients) 
        {
            p.display();
        }

        HospitalQueue.sortByCriticality(patients);

        System.out.println("\nAfter Sorting by Criticality:");
        for (Patient p : patients) 
        {
            p.display();
        }
    }
}
