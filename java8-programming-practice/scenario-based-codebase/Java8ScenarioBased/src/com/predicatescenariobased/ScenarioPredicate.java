package com.predicatescenariobased;

import java.util.function.Predicate;

public class ScenarioPredicate {
   public static void runScenarios() {

        // 1. Student eligibility for exam (attendance >= 75%)
        Predicate<Integer> examEligibility = attendance -> attendance >= 75;
        System.out.println("Eligible for Exam: " + examEligibility.test(80));

        System.out.println("-----");

        // 2. Employee salary > 30000
        Predicate<Double> highSalary = salary -> salary > 30000;
        System.out.println("Salary greater than 30000: " + highSalary.test(35000.0));

        System.out.println("-----");

        // 3. Bank withdrawal validation (withdraw <= balance)
        double balance = 10000;
        Predicate<Double> validWithdrawal = withdrawAmount -> withdrawAmount <= balance;
        System.out.println("Valid Withdrawal: " + validWithdrawal.test(5000.0));

        System.out.println("-----");

        // 4. E-commerce free delivery (order amount > 500)
        Predicate<Double> freeDelivery = amount -> amount > 500;
        System.out.println("Eligible for Free Delivery: " + freeDelivery.test(750.0));

        System.out.println("-----");

        // 5. Check even or odd number
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is Even: " + isEven.test(14));
    }
}
