/**
 * 
 */

// Chapter 4
// Kenneth Tran
// 2/21/2018
// This program willdisplay the number of vowels and consonants in the string. 
/**
 * @author v113
 *
 */
import java.util.Scanner;
public class CountingVowels {

	/**
	 * 1.  Create a Scanner object for user input 
	 * 2.  Declare and initialize variables to hold the count of vowels and consonants
		3.  Prompt user to enter a string
		4.  Declare and initialize a String variable with user input
		5.  Use a for loop to process each character in String
      5.1 Convert each character to uppercase
      5.2 Check IF the character is a vowel (A or E or I or O or U)
          5.2.1 If it is add one to count of vowels
      5.3 Else if it isn't
          5.3.1 Add one to count of consonants
		6.  Display result of counts of vowels and consonants
	 */
	public static void main(String[] args) {
		// Created Scanner object for user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = input.nextLine();
		int vowels= 0;
		int space=0;
		//test
		System.out.println("Enter a String: " + s);
		s=s.toUpperCase();
		
	 for (int i = 0; i < s.length(); i ++)
	 {		 		 
		 if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
		 {
			 vowels++;
		 }
		 if(s.charAt(i) == ' ')
		 {
			 space++;
		 }
		 
	 }//vowels end
	 
	 int constants =(s.length() - vowels)-space;
	 System.out.println("The number of vowels is " + vowels);
	 System.out.println("The number of consonants is " + constants);
	 System.out.println("The number of space is " + space);
	}//end main

	

}//end class
