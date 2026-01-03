package bankingSystemWithHelperMethods;

class CurrentAccount extends Account {

 private double overdraftLimit;

 public CurrentAccount(int accNo, Customer customer, double balance, double overdraftLimit) 
 {
     super(accNo, customer, balance);
     this.overdraftLimit = overdraftLimit;
 }

 //flat discount logic
 @Override
 public double calculateDiscount(double amount) 
 {
     return amount > 10000 ? 500 : 0;
 }

 //loan eligibility logic
 @Override
 public boolean checkLoanEligibility() 
 {
     return getBalance() + overdraftLimit >= 10000;
 }
}
