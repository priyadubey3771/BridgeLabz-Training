package com.consumerscenariobased;

import java.util.function.Consumer;

public class ScenarioConsumer {
   public static void runScenarios() {

        // 1. Print student details
        Consumer<String> studentDetails = student -> System.out.println("Student Details: " + student);
        studentDetails.accept("Sagar | Age: 20 | Rank: 3");

        System.out.println("-----");

        // 2. Log employee login activity
        Consumer<String> employeeLogin = emp -> System.out.println("Employee Logged In: " + emp);
        employeeLogin.accept("Amit");

        System.out.println("-----");

        // 3. Print order confirmation message
        Consumer<String> orderConfirmation = order -> System.out.println("Order Confirmed: " + order);
        orderConfirmation.accept("Order ID: 12345");

        System.out.println("-----");

        // 4. Display account balance
        Consumer<Double> accountBalance = balance -> System.out.println("Account Balance: " + balance);
        accountBalance.accept(15000.0);

        System.out.println("-----");

        // 5. Send notification message
        Consumer<String> notification = msg -> System.out.println("Notification: " + msg);
        notification.accept("Your payment was successful!");
    }
}
