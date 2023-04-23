/* 
* Program: BMICalculator
 * Description: To demonstrate selection control structures in Java.
 * Programmer: Kenneth Tran
 * Date: Janaury 31, 2018
 * Version: 1.0
 * input: weight and height
 * output BMI 
 */
import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating scanner
		Scanner input = new Scanner(System.in);
		
		//creating variables
	double weight;
	double height;
	double BMI;
	
	//entering values
	System.out.println("Enter a weight in pounds: ");
	weight = input.nextInt();
	System.out.println("------------------------------------");
	System.out.println("Enter a height in inches: ");
	height = input.nextInt();
	System.out.println("------------------------------------");
	
	//calculating
	BMI = weight / (height * height) * 703;
	System.out.println(BMI);
	System.out.println("calculating");
	System.out.println("------------------------------------");
	
	//underweight
	if(BMI < 18.5)
	{
		System.out.println("Warning Underweight");
	}//end of underweight
	
	//normal
	if(BMI > 18.5 && BMI < 24.9 )
	{
		System.out.println("Normal weight, Congrats");
	}//end of normal
	
	//Overweight
	if(BMI > 24.9 && BMI < 29.9)
	{
		System.out.println("Overweight, that's no good");
	}
	
	//Obese
	if(BMI > 30)
	{
		System.out.println("Obese, please consider the following Exersices, diet, and becareful of the things you consume");
	}
	
	}//end main
}//end class