package collections;

public class Doctor extends StaffMember {
	
	private int ward;


	/**
	 * @param firstNameString
	 * @param lastNameString
	 */
	public Doctor(String firstNameString, String lastNameString, int ward) {
		super(firstNameString, lastNameString); // Sets attribs from Employee
		setWard(ward);						// then sets Doctor-specific attrib
	}

	public int getWard() {
		return ward;
	}

	public void setWard(int ward) {
		this.ward = ward;
	}

	@Override
	public String toString() {
		return ("Doctor " + this.getFirstName() + " " + this.getLastName() + " is in ward " + ward);
	}

}
