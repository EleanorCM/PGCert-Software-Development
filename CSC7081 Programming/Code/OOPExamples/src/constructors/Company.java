package constructors;

public class Company {

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(Employee.getCount());
		Employee employee1 = new Employee("James", "Marsters");
		System.out.println(Employee.getCount());
		Employee employee2 = new Employee("Bill", "Norris");
		System.out.println(Employee.getCount());
		Employee employee3 = new Employee("Luna", "Lovegood");
		System.out.println(Employee.getCount());
		
		employee1.printDetails();
		employee2.printDetails();
		employee3.printDetails();
	}

}
