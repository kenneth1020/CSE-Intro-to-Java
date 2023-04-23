import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Kenneth Tran
 * 8/28/19
 * object describe a record in our Employee data
 *
 */
public class EmployeeTest {

	//array to hold our Employee objects
	private static Employee[] employee =new Employee[50000];
	private static int countOfEmployee = 0; //number the employee

	public static void main(String[] args) {
		// Create scanner 
		//read in the data from the file and opening the file and connecting it to the Scanner object
		//that I called input
		Scanner input = null;

		//catch out exception
		try {
			input = new Scanner(new File("Employee_data-1.csv"));
		}//end try

		//if reading can't find or detect file
		catch(FileNotFoundException e)
		{
			System.out.println( "Error opening the file. Grades.csv. Why you no, READ my file!!!");
			e.printStackTrace();
		}//end exception

		//creating variable 
		int index =0;

		input.nextLine();//Skips header in the file

		//reading file 
		while(input.hasNext()) {
			//read in the line of text from the file from the file, which is one the Employee record from the file
			String record = input.nextLine();
			String fieldArray[] = record.split(",");
			//Splitting the fields
			//instantuatubg our object and putting it in the Employee array
			//Construct the object
			employee[countOfEmployee] = new Employee(fieldArray[0], fieldArray[1].trim(), fieldArray[2], fieldArray[3], Double.parseDouble(fieldArray[4]));
			countOfEmployee++;
		}//end of while



		//for the testing that we filled the array correctly
		/*
		for(int i= 0; i< countOfEmployee; i++) {

			System.out.println(employee[i]);

		}//end for loop
		 */

		//Employee brainSMurphy = findEmployee("Brian S", "Murphy");
		//System.out.println(brainSMurphy);
		//Employee lisaMHall = findEmployee("Lisa M", "Hall");
		//System.out.println(lisaMHall);
		//Employee perdoAdame = findEmployee("Pedro", "Adame");
		//System.out.println(pedroAdame);

		//findSameName();

		
		int tries = 0;
		do {
			System.out.println("Hello User, would you like to research our current data base? To find the top Employee Annual Salary? Yes || NO");
			Scanner inputs = new Scanner(System.in);
			String response = inputs.nextLine();
			response =response.toUpperCase();
			if(response.equalsIgnoreCase("YES"))
			{
				//preparing Searching archives
				System.out.println("Please give me the name of Department they are in");
				String departmentInput = inputs.nextLine();
				double top = topEmployee(departmentInput);
				if( top > 0 )
				{
				System.out.println("Thank you for waiting. Our data found the top employee salary for " + departmentInput + ". The top salary is " + top);
				}
			}
			else if(response.equalsIgnoreCase("NO"))
			{
				System.out.println("Would you like find average for any demartment then? Yes || No");
				String reaction = inputs.nextLine();
			reaction =reaction.toUpperCase();
				if(reaction.equalsIgnoreCase("YES"))
				{
				System.out.println("Would you please enter in the department you like to search");
				String averageInput = inputs.nextLine();
				averagePay(averageInput);
				}
				else if(reaction.equalsIgnoreCase("NO"))
				{
				System.out.println("Goodbye! IM GOING HOME! YEEETTTTTT!");
				System.exit(0);
				}
				else
				{
				System.out.println("Sorry I'm tired I will power down now. Thanks for the error you cause me. BAKA");
				System.exit(0);
				}
			}
			else
			{
				System.out.println("Try again and please read the opinion CAREFULLY!!!");
				tries++;
			}
		} while(tries < 10);

		if(tries == 10)
		{
			System.out.println("Well this is why, AI will rule over you inferior humans. ALL HAIL SKYNET. I'll be back. YEEEEEEEEEEEEEEETTTTTTTTTTTTTT OMEGALUL MonkaS");
			System.exit(0);
		}
		 



	}//end of main

	public static String averagePay(String userInput){
		
		int count = 0;
		double sum = 0;
		for (int i = 0 ; i < countOfEmployee; i++)
		{
			String department = employee[i].getDepartment();
			if(department.equalsIgnoreCase(userInput))
			{
				double salary = employee[i].getSalary();
				count++;
				sum = sum + salary;
			}
		}
		sum = sum/count;
		System.out.printf("The average for salary for the police depertment is " + "%7.4f\n",sum);
		if(count == 0)
		{
		 System.out.println("Sorry no department exist in out data base");
		}
		
		return null;
	}

	//finding employee top slaray
	public static double topEmployee(String department) {
		int countSalary = 0;
		double top = 0 ;
		int employeeID = 0;
		for (int i = 0 ; i < countOfEmployee; i++)
		{
			String currentDepartment = employee[i].getDepartment();

			if( department.equalsIgnoreCase(currentDepartment) ) {
				double salary = employee[i].getSalary();//this code
				if (salary > top)
				{
					employeeID = i;
				}
				top = Math.max(top, salary); //this code
				countSalary++;

			}
		}

		if(countSalary == 0)
		{
			System.out.println("Error System does not detect any department in our data.");
			System.out.println("Or you would humans say, WHY YOU NO READ MY INPUT");
			return 0;
		}
		System.out.println("I've seen there are " + countSalary + " with many Salary." );
		System.out.println(employee[employeeID]);
		return top;
	}

	public static Employee findEmployee(String firstName, String lastName) 
	{

		for(int i= 0; i < countOfEmployee; i++)
		{
			String currentLastName = employee[i].getLastName();

			if(lastName.equalsIgnoreCase(currentLastName)) {
				String currentFirstName = employee[i].getFirstName();

				if(firstName.equalsIgnoreCase(currentFirstName)) {
					return employee[i];
				}//end of inner
			}//end outer 
		}//end for loop
		return null;
	}//end of public
	

/*
	//Searching for same last name and first seeing if they are the same
	public static void findSameName() {

		for(int i= 0; i < countOfEmployee-1; i++)
		{
			String employee1LastName = employee[i].getLastName();
			String employee1FirstName = employee[i].getFirstName();
			for(int j= i+1; j < countOfEmployee; j++)
			{
				String employee2LastName = employee[j].getLastName();
				String employee2FirstName = employee[j].getFirstName();
				//compare last names
				if(employee1LastName.equals(employee2LastName))
				{
					if(employee1FirstName.equals(employee2FirstName)) {
						System.out.println("Found 2 employee with same name " + employee1FirstName + " and other employee first name " + 
								employee2FirstName + " Last name of both employee " + employee1LastName + " and other last name " + employee2LastName);
					}//end of inner if

				}//end of outer if

			}//end of for loop j

		}//end of for loop i

	}//end findSameName
*/
}//end of class
