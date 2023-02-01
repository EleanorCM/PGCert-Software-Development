package inheritance;

public class StaffMember {
	
	private String firstName;
	private String lastName;

	public StaffMember(String firstNameString, String lastNameString) {
		setFirstName(firstNameString);
		setLastName(lastNameString);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StaffMember [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
