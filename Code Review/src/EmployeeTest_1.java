//Student1
//1.30.19
//Calculates which employee has the highest salary, average salary, and looks for certain employees

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest_1 {

    public static ArrayList<Employee> employee = new ArrayList<Employee>();
    public static ArrayList<Employee> duplicate = new ArrayList<Employee>();
    public static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer = "n";
        String lastName = "----";
        String firstName = "----";
        String department = "----";

        readInData("Employee_data.csv");
        printOutData();

        topEmployee();

        //getEmployee("Murphy", "Brian S");
        //getEmployee("Clark", "Eric D");
        //getEmployee("Hall", "Lisa M");
        //getEmployee("Adame", "Pedro");
        System.out.print("Would you like to display the information of an employee? (Y/N) ");
        answer = scanner.nextLine();
        while(answer.equalsIgnoreCase("y")){
            System.out.print("Employee last name: ");
            lastName = scanner.nextLine();
            System.out.print("Employee first name: ");
            firstName = scanner.nextLine();
            getEmployee(lastName, firstName);

            System.out.print("Would you like to display the information of another employee? (Y/N) ");
            answer = scanner.nextLine();
        }//end while loop

        //calcAverageSalary("police");
        System.out.print("Would you like to calculate the average salary of a department? (Y/N) ");
        answer = scanner.nextLine();
        while(answer.equalsIgnoreCase("y")){
            System.out.print("Department name: ");
            department = scanner.nextLine();
            calcAverageSalary(department);

            System.out.print("Would you like to calculate the average salary of another department? (Y/N) ");
            answer = scanner.nextLine();
        }//end while loop

        checkDuplicateNames();
    }//end main method

    //reads a file and stores the information
    public static void readInData(String fileName){
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new File(fileName));
        }//end try

        catch(FileNotFoundException e) {
            System.out.println("Error opening the file");
            System.exit(0);
        }//end catch

        //Skips the first line which is a header
        inputStream.nextLine();
        while (inputStream.hasNext()) {
            String fields[] = inputStream.nextLine().split(",");
            fields[1] = fields[1].trim();
            employee.add(new Employee(fields[0], fields[1], fields[2], fields[3], Float.parseFloat(fields[4]), Float.parseFloat(fields[5])));
        }//end while
        inputStream.close();

    }//end readInData

    public static void printOutData(){
        for(Employee elim : employee){
            System.out.println(elim);
        }//end for each loop
    }//end printOutData

    //checks which employee is the highest paid and prints out their information
    public static void topEmployee(){
        double maxSalary = -1;
        int maxIndex = 0;

        for(int i = 0; i < employee.size(); i++){
            if(employee.get(i).getAnnualSalary() > maxSalary){
                maxSalary = employee.get(i).getAnnualSalary();
                maxIndex = i;
            }//end if
        }//end for loop

        System.out.println("The highest paid employee is:\n" + employee.get(maxIndex) + "\n");
    }//end topEmployee

    //Searches for a specific employee and prints out information
    public static void getEmployee(String lastName, String firstName){
        boolean found = false;

        for(int i = 0; i < employee.size(); i++){
            if(employee.get(i).getLastName().equalsIgnoreCase(lastName) && employee.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                found = true;
                System.out.println("Displaying information for " + firstName + " " + lastName + "\n" + employee.get(i) + "\n");
                break;
            }//end if statement
        }//end for loop

        if(!found){
            System.out.println("Employee not found");
        }//end if statement
    }//end getEmployee

    //Calculates the average salary of a certain department
    public static void calcAverageSalary(String department){
        double totalSalary = 0;
        int employeeCount = 0;

        for(Employee elim : employee){
            if (elim.getDepartment().equalsIgnoreCase(department)){
                totalSalary += elim.getAnnualSalary();
                employeeCount++;
            }//end if statement
        }//end for loop

        if(employeeCount != 0)
            System.out.println("The average salary the " + department + " department is " + df.format(totalSalary / employeeCount));
        else
            System.out.println("Department not found");
    }//end calcAverageSalary

    //Checks for duplicate names in an array
    public static void checkDuplicateNames(){
        Set<String> nameDup = new HashSet<String>();

        for(Employee data : employee){
            if((nameDup.add(data.getLastName() + " " + data.getFirstName()) == false)) {
                duplicate.add(data);
            }//end if
        }//end for loop

        System.out.println("Displaying the information of duplicate employee names");
        for(Employee elim : duplicate){
            System.out.println(elim);
        }
    }//end checkDuplicateNames

    

}//end class
