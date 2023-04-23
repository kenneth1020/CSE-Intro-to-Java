//Make a Card object
//make an arraylist of Card objects, and read in our data for our cards
//then shuffle the cards to they are in random order
//Deal the user 2 cards
//deal the dealer 2 cards
//IF userCards == 21 && dealerCards == 21
//   then its a tie, and no one wins
//ELSE IF userCards == 21 
//   then user wins
//ELSE IF dealerCards == 21 
//   then dealer wins
//ask user if they would like to hit - get another card
//while(userWantsToGoAgain)
//IF yes then 
//   deal the user another card
//   add that card to userCards
//IF userCards > 21
//    then they lost
//ELSE IF userCards == 21 
//   then user wins
//ask user if they would like to hit - get another card
//while(dealerGoesAgain)
//IF dealerCards < 17
//then deal the dealer a card - add to dealerCards
//ELSE IF dealerCards == 21
//then they win, and user lost
//ELSE IF dealerCards > 21
//then dealer loses and user wins
//IF userCards > dealerCards
//then the user wins
//ELSE if userCards < dealerCards
//then the dealer wins
//ELSE
//otherwise it is a tie

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Blackjack{

	public static List<cards> deckOfCards = new ArrayList<cards>();
	public static List<cards> userCards = new ArrayList<cards>();
	public static List<cards> dealerCards = new ArrayList<cards>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "cards.txt";
		readInData(fileName);
		Collections.shuffle(deckOfCards);
		//for(int i = 0; i < deckOfCards.size(); i++) {
		//	System.out.println(deckOfCards.get(i));
		//}
		//Deal the user 2 cards
		int userCardsSum = 0;
		int dealerCardsSum = 0;
		for(int i = 0; i < 2; i++) {
			userCardsSum+= dealUserCard();
		}
		//Deal the user 2 cards
		for(int i = 0; i < 2; i++) {
			dealerCardsSum += dealDealerCard();
		}
		//if both are equal to 21
		if(userCardsSum == 21 && dealerCardsSum ==21)
		{
			System.out.println("You got both 21! That's a BAD DEALER BAD NO BAD UWU Bad REEEEEEEEEEEEEEEE");
			System.exit(0);
		}
		//if user has 21 and dealer doesnt
		else if(userCardsSum == 21 && dealerCardsSum !=21)
		{
			System.out.println("You got a Win congrats. You got 21! That's a BAD DEALER BAD NO BAD UWU Bad REEEEEEEEEEEEEEEE");
			System.exit(0);
		}
		//if dealer has 21 and user doesn't
		else if(userCardsSum != 21 && dealerCardsSum ==21)
		{
			System.out.println("You got a LOSE congrats. HAHAHA get good");
			System.exit(0);
		}

		//ask user if they would like to hit - get another card 
		//Uwu hit me senpai OwO 
		System.out.println("Would you like to hit?");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();

		while(answer.equalsIgnoreCase("yes")) {
			userCardsSum+= dealUserCard();
			if(userCardsSum> 21) {
				System.out.println("You got a LOSE congrats. You got Busted. HAHAHA get good");
				System.exit(0);
			}
			else if(userCardsSum == 21) {
				System.out.println("You got a Win congrats. That's a BAD DEALER BAD NO BAD UWU Bad REEEEEEEEEEEEEEEE");
				System.exit(0);
			}
			//ask user if they would like to hit again
			System.out.println("Would you like to hit?");
			System.out.println("Cards sum: " + userCardsSum);
			answer = input.nextLine();
		}//end of while
		if(answer.equalsIgnoreCase("no"))
		{
			int check = 0;
			while(userCardsSum > dealerCardsSum)
			{
				int cardValue = dealDealerCard();
				check = dealerCardsSum  + cardValue;
				if(check > 21)
				{
					break;
				}
				if(check <= 21) {
					dealerCardsSum += cardValue;
				}
			}
			if(dealerCardsSum> 21) {
				System.out.println("Dealer got a LOSE congrats. Got Busted. REEEEEEEEEEEE");
				System.exit(0);
			}
			else if(dealerCardsSum == 21) {
				System.out.println("Dealer got a Win congrats. That's a BAD PLAYER BAD GET GOOD");
				System.exit(0);
			}
			
			if(userCardsSum > dealerCardsSum) {
				System.out.println("You got a Win congrats. That's a BAD DEALER BAD NO BAD UWU Bad REEEEEEEEEEEEEEEE");	
				System.exit(0);
			}
			if(userCardsSum < dealerCardsSum) {
				System.out.println("You got a LOSE congrats. HAHAHA get good");
				System.exit(0);
			}
			
		}
	}
	public static int dealDealerCard() {
		cards userCard = deckOfCards.remove(0);
		System.out.println("Dealer were dealt a " + userCard);
		dealerCards.add(userCard);
		return userCard.getValue();
	}

	public static int dealUserCard() {
		cards userCard = deckOfCards.remove(0);
		System.out.println("You were dealt a " + userCard);
		userCards.add(userCard);
		return userCard.getValue();
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

		while(input.hasNext()) {
			String[] fields = input.nextLine().split(",");
			deckOfCards.add(new cards(fields[0], fields[1], Integer.parseInt( fields[2].trim() )));
		}
		//for(int i = 0; i < deckOfCards.size(); i++) {
		//	System.out.println(deckOfCards.get(i));
		//}
	}

}
