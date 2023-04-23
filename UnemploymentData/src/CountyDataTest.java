import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountyDataTest {
	private static ArrayList<CountyData> countyRecord = new ArrayList<CountyData>();
	public static void main(String[] args) {
		// Create scanner 
		//read in the data from the file and opening the file and connecting it to the Scanner object
		//that I called input
		Scanner input = null;

		//catch out exception
		try {
			input = new Scanner(new File("countyData-1.csv"));
		}//end try

		//if reading can't find or detect file
		catch(FileNotFoundException e)
		{
			System.out.println( "Error opening the file. countyData.csv. Why you no, READ my file!!!");
			e.printStackTrace();
		}//end exception

			input.nextLine();// skip next line
	
		//reading file 
		while(input.hasNext()) {
			String fields[] = input.nextLine().split(",");
			int smokers = Integer.parseInt(fields[1]);//percent of smokers
			int obese= Integer.parseInt(fields[2]);// percent of obese
			int income = Integer.parseInt(fields[3]);//income of 
			countyRecord.add(new CountyData(fields[0], smokers, obese, income));
		}//end of while
		
		Collections.sort(countyRecord);
		
		for(int i = 0; i < countyRecord.size(); i++)
		{
			System.out.println(countyRecord.get(i));
		}
	
}//end of main
	
}//end of class