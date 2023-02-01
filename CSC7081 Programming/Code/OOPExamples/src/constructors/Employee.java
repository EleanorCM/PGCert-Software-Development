package constructors;

// Everything in Python is PUBLIC by default
// Methods from Java Math class and libraries we use in work are examples of STATIC contexts

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeNumber;
	private static int count=0; // private -> can only be manipulated from within;
								// in this case, by the constructor

	public Employee(String firstNameP, String lastNameP) {
		setFirstName(firstNameP);
		setLastName(lastNameP);
		count++;
		this.employeeNumber=count; 	// guarantees unique employee num 
									// for each employee that is created
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return this.lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public static int getCount() {
		return count;
	}


	public void printDetails() {
		System.out.println("Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber=" + employeeNumber
				+ "]");
	}
	
	

}
