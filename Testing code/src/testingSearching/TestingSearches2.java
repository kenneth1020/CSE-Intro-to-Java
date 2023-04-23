
/**
 * Kenneth Tran
 * 9/11/19
 * object describe an record in our dictionary || rewriting and researching program
 *
 */

package testingSearching;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class TestingSearches2 {

	private static ArrayList<Word> words= new ArrayList<Word>();

	public static void main(String[] args) {

		//array to hold our Employee objects



		//reading in data from a text file is "copy and paste" code
		String fileName = "dictionary.txt";
		Scanner inputStream = null;
		System.out.println("The file " + fileName + 
				"\ncontains the following lines:\n");
		try
		{
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}

		//make an index to index in the array
		while (inputStream.hasNextLine())
		{
			//testing that we are connecting and reading from file
			//String line = inputStream.nextLine();
			//System.out.println(line);

			//read the data into the 2 arrays

			String word = inputStream.next();
			String def = inputStream.nextLine();
			words.add(new Word(word, def));
		}

		//close the inputStream because we are done with the file
		inputStream.close();

		//test that we read the data into the arrays correctly
		/*
		for(int i = 0; i < SIZE; i++)  {
			System.out.println(word[i] + ":  " + def[i]);
		}
		 */

		//testing that linear and binary search work by searching for a word
		System.out.println("searching for zombies using linear search");
		int indexReturned = linearSearch("zombies");
		System.out.println(words.get(indexReturned));

		System.out.println("searching for zombies using binary search");
		indexReturned = binarySearch( "zombies");
		System.out.println(indexReturned);
		System.out.println(words.get(indexReturned));

		System.out.println("Num Of Times, Linear, Binary");
		for(int n = 1; n < 100000; n*=10) {
			long startTime = System.nanoTime();
			for(int i = 0; i < n; i++)
				linearSearch( "zombies");
			long endTime = System.nanoTime();
			System.out.print( n + " , " + (endTime - startTime));

			long startTime2 = System.nanoTime();
			for(int i = 0; i < n; i++)
				binarySearch("zombies");
			long endTime2 = System.nanoTime();
			System.out.println(" , " + (endTime2 - startTime2));

		}



	}//end main

	public static int linearSearch( String key)  {

		int index = 0;
		//int countSteps = 0; 
		while(index < words.size())  {
			//countSteps++;
			//comparing Strings so need to use equals and not ==
			if(words.get(index).getWord().equals(key)) { 
				//System.out.println("The number of steps for linear search is " + countSteps);
				//System.out.println(index);
				return index;
			}
			index++;
		}
		//System.out.println("The number of steps for linear search is " + countSteps);
		return -1;
	}

	public static int binarySearch( String key)  {

		int low = 0;
		int high = words.size()-1;
		//int countSteps = 0;
		while (high >= low) {
			//countSteps++;
			int mid = (low + high) / 2;
			if (words.get(mid).getWord().compareTo(key) > 0)  //comparing Strings so need to use compareTo method
				high = mid - 1;
			else if (words.get(mid).getWord().equals(key)) {  //comparing Strings so need to use equals and not ==
				//System.out.println("The number of steps for binary search is " + countSteps);
				return mid;
			}
			else
				low = mid + 1;
		}
		//System.out.println("The number of steps for binary search is " + countSteps);
		return -1; // Not found 
	}
}//end class
