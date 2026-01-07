package loanbuddy;

public class LoanBuddyDriver {
  public static void main(String[] args) {

        Applicant applicant1 = new Applicant("Priya Dubey", 720, 50000, 800000);
        Applicant applicant2 = new Applicant("Rahul Sharma", 640, 28000, 400000);

        LoanApplication loan1 = new HomeLoan(240, applicant1);
        LoanApplication loan2 = new AutoLoan(60, applicant2);
        LoanApplication[] loans = { loan1, loan2 };

        for (LoanApplication loan : loans) 
        {
            System.out.println("\n ");
            loan.approveLoan();    
            loan.displayResult();
        }
    }
}
