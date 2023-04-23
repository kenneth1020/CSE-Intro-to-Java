/**
 * 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * @author trank
 *
 */

class Element{
	public double value;
	public String element;
	Element(double value, String element){
		this.value = value;
		this.element = element;
	}
}

public class elementalDiagnosis {
	static public ArrayList<Data> list = new ArrayList<Data>();
	static int sizeList = 28;
	static String word; 
	static int counting = 0;
	static double elementList[] = new double [28];
	static int arr[] = new int [9]; 
	static double[] case2 = {0.5 , 0.5};
	static double[] case3 = {0.60 , 0.30, 0.15};
	static double[] case4 = {0.60 , 0.30, 0.15, 0.05};
	static double[] case5 = {0.60 , 0.30, 0.15, 0.05, 0.03};
	static double[] case6 = {0.60 , 0.30, 0.15, 0.05, 0.03, 0.02};
	static double[] case7 = {0.60 , 0.30, 0.15, 0.05, 0.03 , 0.02, 0.01};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "Elemental graph test.csv";
		readInData(fileName);
		Interface();
	}

	public static void Interface()
	{
		question1(); 
		answering(arr, 7 );
		switchesCases(arr);
		
		question2();
		answering(arr, 6);
		switchesCases(arr);
		
		question3();
		answering(arr, 8);
		switchesCases(arr);
		
		question4();
		answering(arr, 6);
		switchesCases(arr);
		
		idE();
	}

	//the printer
	public static void testingPhase() {
		//for (int i = 0; i < 7 ; i++) {
		//	System.out.println(arr[i]);
		//}
		
		
		/*
		elementList[1] = 105.99;
		elementList[27] = 9.99;
		for(int i = 1; i < 28; i++) {
			System.out.println(elementList[i]);
			
		}*/
		System.out.println(list.get(0).getFire());
	}

	public static void answering(int arr[], int limit) {

		counting = 0;
		while (counting < limit) {
			System.out.println("Are you done? If you say yes. We will go to the next question");
			Scanner scanner = new Scanner(System.in);
			String answers = scanner.nextLine();
			if(answers.equalsIgnoreCase("yes")) {
				break;
			}//breakign statement
			else {
				System.out.println("Please put in number of choice. Choosing all 7 choices or less");
				int num = scanner.nextInt();
				arr[counting] = num- 1;
				counting++;
				System.out.println(" " + counting);
			}

		}//end of while counting loop
	}


	//Printing out question on with listing 
	public static void question1 () {
		System.out.println("Which Traits best describe you:");
		System.out.println("1: Passionate – Burning motive and doing things more than "
				+ "100%. Keeping your motive high until you burn out bright. Can be over hype "
				+ "and attach to their desires. Doing what they love is what they desire. "
				+ "Hates being put down and smudged.");
		System.out.println("2: Clarity – Calm and collective. "
				+ "Like to think clearly. Being at neutral expression. "
				+ "Loving peaceful and calm area. Can be ice cold and down to earth. "
				+ "Being realistic. Hates being clouded");
		System.out.println("3: Free – Laid back and relax. Free to do whatever you want "
				+ "and like. Go with the wind kind of person. Loving having no stress "
				+ "and relaxing. Hates being drag down and feeling drown with pressure.");
		System.out.println("4: Energetic - Having to constant movement. Love to run around and do "
				+ "something. Loving to be moving around and be busy like a bee. Being like a party animal "
				+ "and jumpy. Hates being still and held back."); 
		System.out.println("5: Kindness – Attached on idea of love and filled with kindness. Helping other "
				+ "they care about. Loving to be near their loved ones and filled other and themselves "
				+ "with love. Hates internal fights and being heart broken. Never want hurt others and "
				+ "sometimes hurting themselves.");
		System.out.println("6: Strong will – Tough and hard as rock. Molding their "
				+ "own goals. An unbreakable will and determination. Willing go an extra mile "
				+ "for their goal. Being proud of what they accomplished. Hates being/feeling weak and "
				+ "stuck to point they can’t do anything.");
		System.out.println("7: Preservation – Loving every second of fond memories. Keeping things on schedule "
				+ "and wants thing to be time schedule. Keeping track of things and listing. Can be in a hurry "
				+ "when being late. Hates getting off schedule and time.");
	}

	public static void question2 () {
		System.out.println( " Which word means the most to you:\r\n"
				+ "8: Forgiveness – To learn to forgive and forget.\r\n"
				+ "9: Redemption – Wanting to seek redemption for their mistake\r\n"
				+ "10: Serenity – Remaining calm and collective. Cool and composed in the night\r\n"
				+ "11: Radiant – Being bright and energetic. Shining with a warm glow\r\n"
				+ "12: Idealistic – Creative with many ideas bursting with many projects that you started\r\n"
				+ "13: Finale - Destructive and chaotic knowing when to stop and quit. When all things need come to an end\r\n"
				+ "  ");
	}
	public static void question3 () {
		System.out.println("Which Traits you want or bet better at?\r\n"
				+ "14: Wisdom – Gaining knowledge and becoming wise\r\n"
				+ "15: Curiosity – Adventurous and wanting to explore and see everything\r\n"
				+ "16: Interactive – Socializing and having fun through things like games\r\n"
				+ "17: Reflective – Looking at yourself and knowing who you are. Without all the delusions and layers of mask you hide behind. \r\n"
				+ "18: Salvation – Saving and caring providing some relief for others. \r\n"
				+ "19: Values – Knowing what material things really means. Valuing many things besides just objects. Like valuing virtues. \r\n"
				+ "20: Justice – Sense of fairness and seeking equality. Knowing what is wrong. Fighting for what you believe is right. \r\n"
				+ "21: Guidance – A leader who help other and guide them. A leader that everyone can depend on. Setting a path for others to follow.\r\n"
				+ "");
	}

	public static void question4 () {
		System.out.println("Are you a __?\r\n"
				+ "22: Revolution – changing things for the better. Trying to over and over to make something better. Creating something great by hammer out all the kinks and bugs.\r\n"
				+ "23: Inspirations – Inspire others resonating on their emotion, mind, soul, or body. Creating something the brings others up to from your projects. \r\n"
				+ "24: Brave – Fearless against challenges. Never faulter and heads straight in with no regrets. \r\n"
				+ "25: Discipline – Control on your emotions and body. Maintaining yourself with your own set of rules and values. Action on problem with precision.\r\n"
				+ "26: Perspective- Understanding other sides of the view. Not blinded by one and can see in multiple angles. \r\n"
				+ "27: Festive – Energetic and celebrator person. Becoming a joyful bubble person who enjoy the season festivities or event. \r\n"
				+ " ");
	}
	public static void idE () {
		Element[] arr;
		arr = new Element[27];
		for(int i = 1 ; i < 28; i++) {
	 	arr[i-1] = new Element(elementList[i], list.get(i-1).getAnswers());
	 	System.out.println(arr[i-1].value + " " + arr[i-1].element);
	 	}
	 }
	


	//switch cases 
	public static void switchesCases(int[] arr) {;
		int var = 0;
		double level[] = new double[28];
		while(var < counting) {
			System.out.println(list.get(arr[var]).getAnswers());
			level[1] = list.get(arr[var]).getFire();
			level[2] = list.get(arr[var]).getWater();
			level[3] = list.get(arr[var]).getWind();
			level[5] = list.get(arr[var]).getLife();
			level[4] = list.get(arr[var]).getThunder();
			level[6] = list.get(arr[var]).getEarth();
			level[7] = list.get(arr[var]).getTime();

			level[8] = list.get(arr[var]).getSound();
			level[9] = list.get(arr[var]).getEngineer();
			level[10] = list.get(arr[var]).getAssasiin();
			level[11] = list.get(arr[var]).getWarrior();
			level[12] = list.get(arr[var]).getInsane();
			level[13] = list.get(arr[var]).getSpirit();

			level[14] = list.get(arr[var]).getSun();
			level[15] = list.get(arr[var]).getMoon();
			level[16] = list.get(arr[var]).getCreate();
			level[17] = list.get(arr[var]).getDestory();
			level[18] = list.get(arr[var]).getYang_light();
			level[19] = list.get(arr[var]).getYin_dark();

			level[20] = list.get(arr[var]).getHeal();
			level[21] = list.get(arr[var]).getKnowledge();
			level[22] = list.get(arr[var]).getAlchemy();
			level[23] = list.get(arr[var]).getRoyal();
			level[24] = list.get(arr[var]).getRebel();
			level[25] = list.get(arr[var]).getGame();
			level[26] = list.get(arr[var]).getTranspotation();
			level[27] = list.get(arr[var]).getGemini();
			switch(counting) {
			case 1: for(int i = 1 ; i < 28; i++) {
				elementList[i] = elementList[i] + level[i];
				//System.out.println(elementList[i]);
			}
			case 2: for(int i = 1 ; i < 28; i++) {
				elementList[i] =	elementList[i] + level[i] * case2[var];
				//System.out.print(elementList[i]);
			}
			case 3: for(int i = 1 ; i < 28; i++) {
				elementList[i] =	elementList[i] + level[i]*case3[var];
				//System.out.print(elementList[i]);
			}
			case 4: for(int i = 1 ; i < 28; i++) {
				elementList[i] =	elementList[i] + level[i]*case4[var];
				//System.out.print(elementList[i]);
			}
			case 5: for(int i = 1 ; i < 28; i++) {
				elementList[i] =	elementList[i] + level[i]*case5[var];
				//System.out.print(elementList[i]);
			}
			case 6: for(int i = 1 ; i < 28; i++) {
				elementList[i] =	elementList[i] + level[i]*case6[var];
				//System.out.print(elementList[i]);
			}
			case 7: for(int i = 1 ; i < 28 ; i++) {
				elementList[i] =	elementList[i] + level[i]*case7[var];
				//System.out.print(elementList[i]);
			}

			}//end of switch
			var++;
		}//end of while
	}
	
	//reading file excel data 
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
			System.out.println( "Error opening the file. " + fileName + " Why you no, READ my file!!!");
			e.printStackTrace();
		}//end exception
		input.nextLine();
		while(input.hasNext()) {
			counting++;
			
			String[] fields = input.nextLine().split(",");
			//adding the different types to the array
			//System.out.println(fields[0] + " "+  fields[1] + " " + counting);
			if(counting == sizeList)
			{
				break;
			}
			//adding the string variable and all the doubles
	
			list.add(new Data(fields[0], Double.parseDouble(fields[1]), Double.parseDouble(fields[2]), Double.parseDouble(fields[3]) 
					, Double.parseDouble(fields[4]) , Double.parseDouble(fields[5]) , Double.parseDouble(fields[6])
					, Double.parseDouble(fields[7]) , Double.parseDouble(fields[8]) , Double.parseDouble(fields[9])
					, Double.parseDouble(fields[10]) , Double.parseDouble(fields[11]), Double.parseDouble(fields[12])
					, Double.parseDouble(fields[13]), Double.parseDouble(fields[14]), Double.parseDouble(fields[15])
					, Double.parseDouble(fields[16]), Double.parseDouble(fields[17]), Double.parseDouble(fields[18])
					, Double.parseDouble(fields[19]), Double.parseDouble(fields[20]), Double.parseDouble(fields[21])
					, Double.parseDouble(fields[22]) , Double.parseDouble(fields[23]) , Double.parseDouble(fields[24])
					, Double.parseDouble(fields[25]) , Double.parseDouble(fields[26]),Double.parseDouble(fields[27]) 
					));
		}//end of while
	}//end of reader
}
