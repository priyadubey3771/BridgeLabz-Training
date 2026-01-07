package loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(int term, Applicant applicant) 
    {
        super("Auto Loan", term, 10.5, applicant);
    }

    @Override
    public boolean approveLoan() 
    {

        // Auto loan approval logic
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 25000) 
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
