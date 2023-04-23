
import java.util.Scanner;


public class Tictac2 {

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

		//Keep track who's turns
		boolean isPlayer1 = true;

		boolean gameEnded = false;
		while(!gameEnded) {

			//Keep track of what is symbol we used
			
			drawBoard(board);
			
			char symbol = ' ';
			if(isPlayer1) {
				symbol ='X';
			}
			else {
				symbol = 'O';
			}

			if(isPlayer1) {
				System.out.println(p1 + "'s Turn (X):");
			}
			else{
				System.out.println(p2 +"'s Turn (O):");
			}


			//setting the variables
			int row = 1;
			int col = 1;

			while(true) {
				//Get row and col from user
				System.out.print ("Enter a row (1, 2, 3");
				int row = in.nextInt();
				System.out.print ("Enter a column (1, 2, 3");
				int col = in.nextInt();

				if( row < 1 || col < 1 || row > 3 || col > 2) {
					System.out.println("Your row and col are out of bounds");
				}
				else if (board [row-1][col-1] != '-') {
					System.out.println("Someone has already made a move there!");
				}
				else {

					break;
				}
			}

			board[row-1][col-1] = symbol;
			drawBoard(board);

			if(hasWon (board) == 'X') {
				System.out.println(p1 + " has won!");
				gameEnded = true;
			}else if (hasWon(board)== 'O') {
				System.out.println(p2 + " has won!");
				gameEnded = true;
			} else {
				//If neither player has won, check to see if there has been a tie (if the board is full)
				if(boardIsFull(board)) {
					System.out.println("It's a tie!");
					gameEnded = true;
				} else {
					//If player1 is true, make it false, and vice versa; this way, the players alternate each turn
					isPlayer1 = !isPlayer1;
				}
			}
		}
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


	public static char hasWon(char[][] board) {
		for(int i = 0; i <3; i++) {
			if(board[i][0] == board[i][1] && board [i][1] == board[i][2] && board[i][0] != '-') {
				return board[i][0];
			}
		}
		for(int j = 0; j <3; j++) {
			if(board[0] [j] == board[0][j] && board [1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}

		//Diagonals
		if(board[0][0] == board[1][1] && board [1][1] == board [2][2] && board[0][0] != '-') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board [1][1] == board [0][2] && board[2][0] != '-') {
			return board[2][0];
		}

		//Nobody has won
		return '-';
	}

	public static boolean boardIsFull(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}


}//end of class
