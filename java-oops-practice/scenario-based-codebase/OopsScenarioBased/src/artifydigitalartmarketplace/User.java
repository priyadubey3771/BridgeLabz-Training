package artifydigitalartmarketplace;
public class User {

    private String name;          
    private double walletBalance; 

    public User(String name, double walletBalance) 
    {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    // Deduct amount from wallet
    public void deductBalance(double amount) 
    {
        if (walletBalance >= amount) 
        {
            walletBalance -= amount;
        }
        else 
        {
            System.out.println("Insufficient wallet balance!");
        }
    }

    public double getWalletBalance() 
    {
        return walletBalance;
    }

    public String getName() 
    {
        return name;
    }
}
