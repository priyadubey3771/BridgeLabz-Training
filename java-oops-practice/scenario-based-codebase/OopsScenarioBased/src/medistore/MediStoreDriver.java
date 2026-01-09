package medistore;

import java.time.LocalDate;
//Driver class to test MediStore system
 public class MediStoreDriver {
  public static void main(String[] args) {

        Medicine tablet = new Tablet("Paracetamol",5.0,LocalDate.of(2026, 5, 10));
        Medicine syrup = new Syrup("Cough Syrup",80.0,LocalDate.of(2025, 10, 1),15);
        Medicine injection = new Injection("Insulin",250.0,LocalDate.of(2025, 8, 20));

        // Selling medicines
        tablet.sell(6);   
        syrup.sell(2);
        injection.sell(1);

        // Expiry checks
        System.out.println("Tablet expired? " + tablet.checkExpiry());
        System.out.println("Syrup expired? " + syrup.checkExpiry());
        System.out.println("Injection expired? " + injection.checkExpiry());
    }
}
