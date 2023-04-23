/**
 * Kenneth Tran and Alexander Hernandez
 *8/14/19
 *CPSC 39
 *
 */
package velocities;
//importing commands
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Velocity {

	public static void main(String[] args) {
		//array to hold our data
		double[] init = new double[100];
		double[] fin = new double[100];
		double[] accer = new double[100];
		double time = 60.0;

		// Create scanner
		Scanner input = null;

		//catch out exception
		//reading the file
		try {
			input = new Scanner(new File("velocities.txt"));

		}//end try
		//if reading can't find or detect file
		catch(FileNotFoundException e)
		{
			System.out.println( "Error opening the file. velocities.txt. Why you no, READ my file!!!");
			e.printStackTrace();
		}//end exception

		//Reading the velocities

		//creating the value for the index
		int index = 0;
		while(input.hasNext()) 
		{
			//reading array for inital and final
			init[index] = input.nextDouble();
			fin[index] =input.nextDouble();
			index++;
		}//end while loop

		//print out the table headers
		System.out.println("Time(sec)\tinital velocity(m/s)\tfinal velocity\tAccleration(m/s/s)\tAccleration(mi/h/s)\tDisplacement" );

		//showing the progress and result
		for(int i = 0; i < init.length; i++)
		{
			//Calculating the acceleration
			double acc = acceleration(init[i], fin[i], time);
			//creating array for acceleration for conversion 
			accer[i] = acc;
			//Converting Meters per second to miles per hour
			double milesperhour = mph(accer[i]);
			//print out results
			double dis = displacement(init[i], fin[i], time);
			System.out.println(time + "\t\t" + init[i] + "\t\t\t" + fin[i] + "\t\t" + acc + "\t\t\t" + milesperhour + "\t\t\t" + dis);
		}//end for loop 

	}//end main

	//grabbing information and calculating the displacement
	public static double displacement(double init, double fin, double time)
	{
		//creating value
		double dis = 0;
		//calculating displacement
		dis = ((init+fin)/2)*time;
		//returning value
		return dis;
	}//end of displacement

	//grabbing information and calculating the acceleration
	public static double acceleration(double init, double fin, double time)
	{
		//creating value
		double acc = 0;

		//formula for acceleration
		acc = (fin - init) / time ;

		//rounding value		
		double num = acc;
		num = num*1000;
		num=Math.round(num);
		acc = num/1000;

		//returning the acceleration to main
		return acc;

	}//end of public for acceleration
	//Conversion 
	public static double mph (double accer)
	{
		//create value
		double mph = 0;
		double num = 0;

		//converting MPS to MPH
		mph = accer * 2.23694;

		//rounding value
		num =mph*1000;
		num=Math.round(num);
		mph = num/1000;

		//return MPH to main
		return mph;
	}//end of public MPStoMPH

}//end of class
