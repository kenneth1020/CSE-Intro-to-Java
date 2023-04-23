//Student4
//1/31/19
//Employee Data Program: ArrayList

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest_4 {

	private static ArrayList<Employee> data = new ArrayList<Employee>();

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");

		readInData("Employee_data.csv");

		//for(Employee elem: data) {
		//	System.out.println(elem);
		//}

		System.out.println(getRecord("Brian S", "Murphy"));
		System.out.println(getRecord("Eric D", "Clark"));
		System.out.println(getRecord("Lisa M", "Hall"));
		System.out.println(getRecord("Pedro", "Adame"));

		employeeMostMoney();
		System.out.println("The average pay for the police department is " + df.format(averagePay("Police")));
	}	

	public static Employee employeeMostMoney() {

		double mostMoney = 0;
		for (Employee elem: data) {
			if (elem.getAnnualSalary() > mostMoney) {
				mostMoney = elem.getAnnualSalary();
			}
		}
		
		for (Employee elem: data) {
			if (elem.getAnnualSalary() == mostMoney) {
				System.out.println("The top employee that made the most is " + elem.getFirstName() + " "+ elem.getLastName() + ", "+ elem.getJobTitle() + ", "+ elem.getDepartment() + " with a pay of "+ elem.getAnnualSalary());
			}
		}
		
		return null;
	}

	public static double averagePay(String department) {

		double count = 0.0;
		int pay = 0;
		for (Employee elem: data) {
			String depart = elem.getDepartment();
			if (depart.equalsIgnoreCase(department)) {
				pay+= elem.getAnnualSalary();
				count++;
			}
		}

		return pay/count;
	}

	public static Employee getRecord(String firstName, String lastName) {

		for(Employee elem: data) {
			if (elem.getLastName().equalsIgnoreCase(lastName) && elem.getFirstName().equalsIgnoreCase(firstName)) {
				return elem;
			}
		}

		return null;
	}

	public static void readInData(String fileName) {

		Scanner input = null;
		try {
			input = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			//can't find the file
			System.out.println("Can't find your file");
			e.printStackTrace();
		}

		//Reads the header line and skips it
		input.nextLine();
		//Creates our array
		while (input.hasNext()) {
			String fields[] = input.nextLine().split(",");

			//String last = fields[0];
			//String first = fields[1].trim();
			//String job = fields[2];
			//String dept = fields[3];
			//int salary = Integer.parseInt(fields[4]);
			//int salaryFurlough = Integer.parseInt(fields[5]);

			//data.add(new Employee(last, first, job, dept, salary, salaryFurlough));

			data.add(new Employee(fields[0], fields[1].trim(), fields[2], fields[3], Integer.parseInt(fields[4]), Integer.parseInt(fields[5])));


		}
	}
}

