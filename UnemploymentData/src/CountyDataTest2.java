import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CountyDataTest2 {
	private static CountyData[] record = new CountyData[58];
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
			int index=0;
		//reading file 
		while(input.hasNext()) {
			String fields[] = input.nextLine().split(",");
			int smokers = Integer.parseInt(fields[1]);//percent of smokers
			int obese= Integer.parseInt(fields[2]);// percent of obese
			int income = Integer.parseInt(fields[3]);//income of 
			record[index++] = new CountyData( fields[0], smokers, obese, income); 
		}//end of while
		quickSort(record);
		for(int i = 0; i < index; i++)
		{
			System.out.println(record[i]);
		}
	
		
		
		
}//end of main
	
	public static void quickSort(CountyData[] list) {
	    quickSort(list, 0, list.length - 1);
	  }

	public static void quickSort(CountyData[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle].getavgHouseHoldIncome();
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i].getavgHouseHoldIncome() < pivot) {
				i++;
			}
 
			while (arr[j].getavgHouseHoldIncome() > pivot) {
				j--;
			}
 
			if (i <= j) {
				CountyData temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	
}//end of class