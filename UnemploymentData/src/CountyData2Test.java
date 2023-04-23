import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountyData2Test {
	private static CountyData2[] record = new CountyData2[58];
	public static void main(String[] args) {
		// Create scanner 
		//read in the data from the file and opening the file and connecting it to the Scanner object
		//that I called input
		Scanner input = null;

		//catch out exception
		try {
			input = new Scanner(new File("countyData2.csv"));
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
			int population= Integer.parseInt(fields[1]);//percent of smokers
			int death= Integer.parseInt(fields[2]);// percent of obese 
			record[index++] = new CountyData2( fields[0], population, death); 
		}//end of while
		quickSort(record);
		double[] percent = deathPerPopulation(record, index);
		//for(int i = 0; i < index; i++)
		//{
		//System.out.println(record[i]);
		//}

		/*Note this ONLY SORT PERCENT not connected with the index of the data records */
		//mergeSort(percent);

		for(int i = 0; i < index; i++)
		{
			double death= record[i].getDeath();
			double population= record[i].getPopulation();
			String county = record[i].getCounty();
			System.out.printf(county + " with a population of: " + population + " and Death by motor vehicle: " + death 
					+ ". The death per population is: " + "%1.5f\n",percent[i]);
		}


	}//end of main


	public static double[] deathPerPopulation(CountyData2[] list, int index)
	{
		double[] percent = new double[58];
		for(int i = 0; i < index; i++)
		{
			double death= list[i].getDeath();
			double population= list[i].getPopulation();
			percent[i] = (death/population)*100;
		}
		return percent;
	}


	/** The method for sorting the numbers merge sort  *******************/
	public static void mergeSort(double[] percent) {
		if (percent.length > 1) {
			// Merge sort the first half
			double[] firstHalf = new double[percent.length / 2];
			System.arraycopy(percent, 0, firstHalf, 0, percent.length / 2);
			mergeSort(firstHalf);

			// Merge sort the second half
			int secondHalfLength = percent.length - percent.length / 2;
			double[] secondHalf = new double[secondHalfLength];
			System.arraycopy(percent, percent.length / 2,
					secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);

			// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, percent);
		}
	}

	/** Merge two sorted lists *********************/
	public static void merge(double[] list1, double[] list2, double[] temp) {
		int current1 = 0; // Current index in list1
		int current2 = 0; // Current index in list2
		int current3 = 0; // Current index in temp

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}

		while (current1 < list1.length)
			temp[current3++] = list1[current1++];

		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}


	/*******************Quick Sorter *************************************/
	public static void quickSort(CountyData2[] list) {
		quickSort(list, 0, list.length - 1);
	}

	public static void quickSort(CountyData2[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;

		if (low >= high)
			return;

		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle].getDeath();

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i].getDeath() < pivot) {
				i++;
			}

			while (arr[j].getDeath() > pivot) {
				j--;
			}

			if (i <= j) {
				CountyData2 temp = arr[i];
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