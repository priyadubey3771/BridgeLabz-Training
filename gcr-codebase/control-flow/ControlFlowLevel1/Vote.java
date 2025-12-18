
 import java.util.Scanner;
 public class Vote{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 // taking age as input from the user
 int age;
 System.out.println("enter the age of the person:");
 age = input.nextInt();
 
 // checking if the person can vote, i.e, whether age is greater or equal to 18
  if(age>=18)
  System.out.println("The person's age is " + age + " and can vote");
  else
  System.out.println("The person's age is " + age + " and cannot vote");
 
 input.close();
 }
 }
 