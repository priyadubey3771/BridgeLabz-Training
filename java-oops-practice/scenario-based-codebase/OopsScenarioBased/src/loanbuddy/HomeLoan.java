package loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(int term, Applicant applicant) 
    {
        super("Home Loan", term, 8.5, applicant);
    }

    @Override
    public boolean approveLoan() 
    {

        // Home loan approval logic
        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= 30000) 
        {

            setApproved(true);
            return true;
        }

        setApproved(false);
        return false;
    }

    @Override
    public double calculateEMI()
    {
        return calculateBaseEMI();
    }
    
}



