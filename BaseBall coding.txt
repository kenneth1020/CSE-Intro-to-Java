/**
 * 
 */

/**
 * Kenneth Tran	
 * 5/23/18
 *This program will demonstrates baseball display win and lose of teams and Game back
 */
//import library
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class BaseBall {

	private int losses;


	public static void main(String[] args) 
	{
		//creating file
		String fileName = "BaseBallStats.txt";

		// Create scanner
		Scanner input = new Scanner(System.in);
		
		//Creating variables
		int wins[] =new int[32];
		int losses[] =new int[32];
		int x = 0;
		double GB []= new double[32];
		int lossesFirstTeam = 0;
		int winsFirstTeam = 0;
		double percent[] =new double[32];
		
		//Reading a text file
		Scanner inputStream = null;
		
		//catch exception 
		try
		{
			inputStream = new Scanner(new File (fileName));
			System.out.println("Reading//.... " + fileName);
		}//end of try
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName + ". Oppss i drop it somewhere!!!");
			System.exit(0);
		}//end of catch
		
		
		inputStream.nextLine(); //skips header
		int index = 0;
		while (inputStream.hasNextInt()) 
		{
			wins[index] = inputStream.nextInt();
			losses[index] = inputStream.nextInt();
			index++;	
		
		}//end while
		inputStream.close();
		
		//find winsFirstTeam, lossesFirstPlaceTeam and max wins
				
				for(int k = 0; k < 31; k++) 
	{
					
	if(wins[k] > winsFirstTeam) {
		winsFirstTeam = wins[k];
		lossesFirstTeam = losses[k];
				}//end if
	}//end for finding
				
				
				//printing out display
			System.out.println("Team#" + "\t" + "GB" + "\t" + "WP");
			
			//print out results
		    for(int j = 0; j < 31; j++)
		    {
		    	System.out.print(j + 1 + "\t" + gamesback(wins[j], losses[j], winsFirstTeam, lossesFirstTeam) + "\t");
		    	percent[j] = winningPercentage(wins[j], losses[j]);
		    	System.out.printf("%1.0f", winningPercentage(wins[j], losses[j]) );
		    	System.out.println("%");
		    }//end of result and data
		    
		    //reading the winner and losers
		    double FirstPlace = 50 * (percent[1] / 100);
		    int First = 0;
		    double LastPlace = 50 * (percent[1] / 100);
		    int Last = 0;
		    for(int a = 0; a < 31; a++) 
			{
		    	percent[a] = 50 * (percent[a] / 100);
		    	if(percent[a] > FirstPlace)
		    	{
		    		FirstPlace = percent[a];
		    		First = a + 1;
		    	}
		    	
		    	if(percent[a] < LastPlace)
		    	{
		    		LastPlace = percent[a];
		    		Last = a + 1;
		    	}
			}
		    
		    System.out.println("Team " + First + " Seems to be the most likely to be winning the baseball game and bring home a trophy");
		    System.out.println("Team " + Last + " Seems to be the saddest team that baseball League have ever seen");
		    
		    
		
	}//end main
	
	//putting it through calculation
	public static double gamesback(int wins, int losses, int winsFirstTeam, int lossesFirstTeam) {
		double first;
		double second;
		double result;
		first = winsFirstTeam - wins;
		second = lossesFirstTeam - losses;
		second = Math.abs(second);
		first =Math.abs(first);
		result = first + second;
		result = result / 2;
		return result;
	}
	//putting it through calculations
	public static double winningPercentage(double wins, double losses) {
		double result = 0;
		double games = 0;
		games = wins + losses;
		
		result = wins / games;
		result = result * 100;
		return result;
		
	}
	
	
	
	
	
	
	
}//end class
