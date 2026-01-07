package loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term;          
    protected double interestRate;   
    protected Applicant applicant;
    private boolean approved;     

    public LoanApplication(String loanType, int term,double interestRate, Applicant applicant) 
    {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.applicant = applicant;
    }

    // Final method ensures controlled status update
    protected final void setApproved(boolean status) 
    {
        this.approved = status;
    }

    public boolean isApproved() 
    {
        return approved;
    }

    //EMI calculation
    protected double calculateBaseEMI() 
    {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }

    public void displayResult() 
    {
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Type: " + loanType);
        System.out.println("Approved: " + approved);
        if (approved) 
        {
            System.out.println("Monthly EMI: ₹" +String.format("%.2f", calculateEMI()));
        }
    }
}
