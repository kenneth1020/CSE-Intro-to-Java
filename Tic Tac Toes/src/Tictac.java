
import java.util.Scanner;


public class Tictac {

	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	//Get player's names
	System.out.print("Play 1, what's your name ?");
	String p1 = in.nextLine();
	System.out.print("Player 2, what's is your name ?");
	String p2 = in.nextLine();
	
	
	
	//3x3 Tic Tac Toe board
	// - empty space
	// X player 1
	// O player 2
	
	char [] [] board = new char [3][3];
	
	//Fill the board with dashes
	for ( int i = 0; i <3; i++) {
		
		for(int j = 0 ; j <3 ; j++) {
			board [i] [j] = '-';
		}// end for inner loop
	}//end for double loop
	
	drawBoard(board); 
	
	}//end of main

	//Printing out the board
	public static void drawBoard(char[] [] board) {
		for ( int i = 0; i <3; i++) {
			
			for(int j = 0 ; j <3 ; j++) {
				System.out.print(board[i][j]);
			}// end for inner loop
			System.out.println();
		}//end for double loop
		
	}
	
}//end of class
