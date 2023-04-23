// Program: ComputeArea
//Programmer: Kenneth Tran
//Date 01/24/18
//Version: 1.0
// This Program will Computer the area of a circle
//Input none
//Output: the area of a circle

import java.util.Scanner;


public class ComputeArea {
	
//Main method
	
	public static void main(String[] args) {
		
		//declare variables
		double radius;
		double area;
		
		//create Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for a radius
		System.out.println( "Enter the radius of your circle: ");
	
		//Assign a value to variables
		radius = keyboard.nextDouble();
		
		//Carry out any computations
		area = radius * radius * 3.14159;
		
		//Display results
		System.out.println( "The area for the circle of radius" + radius + " is " + area );
		
	}//end main
	
}//end class
