/**
 * Kenneth Tran
 * 8/19/19
 * CPSC 39
 */

package velocities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpeedProblem {

	public static final double TIME = 60;

	public static void main(String[] args) {
		//making an array of Velocity object to hold our data
		Speed[] velocities = new Speed[100];
		

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

		//creating variable 
		int index =0;
		
		//reading file 
		while(input.hasNext()) {
			/**
			 * big code
			//read in the doubles from a row in our data
			double iVelocity =input.nextDouble();
			double fVelocity =input.nextDouble();
			//construct the velocities object
			velocities[index] = new Speed(iVelocity, fVelocity);
			index++;
			 */
			//how to write in 1 one line of code
			velocities[index++] = new Speed(input.nextDouble(), input.nextDouble());
		}//end of reading file 

		/**
		for(int i = 0; i < velocities.length; i++)
		{
			double iV= velocities[i].getInitialVelocity();
			double fV= velocities[i].getfinalVelocity();
			System.out.println(TIME + "\t" + velocities[i].getInitialVelocity() + "\t" + velocities[i].getfinalVelocity() + "\t" + 
			System.out.println(velocities[i]);
		}
		 */
		//printing results
		System.out.println("Time(s)\tInitailVelocity(m/s)\tFinalVelocity(m/s)\tAccleration(m/s/s)\tAccleration(mi/h/s)\tDisplacement");
		for(Speed v: velocities)
		{
			System.out.printf(TIME + "\t" + v.getInitialVelocity() + "\t\t\t" + v.getFinalVelocity() + "\t\t\t" +"%2.4f", acceleration(v,TIME)  ); 
			System.out.printf( "\t\t\t" + "%2.4f\n",mph(v,TIME) );
		}//end of printing 
		
	}//end of main

	//end of calculation
	public static final double acceleration(Speed v, double time) {
		return (v.getFinalVelocity() - v.getInitialVelocity())/time;
	}//end of calculation
	
	//end of calculation
		public static final double mph(Speed v, double time) {
			return (acceleration(v, time) )* 2.23694 ;
		}//end of calculation
}//end of class
