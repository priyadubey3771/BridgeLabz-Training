package myBank;

//Interface for banking transactions
interface Transaction {

 void deposit(double amount);
 void withdraw(double amount);
 void checkBalance();
}
