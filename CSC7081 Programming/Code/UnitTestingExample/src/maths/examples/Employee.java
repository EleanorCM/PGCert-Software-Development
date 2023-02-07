package maths.examples;

public class Employee {
	
	public Employee() {
		// default constructor
	}
	
	// Constants for business logic rules
	private static int MIN_LENGTH = 2;
	private static int MAX_LENGTH = 20;
	private static int MIN_AGE = 0;
	private static int MAX_AGE = 65;
	
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) {
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name==null) {
			throw new IllegalArgumentException("Name can't be null");
		} else if (name.length()>MAX_LENGTH || name.length()<MIN_LENGTH) {
			throw new IllegalArgumentException("Name is wrong length");
		} else {
			this.name = name;
		}
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) throws IllegalArgumentException {
		if (age<MIN_AGE || age>MAX_AGE) {
			throw new IllegalArgumentException("Invalid age provided");
		}
		else {
			this.age=age;
		}
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) throws IllegalArgumentException {
		if (salary>=0) {
			this.setSalary(salary);
		} else {
			throw new IllegalArgumentException("Can't set a negative salary");
		}
	}

}
