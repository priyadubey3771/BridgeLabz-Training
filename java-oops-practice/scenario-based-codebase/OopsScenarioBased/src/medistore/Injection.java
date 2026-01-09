package medistore;

import java.time.LocalDate;
public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) 
    {
        super(name, price, expiryDate);
    }

    //Injections expire exactly on expiry date
    @Override
    public boolean checkExpiry() 
    {
        return LocalDate.now().isAfter(expiryDate);
    }
}
