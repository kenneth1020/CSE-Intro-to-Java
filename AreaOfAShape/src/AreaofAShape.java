// Area of a Shape
// Kenneth Tran
// 2/08/2018
// This program will help find the shape of an area

//libaray of scanner
import java.util.Scanner;

public class AreaofAShape 
{
	
	public static void main(String[] args) {
		//making variables
		double base;
		double height;
		double area;
		double length;
		double side;
		int selection;
		
		//creating scanner
		Scanner input = new Scanner(System.in);
		
		
		//selection display
		System.out.println("Please enter number for what shape you want ");
		System.out.println("Number 1 = Triangle ");
		System.out.println("Number 2 = Square ");
		System.out.println("Number 3 = Rectangle ");
		System.out.println("Number 4 = Pentagon ");
		selection = input.nextInt();
		//selection case
		switch (selection)
		{
		//triangle case 1
		case 1:
			//ready base
			System.out.println("Please enter your triganle base: ");
			base = input.nextDouble();
			//ready height
			System.out.println("Please enter your triganle height: ");
			height = input.nextDouble();
			//calculation
			area = 0.5 * ( base * height);
			//printing out
			System.out.println("Base: " + base + " Height: " + height + " Area: " + area);
			break;
		
		//Square case 2
		case 2:
			//ready side
			System.out.println("Please enter your Sqaure side: ");
			side = input.nextDouble();
			//calculation
			area = Math.pow(side, 2);
			//printing out
			System.out.println("Side: " + side + " Area: " + area);
			break;
			
		//Rectangle case 3
		case 3:
			//ready base
			System.out.println("Please enter your rectangle base: ");
			base = input.nextDouble();
			//ready height
			System.out.println("Please enter your rectangle height: ");
			height = input.nextDouble();
			//calculation
			area = ( base * height);
			//printing out
			System.out.println("Base: " + base + " Height: " + height + " Area: " + area);
			break;
		
		//Pentagon case 4
		case 4:
			//ready length
			System.out.println("Please enter your length to the center of the pentagon: ");
			length = input.nextDouble();
			//Area
			side = 2 * length * Math.sin(Math.PI/5);
			area = (5 * Math.pow(side, 2))/ (4 * Math.tan(Math.PI/5));
			//printing out
			System.out.println("Lenght from the center: " + length + " Side of the pentagon: " + side + " Area: " + area);
			break;
			
			//other selection
		default:
			System.out.println("Stop using the wrong selection! DON'T YOU KNOW HOW TO READ!!! BAKA!!!!!!");
			}
		System.out.println("Thank you for using this calculator! Now go back to work you math slave monkey");
	}//end class

}//end main
