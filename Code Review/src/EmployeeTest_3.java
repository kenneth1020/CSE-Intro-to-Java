// Student3
// 2.5.19

import java.util.*;
import java.io.*;
import java.text.*;

public class EmployeeTest_3 {

	private static ArrayList<Employee> employee = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		
		readInData();
		printData();
		
		return;
	}
	
	
	private static void readInData() {
		Scanner data = null;
		try {
			data = new Scanner(new File("Employee_data.csv"));
			data.nextLine();
			while (data.hasNext()) {
				String fields[] = data.nextLine().split(",");
				employee.add(new Employee(fields[0], fields[1].trim(), fields[2],
						fields[3], Integer.parseInt(fields[4]), Integer.parseInt(fields[5])));
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		data.close();
		
		return;
	}
	
	
	private static void printData() {
		
		System.out.println("The employee who made the most was " + getTopEmployee(employee));
		System.out.println(getEmployeeRecord("Brian S", "Murphy"));
		System.out.println(getEmployeeRecord("Eric D", "Clark"));
		System.out.println(getEmployeeRecord("Lisa M", "Hall"));
		System.out.println(getEmployeeRecord("Pedro", "Adame"));
		System.out.println("The average pay for employees in the police department " +
		"is $" + getAveragePay("Police") + "\n\nThe following records are employees " +
				"with the same name.\n-------------------------------------------------------");
		for (Employee elem : hasSameName()) {
			System.out.println(elem);
		}
		
	return;
	}
	
	
	private static Employee getTopEmployee(ArrayList<Employee> list) {
		double max = 0;
		Employee topEmployee = null;
		for (Employee elem : employee) {
			if (elem.getAnnualSalary() > max) {
				max = elem.getAnnualSalary();
				topEmployee = elem;
			}
		}
		
		return topEmployee;
	}
	
	
	private static Employee getEmployeeRecord(String firstName, String lastName) {
		for (Employee elem :  employee) {
			if (firstName.equalsIgnoreCase(elem.getFirstName()) && 
					lastName.equalsIgnoreCase(elem.getLastName())) {
				return elem;
			}
		}
		
		return null;
	}
	
	
	private static double getAveragePay(String department) {
		double sum = 0;
		int policeCount = 0;
		for (Employee elem : employee) {
			if (department.equalsIgnoreCase(elem.getDepartment())) {
				sum += elem.getAnnualSalary();
				policeCount++;
			}
		}
		
		return (int)((sum / policeCount) * 100.00) / 100.00;
	}
	
	
	private static ArrayList<Employee> hasSameName() {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		
		for (int i = 0; i < employee.size(); i++) {
			for (int j = 0; j < employee.size(); j++) {
				if (employee.get(i).getFirstName().equals(employee.get(j).getFirstName()) 
						&& employee.get(i).getLastName().equals(employee.get(j).getLastName())
						&& i != j) {
					temp.add(employee.get(i));
					temp.add(employee.get(j));
				}
			}
		}
		
		return temp;
	}
	
}
