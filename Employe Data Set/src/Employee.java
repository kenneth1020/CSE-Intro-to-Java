/**
 * Kenneth Tran
 * 8/28/19
 * object describe a record in our Employee data
 *
 */
public class Employee {
	//data variables
	private String lastName;
	private String firstName;
	private String jobTitle;
	private String department;
	private double salary;

	//Default constructor
	public Employee() {
		lastName = "Xin";
		firstName ="Allen";
		jobTitle = "Head Cheif";
		department = "Police";
		salary = 7131026.1998;
	}//end of constructor

	public Employee(String lastName, String firstName, String jobTitle, String department, double salary) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.jobTitle = jobTitle;
		this.department = department;
		this.salary = salary;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [lastName=" + lastName + ", firstName=" + firstName + ", jobTitle=" + jobTitle
				+ ", department=" + department + ", salary=" + salary + "]";
	}




}//end class