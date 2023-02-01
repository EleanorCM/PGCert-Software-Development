package inheritance;

public class Surgeon extends Doctor {
	
	private String specialism;

	public Surgeon(String firstNameString, String lastNameString, int ward, String specialismString) {
		super(firstNameString, lastNameString, ward);
		setSpecialism(specialismString);
	}

	/**
	 * @return the specialism
	 */
	public String getSpecialism() {
		return specialism;
	}

	/**
	 * @param specialism the specialism to set
	 */
	public void setSpecialism(String specialism) {
		this.specialism = specialism;
	}

	@Override
	public String toString() {
		return "Surgeon Dr." + getFirstName() + " " + getLastName() + " is a " + getSpecialism() + " specialist and is based in ward " + getWard();	
	}

}
