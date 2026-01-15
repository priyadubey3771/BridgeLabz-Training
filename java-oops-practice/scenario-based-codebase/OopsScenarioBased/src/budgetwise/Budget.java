package budgetwise;

import java.util.*;
public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    // constructor
    public Budget(double income, double limit, Map<String, Double> categoryLimits) 
    {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // controlled expense addition
    public void addTransaction(Transaction t) 
    {
        transactions.add(t);
    }

    // calculate total expenses
    protected double getTotalExpenses() 
    {
        double total = 0;
        for (Transaction t : transactions) 
        {
            if (t.getType().equals("EXPENSE")) 
            {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double calculateSavings() 
    {
        return income - getTotalExpenses();
    }

    @Override
    public abstract void generateReport();

    @Override
    public abstract void detectOverspend();
}
