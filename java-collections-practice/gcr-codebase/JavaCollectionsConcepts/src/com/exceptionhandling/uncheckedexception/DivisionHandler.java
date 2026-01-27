package com.exceptionhandling.uncheckedexception;

import java.util.Scanner;
import java.util.InputMismatchException;

class DivisionHandler{
	
    void performDivision()
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: Please enter numeric values only.");
        }
        finally
        {
            sc.close();
        }
    }
}
