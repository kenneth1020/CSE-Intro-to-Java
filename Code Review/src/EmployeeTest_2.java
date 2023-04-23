/****************************************************\
	        		Student2
	  	  		January 29th, 2019
 CPSC 39 - Programming Concepts and Methodology II
	  Employee Data and Array Lists HW Problem
\****************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


public class EmployeeTest_2 {
	/****<-- declare array lists and global variables-->****/
	private static ArrayList<Employee> employees = new ArrayList<Employee>();
	private static ArrayList<String> employeeNames = new ArrayList<String>();
	private static ArrayList<String> repeatingEmployeeNames = new ArrayList<String>();
	private static DecimalFormat mf = new DecimalFormat("0.00"); // money decimal format
	
	public static void main(String[] args) {
		/****<-- read in data -->****/
		readInData("Employee_data.csv");
		//printOutData();
		
		/****<-- find employee who earned the most money -->****/
		whoHasTheMostCheddar();
		
		/****<-- find specific employees and return their data -->****/
		// didn't use table due to strange formatting in console
		giveThatStringSomeSpace("Data of Specific Employees:");
		System.out.println(employeeDataRow("BRIAN S", "MURPHY"));
		System.out.println(employeeDataRow("ERIC D", "CLARK"));
		System.out.println(employeeDataRow("LISA M", "HALL"));
		System.out.println(employeeDataRow("PEDRO", "ADAME"));
		
		/****<-- average pay of all employees in the police department -->****/
		giveThatStringSomeSpace("The average pay of members of the police department is $" + mf.format(averagePayPerDepartment("POLICE")) + " USD.");
		
		/****<-- do any two employees have the same name? -->****/
		findMatchingEmployeeNames();
		
	} // end of main f(x)

	/****<-- methods -->****/
	public static void giveThatStringSomeSpace(String toPrint) {
		System.out.println("");
		System.out.println(toPrint);
	} // end of main f(x)
	
	public static void readInData(String filename) { // reads in data from external file and places in Array List
		
		Scanner input = null;
		try {
			input = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			//can't find the file
			System.out.println("Can't find the file");
			e.printStackTrace();
		}
		
		input.nextLine(); // skip headers to prevent integer conversion of alphabetical values
		while(input.hasNext()) {
			
			String fields[] = input.nextLine().split(",");
			// using Integer.parseInt(string) to turn strings into integer values
			// using .trim() to delete white space on First Name field
			employees.add(new Employee(fields[0], fields[1].trim(), fields[2], fields[3], Integer.parseInt(fields[4]), Integer.parseInt(fields[5])));
		}
	} // end of readInData f(x)
	
	public static void printOutData() { // prints out every line in an Array List
		//system out data
		Iterator<Employee> it = employees.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	} // end of printOutData f(x)
	
	public static void whoHasTheMostCheddar() {
		double maxIncome = 0;
		int maxIndex = 0; // use a reference index instead of storing every asked comma separated value into its own variable
		for (int i = 0; i < employees.size(); i++) { // good old max algorithm
			if (employees.get(i).getAnnualSalary() > maxIncome) {
				maxIncome = employees.get(i).getAnnualSalary();
				maxIndex = i; // store index for output of data
			}
		}
		
		//output
		System.out.print("The employee that made the most money was " + employees.get(maxIndex).getFirstName() + " " + employees.get(maxIndex).getLastName());
		System.out.print(". They are a " + employees.get(maxIndex).getJobTitle() + " in the " + employees.get(maxIndex).getDepartment() + " department ");
		System.out.println("with an annual salary of $" + maxIncome + ".00 USD.");
	} // end of whoHasTheMostCheddar f(x)
	
	public static String employeeDataRow(String firstName, String lastName) { // places all employee data in a string given their first and last name
		int index = 0;
		for (int i = 0; i < employees.size(); i++) { // loop through Array List
			if (employees.get(i).getFirstName().equalsIgnoreCase(firstName) && employees.get(i).getLastName().equalsIgnoreCase(lastName)) {
				// if first name and last name in array list match the given parameters
				index = i; // record the employee's index to collect their data
				break; // exit out of loop, presuming multiple employees don't have the same name
			}
		}
		
		// get all other data besides their first and last name
		String jobTitle = employees.get(index).getJobTitle();
		String department = employees.get(index).getDepartment();
		double annualSalary = employees.get(index).getAnnualSalary();
		double annualSalaryReducted = employees.get(index).getAnnualSalary();
		
		// return a long string of data, table was too difficult to format due to length of strings
		String output = "Last Name: " + lastName + ", First Name: " + firstName + ", Job Title: " + jobTitle + ", Department: ";
		output += department + ", Annual Salary: $" + annualSalary + ".00 , Aprox. Annual Salary Minus Furloughs: $" + annualSalaryReducted + ".00.";
				
		return output;
		
	} // end of employeeTableRow f(x)
	
	public static double averagePayPerDepartment(String department) { // finds the average pay of all employees in a specific department
		int totalSalary = 0;
		int amountOfMembers = 0;
		for (Employee elem:employees) { // loops through employees array list
			if (elem.getDepartment().contentEquals(department)) { // if its department variable matches the parameter department
				totalSalary += elem.getAnnualSalary();
				amountOfMembers++;
			} // if end
		} // for loop end
		
		return (totalSalary*1.0) / amountOfMembers; // multiply by 1.0 to avoid integer math
	} // end of averagePayPerDepartment f(x)
	
	public static void findMatchingEmployeeNames() {
		
		for (Employee elem:employees) { 
			// sort through employees array list and place both first name and last name as a combined string into employeeNames
			employeeNames.add(elem.getFirstName() + " " + elem.getLastName());
		}
		
		Collections.sort(employeeNames); // sort employeeNames alphabetically to find matching names
		
		String prevName = employeeNames.get(0); // employee name to compare the next one in the array list to
		for (int i = 0; i < employeeNames.size() - 1; i++) {
			if (prevName.equalsIgnoreCase(employeeNames.get(i+1)) && !repeatingEmployeeNames.contains(prevName)) { 
				// if we find two matching names and the name being tested hasn't been added to the repeatingEmployeeNames list already
				repeatingEmployeeNames.add(prevName); // add to Array List
			} else { // names don't match or name is already on array list, skip to next loop iteration
				prevName = employeeNames.get(i+1); // give prevName the value it was being compared to in order to compare it to the next one in the array
			}
		}
		
		// output
		giveThatStringSomeSpace("There are " + repeatingEmployeeNames.size() + " repeating employee names. The names that repeat in the list are: ");
		
		for (String elem:repeatingEmployeeNames) {
			System.out.println(elem);
		}
		
		//System.out.println(repeatingEmployeeNames.size() + "---" + employeeNames.size() + "---" + employees.size()); // debug
	} // end of findMatchingEmployeeNames f(x)
	
	
} // end of class
