/**
 * 
 */

/**
 * Kenneth Tran
 * 03/21/18
 * This program will demonstrate the used of the game craps
 */

//creating scanner
import java.util.Scanner;

public class Craps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//activate the scanner
				Scanner input = new Scanner(System.in);
				
		//display welcome
		System.out.println("Hello!!! Welcome to the game of Craps!");
		
		//ask for user input
		System.out.println("Would you like to play (Y) for yes or (N) for no");
		
		//waiting for user input
		String s = input.nextLine();
		s=s.toUpperCase();
		
		//Lets play the game
		if(s.charAt(0) == 'Y' )
		{
		int diceOne = (int) (Math.random() * 5);
		int diceTwo = (int) (Math.random() * 5);
		diceOne = (diceOne + 1);
		diceTwo = (diceTwo + 1);
		int total1 = diceOne + diceTwo;
		System.out.println("You rolled " + diceOne + " + " + diceTwo + " = " + total1 );
		//called loser
		if(total1 == 2 || total1 == 3 || total1 == 12)
		{
			System.out.println("You Lose. . . I've called Craps");
			System.out.println("Thanks for playing Loser");
		}//calling craps
		else if(total1 == 7 || total1 == 11)
		{
			System.out.println("You Win. . . I've called hacks");
			System.out.println("Thanks for playing Winner");
		}
		
		//if other value then re-roll
		else
		{
			int i = 0;
			
			//calculating
			do
			{
				int dice1 = (int) (Math.random() * 5);
				int dice2 = (int) (Math.random() * 5);
				dice1 = (dice1 + 1);
				dice2 = (dice2 + 1);
				int total2 = dice1 + dice2;
				//if dice vaule equal same as previous roll
					if (total1 == total2)
					{
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + total2 );
					System.out.println("You Win. . . I've called hacks");
					System.out.println("Thanks for playing Winner");
					break;
					}
					
					//if dice vaule equal 7
					if(total2 == 7)
					{
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + total2 );
					System.out.println("You lose. . . I've called Craps");
					System.out.println("Thanks for playing Loser");
					break;
					}
					
			}
			while(i < 100);
		}
		
		}//end game
		
		
		//Wow ok then leave
		else if(s.charAt(0) == 'N')
		{
			System.out.println("Ok, Goodbye. . .");
			System.out.println("But I know you'll come back to play (0w0) Always waiting!!!");
		}//end No answer
		
		
		//Give insult
		else
		{
			System.out.println("Error!!! Error! User don't know how to read. . .");
			System.out.println("Goodbye Cruel World *dramatic dying noises");
		}//end of insult

	}

}
