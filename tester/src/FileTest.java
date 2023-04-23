import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileTest {
	static public ArrayList<FileReader> file = new ArrayList<FileReader>();
	//to change the new file name "[name] .csv"  Please remember to have .csv or file will not properly save
	private static String fileSaveName ="New work info.csv" ; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Name of file
		String fileName = "AndrewFile.csv";
		readInData(fileName);

		//Test code for printing all the data from the file
		//for(int i = 0; i < file.size(); i++ )
		//{
		//	System.out.println(file.get(i));
		//}
		
		Search();
		Interface();
		
	}//end of main

	public static void Interface()
	{
		//asking if the user like to search again
		System.out.println("like to search again?");
		Scanner inputs1 = new Scanner(System.in);
		String answers = inputs1.nextLine();
		
		//response if user want to search again
		if(answers.equalsIgnoreCase("yes")) {
			Search();	
			Interface();
		}
		//response if user want to search again
		else if(answers.equalsIgnoreCase("no")) { 
			//asking the user if they want make a replace
			System.out.println("Would you like to replace the FRDM Descirption and Product Code");
			Scanner inputs2 = new Scanner(System.in);
			String answers2 = inputs2.nextLine();
			
			//response if user want to make a replacement
			if(answers2.equalsIgnoreCase("yes")) {
				//getting the index id
				System.out.println("Type the ID in the index");
				Scanner inputs = new Scanner(System.in);
				String id = inputs.nextLine();
				//getting the FRDM descirption
				System.out.println("Type the FRDM Descirption");
				Scanner inputs3 = new Scanner(System.in);
				String answers3 = inputs3.nextLine();
				//getting the FRDM code
				System.out.println("Type the FRDM Product Code");
				Scanner inputs4 = new Scanner(System.in);
				String code = inputs4.nextLine();
				//calling the method to replace the index of the array
				Replacement(answers3,Integer.parseInt(id),Integer.parseInt(code));
				Interface();
			}
			
			//response if user want to make a replacement
			else if(answers2.equalsIgnoreCase("no")) {
				ExitSystem();
			}
			//response if user want to make a replacement but didnt type yes or no
			else {
				System.out.println("Sorry i didn't get that");
				Interface();
			}
		}
		//response if user want to search again but didnt type yes or no
		else {
			System.out.println("Sorry i didn't get that");
			Interface();
		}
	}//end of interface

	//method used to exit the system and write the new file for the user
	public static void ExitSystem()
	{
		//making sure if the user wants to exit
		System.out.println("Would you like to exit system");
		Scanner inputs1 = new Scanner(System.in);
		String response = inputs1.nextLine();
		//if they say yes to exit the system will save their work
		if(response.equalsIgnoreCase("yes")) {
			File filename = new File(fileSaveName);
			try {
				FileWriter fw = new FileWriter(filename);
				Writer output = new BufferedWriter(fw);
				int sz = file.size();
				//getting all the information and putting out into a new csv file
				for(int i = 0; i < sz; i++) {
					output.write(file.get(i).getIndexNumber() + "," + file.get(i).getCompany() + "," + file.get(i).getCountry() + "," + file.get(i).getContinent() + ","
							+ file.get(i).getRegion() + "," + file.get(i).getClientDescription() + "," + file.get(i).getFRDMDescription() + "," + file.get(i).getClientProduct()+ ','
							+ file.get(i).getPriority() + "," + file.get(i).getFRDMProductCode() + "\n");
				}
				output.close();
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "I can't create that file");
			}
		}//end of response of yes
		//system will send them back to the interface asking them if they want search or replace
		else if(response.equalsIgnoreCase("no")) {
			System.out.println("Ok heading back to search again");
			Interface();
		}
		//if user type anything else beside yes or no
		else {
			System.out.println("Sorry i didn't get that");
			ExitSystem();
		}
	}
	public static void Search()
	{
		System.out.println("Type in the file you ar searching for");
		Scanner inputs1 = new Scanner(System.in);
		String response = inputs1.nextLine();
		response =response.toUpperCase();

		int result[] = FileSearching(response);
		int count = 0; 
		for(int i =0; i < result.length-1; i++){
			if(result[i] != result[i+1] ) {
				System.out.println("File array number is: " + result[i]);
				System.out.println(file.get(result[i]));
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Sorry result lead to 0: Is this what you looking for?");
			System.out.println(file.get(0));
			//file.get(0).setFRDMDescription("hello");
		}

	}

	public static void Replacement(String word, int index, int number)
	{
		//showing user before
		System.out.println("Index previous: " + index);
		System.out.println(file.get(index));
		//replacing the word and number
		file.get(index).setFRDMDescription(word);
		file.get(index).setFRDMProductCode(number);
		//showing the user after image
		System.out.println("Index changes: " + index);
		System.out.println(file.get(index));
	}

	public static int[] FileSearching(String name)
	{
		//creating the array and variables
		int[] idCode = new int[500]; //used to store all data of the id 
		String[] wordplay = new String[10]; //used to store all word up to ten of a company
		int detect = 0; //used as the integer to help increments for wordplay[] 
		for(int i =0; i < file.size(); i++ )
		{
			String company = file.get(i).getCompany();
			String[] words = company.split("\\s+");
			for (int b = 0; b < words.length; b++) {
				// You may want to check for a non-word character before blindly
				// performing a replacement
				// It may also be necessary to adjust the character class
				words[b] = words[b].replaceAll("[^\\w]", "");
			}
			//checking every word in the company name
			for(int j = 0; j < words.length; j++ )
			{
				//System.out.println(words[j]);
				if(words[j].equalsIgnoreCase(name))
				{
					idCode[detect] = i;
					detect++;
				}

			}

		}
		//returning all the id of the matching word found in the search
		return idCode;
	}


	public static void readInData(String fileName) {
		// Create scanner 
		//read in the data from the file and opening the file and connecting it to the Scanner object
		//that I called input
		Scanner input = null;

		//catch out exception
		try {
			input = new Scanner(new File(fileName));
		}//end try

		//if reading can't find or detect file
		catch(FileNotFoundException e)
		{
			System.out.println( "Error opening the file. Grades.csv. Why you no, READ my file!!!");
			e.printStackTrace();
		}//end exception
		input.nextLine();
		while(input.hasNext()) {
			String[] fields = input.nextLine().split(",");
			file.add(new FileReader(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], fields[8], Integer.parseInt(fields[9])));
		}

	}
}


