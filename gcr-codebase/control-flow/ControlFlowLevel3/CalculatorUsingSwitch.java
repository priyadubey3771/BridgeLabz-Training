
import java.util.Scanner;
public class CalculatorUsingSwitch {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking numbers as the input from the user
		 double firstNumber, secondNumber;
		System.out.println("enter the first number:");
		firstNumber = input.nextDouble();
		System.out.println("enter the second number:");
		secondNumber = input.nextDouble();

        //taking the operation from the user
         System.out.print("Enter operator(+,-,*,/):");
		 String op= input.next();

         // performing calculations on the numbers based on the operator given by the user and displaying the output
		switch(op)
		{
			case "+":
				{
					System.out.println("Result:"+(firstNumber + secondNumber));
					break;
                }
			case "-":
			    {
					System.out.println("Result:"+(firstNumber - secondNumber));
					break;
                }
			case "*":
			    {
					System.out.println("Result:"+(firstNumber * secondNumber));
					break;
				}
			case "/":
			    {
						if(secondNumber!=0)
						{
							System.out.println("Result:"+(firstNumber / secondNumber));
						}
						else
						{
							System.out.println("Division by zero not allowed");
						}
					break;
				}

			default:
			        {
					  System.out.println("Invalid Operator");
					}
		}

			input.close();
			}
				}
