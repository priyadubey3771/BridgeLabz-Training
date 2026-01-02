package hospitalPatientManagementSystem;

public class HospitalManagementApp {
  public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Amit Sharma", "Diabetes", 5);
        Patient p2 = new OutPatient(102, "Neha Verma", "Fever", 800);

        Doctor d1 = new Doctor(201, "Dr. Rao", "Cardiology");

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
        System.out.println();
        d1.displayInfo();
        System.out.println();

        Bill bill = new Bill(5000);
        System.out.println("Final Bill Amount: ₹" + bill.calculatePayment());
    }
}
