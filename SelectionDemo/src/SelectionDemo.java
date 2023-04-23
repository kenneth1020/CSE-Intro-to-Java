/*
 * Program: SelectionDemo
 * Description: To demonstrate selection control structures in Java.
 * Programmer: Kenneth Tran
 * Date: Janaury 31, 2018
 * Version: 1.0
 * Input: integers
 * Output: Results of boolean expressions 
 */

import java.util.Scanner;

public class SelectionDemo {
	public static void main(String[] args) {
		
		//Declare variables
		int count = 5;
		int inputNumber;
		
		//create the scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user to input a number
		System.out.print("Enter a number: ");
		inputNumber = input.nextInt();

		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("IF Statement Demo");

		/*The basic if statement
		 * It either is or it isn't
		 * syntax:
		 * 		if(boolean expression)
		 * 			{
		 * 				statement(s);
		 * 			}
 		 * If boolean expression it TRUE then statements are processed,
 		 * otherwise statements are ignored.
 		 * 
 		 * Note: The boolean data type results in either TRUE or FALSE
 		 *       Boolean operators are <, <=, >, >=, ==, !=
		*/
			
		//check if number is less than 5
		if(inputNumber < count)
		{
			System.out.println(inputNumber + " is less than " + count);
		}//end if
		
		// Code after if statement runs no matter what
		System.out.println("You have completed the if statment demo");

		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("IF-ELSE Statement Demo");

		/*The if-else statement
		 * It either is this or it is that
		 * syntax:
		 * 		if(boolean expression)
		 * 			{
		 * 				statement(s)for the TRUE case;
		 * 			}
		 * 			else
		 * 			{
		 * 				statement(s) for the FALSE case;
		 * 			}
		*/
		
		//check if number is less than 5

		
		// Code after if statement runs no matter what
		System.out.println("You have completed the if-else statement demo.");	

		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Nested IF-ELSE Statement Demo");
		
		/*The nested if-else statement
		 * If it is true you can check to see if it meets another if-else test
		 * 		 * syntax:
		 * 		if(boolean expression)
		 * 			{
		 * 				if(second boolean)
		 * 				{
		 * 				statement(s)for the both TRUE cases;
		 * 				}
		 * 			}
		 * 			else
		 * 			{
		 * 				statement(s) for the both FALSE cases;
		 * 			}
		*/
		
		//generate a random number between 1 and 10
		int randomNum = (int) (Math.random() * 10);
		
		System.out.println("randomNum number is " + randomNum);
		
		//check if inputNumber is less than 5 and less than randomNum
		if (inputNumber < count)
		{
			System.out.println(inputNumber + " is less than " + count);
			if (inputNumber < randomNum)
			{
			System.out.println(inputNumber + " is less than " + randomNum);
			}
			else
			{
				System.out.println(inputNumber + " is NOT less than " + randomNum);	
			}
		}
		else
		{
			System.out.println(inputNumber + " is Not less than " + count);
		}
		
		// Code after if statement runs no matter what
		System.out.println("You have completed the nested if-else statement demo.");		
		
	}//end main
}//end class
