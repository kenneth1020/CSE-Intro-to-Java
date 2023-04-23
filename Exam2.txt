/**
 * 
 */

/**
 * Kenneth Tran	
 * 3/11/18
 *This program will demonstrates the frequency of guitar string velocity in air, steel, and water. Also show you the frequency of depending on the speed and wavelength. 
 *All information will be formated in a table for the user to see and read.
 */



public class ExamTwo 
{
	
	public static void main(String[] args) 
	{

	
	//making variables
		//variables for guitar in air, water, and steel
	double air =  397.0;
	double water, steel;
	
		//variables for frequency
	double air2 = 397.0;
	double frequencyOne, frequencyTwo, frequencyThree;
	int wavelength1 = 350, wavelength2 = 400, wavelength3 = 410;
	

	
	System.out.println("v In Air" + "\t" +"v In Water" + "\t" + "v In Steel");
	
	//calculating result for guitar in air, water or steel. In a loop until reach air less than 499.
	do {
		//Adding 3 to velocity
		air = air + 3;
		air = (Math.round(air * 10) / 10.0);
		
		//calculating water
		water = ( 1500* air)/330;
		water = (Math.round(water * 10) / 10.0);
		
		//calculating steel
		steel = ( 5000* air)/330;
		steel = (Math.round(steel * 10) / 10.0);
		
		//printing result 
		System.out.println( air + "\t \t" + water + "\t \t" + steel);
		
	}while(air < 499);//end of loop
	
	//printing out layout
	System.out.println("Velocity" + "\t" +"Wavelength 1" + "\t" + "Frequency 1" + "\t" +"Wavelength 2" + "\t" + "Frequency 2" + "\t" +"Wavelength 3" + "\t" + "Frequency 3");
	
	//will keep adding 3 to velocity until reach 499
	do {
		
		//adding velocity by 3
	air2 = air2 + 3;
	
	//putting in calculation for Frequency 1 
	frequencyOne = guitarStringFrequency1(air2,wavelength1);
	wavelength2 = wavelength2 + 1;
	//putting in calculation for Frequency 2
	
	frequencyTwo = guitarStringFrequency2(air2, wavelength2);
	wavelength3 = wavelength3 + 10;
	
	//putting in calculation for Frequency 3
	frequencyThree = guitarStringFrequency3(air2, wavelength3);
	
	//printing out results
	System.out.println(air2 + "\t \t" + wavelength1 + "\t \t" + frequencyOne + "\t \t" + wavelength2 + "\t \t" + frequencyTwo + "\t \t"+ wavelength3 +"\t \t" + frequencyThree );
	
	//resets wavelength 3 when reach 450
	if (wavelength3 == 450)
	{
		wavelength3 = wavelength3 - 50;
	}
	
	}while(air2<499); //end of loop
	
	
	}//end main
	
	
	//calculating frequency1
	public static double guitarStringFrequency1(double velocity, int wavelength)
	{
		double result;
		result = velocity / wavelength;
		result = (Math.round(result * 1000) / 1000.000);
		return result;
	}//end calculating frequency1
	
	
	//calculating frequency2
	public static double guitarStringFrequency2(double velocity, int wavelength)
	{
		double result;
		result = velocity / wavelength;
		result = (Math.round(result * 1000)) / 1000.000;
		return result;
	}//end calculating frequency2
	
	
	
	//calculating frequency3
	public static double guitarStringFrequency3(double velocity, int wavelength)
	{
		double result ;
			result = velocity / wavelength;
			result = (Math.round(result * 1000)) / 1000.000;
			return result;
		
	}//end calculating frequency3


	

}//end class
