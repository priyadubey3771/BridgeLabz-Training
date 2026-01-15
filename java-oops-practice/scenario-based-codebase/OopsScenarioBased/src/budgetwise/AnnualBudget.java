package budgetwise;

import java.util.Map;
public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) 
    {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() 
    {
        System.out.println("Annual Budget Summary:");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() 
    {
        if (getTotalExpenses() > limit) 
        {
            System.out.println("⚠ Annual budget exceeded!");
        } 
        else 
        {
            System.out.println("Annual budget maintained.");
        }
    }
}
