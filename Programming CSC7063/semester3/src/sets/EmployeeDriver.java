package sets;

import java.util.ArrayList;

public class EmployeeDriver {

	public EmployeeDriver() {

	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Nathan", 30);
		Employee e2 = new Employee("Lucy", 40);
		Employee e3 = new Employee("David", 25);
		Employee e4 = new Employee("Maureen", 55);
		
		ArrayList<Employee> myStaff = new ArrayList<Employee>();
		myStaff.add(e1);
		myStaff.add(e2);
		myStaff.add(e3);
		myStaff.add(e4);

	}

}
