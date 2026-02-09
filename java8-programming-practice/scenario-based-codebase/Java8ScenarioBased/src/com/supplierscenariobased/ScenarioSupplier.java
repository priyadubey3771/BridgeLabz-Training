package com.supplierscenariobased;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class ScenarioSupplier {
   public static void runScenarios() {

        // 1. Generate OTP
        Supplier<Integer> otpSupplier = () -> 100000 + new Random().nextInt(900000);
        System.out.println("Generated OTP: " + otpSupplier.get());

        System.out.println("-----");

        // 2. Generate random student ID
        Supplier<Integer> studentIdSupplier = () -> 1000 + new Random().nextInt(9000);
        System.out.println("Student ID: " + studentIdSupplier.get());

        System.out.println("-----");

        // 3. Provide current date and time
        Supplier<LocalDateTime> dateTimeSupplier = LocalDateTime::now;
        System.out.println("Current Date & Time: " + dateTimeSupplier.get());

        System.out.println("-----");

        // 4. Default welcome message
        Supplier<String> welcomeMessage = () -> "Welcome to the system!";
        System.out.println(welcomeMessage.get());

        System.out.println("-----");

        // 5. Generate random discount coupon
        Supplier<String> couponSupplier = () -> "DISC" + (100 + new Random().nextInt(900));
        System.out.println("Discount Coupon: " + couponSupplier.get());
    }
}
