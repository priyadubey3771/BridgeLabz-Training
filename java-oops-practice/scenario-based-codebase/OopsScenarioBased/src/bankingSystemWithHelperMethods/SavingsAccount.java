package bankingSystemWithHelperMethods;

class SavingsAccount extends Account {

 private double interestRate;

 public SavingsAccount(int accNo, Customer customer, double balance, double interestRate) 
 {
     super(accNo, customer, balance);
     this.interestRate = interestRate;
 }

 //interest-based discount
 @Override
 public double calculateDiscount(double amount) 
 {
     return amount * interestRate / 100;
 }

 //Loan eligibility logic
 @Override
 public boolean checkLoanEligibility() 
 {
     return getBalance() >= 5000;
 }
}
