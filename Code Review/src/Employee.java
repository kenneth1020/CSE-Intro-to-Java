//Roberto Castillo
//1.31.19
//Employee Data program to practice
//Array lists
//package ComputerScienceWork;

public class Employee {

	//data variables
	private String lastName;
	private String firstName;
	private String jobTitle;
	private String department;
	private double annualSalary;
	private double furloughSalary;

	public Employee() {
		super();
		this.lastName = "Mode";
		this.firstName = "Sicko";
		this.jobTitle = "Memer";
		this.department = "Unfunny Meme";
		this.annualSalary = 1;
		this.furloughSalary = 5;

	}



	public Employee(String lastName, String firstName, String jobTitle, String department, double annualSalary,
			double furloughSalary) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.jobTitle = jobTitle;
		this.department = department;
		this.annualSalary = annualSalary;
		this.furloughSalary = furloughSalary;
	}

//start of getters and setters

	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getJobTitle() {
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public double getAnnualSalary() {
		return annualSalary;
	}



	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}



	public double getFurloughSalary() {
		return furloughSalary;
	}



	public void setFurloughSalary(double furloughSalary) {
		this.furloughSalary = furloughSalary;
	}

// end to getter and setters

	//@Override
	public String toString() {
		return "Employee [lastName=" + lastName + ", firstName=" + firstName + ", jobTitle=" + jobTitle
				+ ", department=" + department + ", annualSalary=" + annualSalary + ", furloughSalary=" + furloughSalary
				+ "]";
	}




}
