package budgetwise;

import java.util.*;
public class BudgetwiseDriver {
  public static void main(String[] args) {

    Map<String, Double> categories = new HashMap<>();
    categories.put("Food", 5000.0);
    categories.put("Travel", 3000.0);
    categories.put("Shopping", 4000.0);

    Budget budget = new MonthlyBudget(30000, 20000, categories);

    budget.addTransaction(new Transaction(4000, "EXPENSE", "Food"));
    budget.addTransaction(new Transaction(2500, "EXPENSE", "Travel"));
    budget.addTransaction(new Transaction(2000, "EXPENSE", "Shopping"));
    budget.generateReport();
    budget.detectOverspend();
        
    }
}
