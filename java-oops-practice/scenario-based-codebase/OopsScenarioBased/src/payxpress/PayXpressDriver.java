package payxpress;

import java.time.LocalDate;
public class PayXpressDriver {
  public static void main(String[] args) {

        Bill bill1 = new ElectricityBill(1200, LocalDate.now().plusDays(3));
        Bill bill2 = new InternetBill(999, LocalDate.now().plusDays(1));
        Bill bill3 = new WaterBill(450, LocalDate.now().plusDays(5));

        bill1.sendReminder();
        bill2.sendReminder();
        bill3.sendReminder();
        bill2.pay();
        bill1.pay();
        
    }
}
