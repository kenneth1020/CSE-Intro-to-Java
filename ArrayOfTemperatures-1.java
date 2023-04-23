/* Date: 4/20/2018
 * Programmer: Kenneth Tran
 * Program: ArrayOfTemperatures (Array Demo)
 * Version: 1.0
 * Description: This program will demonstrate the use of arrays in Java programs
 * 			
 */
//setting up library
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOfTemperatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//Read the number of temperatures to input
		System.out.println("Enter the number of temperatures you wish to input: ");
		int numOfTemps = keyboard.nextInt();
		
		//create an array of temperatures
		double[] temperature = new double[numOfTemps];
		
		//Read temperatures and compute their average:
		System.out.println("Enter " + numOfTemps + " temperatures:");
		
		double sum = 0;
		for (int index = 0; index < temperature.length; index++)
		{
			temperature[index] = keyboard.nextDouble();
			sum = sum + temperature[index];
		}//end for
		//calculate the average
		double average = sum / temperature.length;
		System.out.println("The average temperature is " + average);



for(int index = 0; index < numofTemps; index++)
{
if(temperature[index] < average) //temperature less than average
System.out.println(temperature[index] + "is below the average");

else if(temperature[index] > average) //temperature greater than average
System.out.println(temperature[index] + "is above the average");

else //temerpature[index] == average
System.out.println(temperature[index] + "is equal to the average");


}

		//sort the number from  lowest to highest
		Arrays.sort(temperature);
		
		//telling user the temperature
		System.out.println("The temperatures are " );
		//display from highest to lowest and show if its above average or below
		int i = temperature.length - 1; 
		do
		{
			if(temperature[i] > average)
			{
			System.out.println(temperature[i] + " is above average");
			i--;
			}
			else if (temperature [i] == average)
			{
				System.out.println(temperature[i] + " is the average");
				i--;
			}
			else
			{
				System.out.println(temperature[i] + " is below average");
				i--;
			}
		}while (i > -1);
		
		//display the highest and lowest temperature
		int j = temperature.length - 1;
		int k = 0;
		System.out.println(temperature[j] + " is the highest"); 
		System.out.println(temperature[k] + " is the lowest"); 
		System.out.println("Have a nice week.");

	}

}
