package com.exceptionhandling.customexception;

public class Driver{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        AgeValidator av = new AgeValidator();

        try
        {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            av.validateAge(age);
            
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }
}
