package com.functionscenariobased;

import java.util.function.Function;

public class ScenarioFunction {
  public static void runScenarios() {

        // 1. Convert marks into grade
        Function<Integer, String> gradeCalculator = marks -> {
            if (marks >= 80) return "A";
            else if (marks >= 50) return "B";
            else return "C";
        };
        System.out.println("Grade: " + gradeCalculator.apply(72));

        System.out.println("-----");

        // 2. Annual salary from monthly salary
        Function<Double, Double> annualSalary =  monthly -> monthly * 12;
        System.out.println("Annual Salary: " + annualSalary.apply(30000.0));

        System.out.println("-----");

        // 3. Discounted product price (10% discount)
        Function<Double, Double> discountedPrice = price -> price * 0.90;
        System.out.println("Discounted Price: " + discountedPrice.apply(2000.0));

        System.out.println("-----");

        // 4. Employee name to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        System.out.println("Uppercase Name: " + toUpperCase.apply("Amit"));

        System.out.println("-----");

        // 5. Celsius to Fahrenheit
        Function<Double, Double> celsiusToFahrenheit = c -> (c * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + celsiusToFahrenheit.apply(30.0));
    }
}
