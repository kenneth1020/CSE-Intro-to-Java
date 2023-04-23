import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MonthlyUnemploymentData {

		//make an array to hold our data
	private static ArrayList<WorstDataNA> employeeRecord = new ArrayList<WorstDataNA>();
	public static void main(String[] args) {
		// Create scanner 
		//read in the data from the file and opening the file and connecting it to the Scanner object
		//that I called input
		Scanner input = null;

		//catch out exception
		try {
			input = new Scanner(new File("mercedData.csv"));
		}//end try

		//if reading can't find or detect file
		catch(FileNotFoundException e)
		{
			System.out.println( "Error opening the file. mercedData.csv. Why you no, READ my file!!!");
			e.printStackTrace();
		}//end exception

			input.nextLine();// skip next line
	
		//reading file 
		while(input.hasNext()) {
			String fields[] = input.nextLine().split(",");
			String[] date = fields[0].split("-");
			int year = Integer.parseInt(date[0]);//1998-
			int month = Integer.parseInt(date[1]);//10
			int day = Integer.parseInt(date[2]);//26
			double rate = Double.parseDouble(fields[1]);//14.5
			employeeRecord.add(new WorstDataNA(year, month, day, rate));
		}//end of while
		
		//getting average of all employment of all year 1990 - 2019
		averageUnemploymentRate();
		//sorting out the array
		Collections.sort(employeeRecord);
		
		//printing out top ten worse percent
		System.out.println("Worse employee Record");
		for(int i = 0; i < 10; i++)
		{
			System.out.println(employeeRecord.get(i));
		}
		
		//printing out top ten best percent
		System.out.println("Best employee Record");
		for(int i = employeeRecord.size()-1; i > employeeRecord.size()-11; i--)
		{
			System.out.println(employeeRecord.get(i));
		}
	}//end of main
	
	public static void averageUnemploymentRate() {
	int count = 0;
	int j= 0;
	int min = employeeRecord.get(0).getYear();
	int max = employeeRecord.get(employeeRecord.size()-1).getYear();
	int diff = (max - min)+1;
	double[] sum = new double[diff];
		for(int i = 0; i < employeeRecord.size(); i++)
		{
			sum[count] += employeeRecord.get(i).getPercent();
			j++;
			if(j == 12)
			{
				count++;
				j=0;
			}
			
		}
		for(int a =0; a < sum.length; a++)
		{
			sum[a] = sum[a] /12;
			System.out.print( "  Year: " + min++ + "  ");
			System.out.printf("Average unemploment rate: " + "%3.2f\n",sum[a]);
		}
	} 
	
	
}//end of class
