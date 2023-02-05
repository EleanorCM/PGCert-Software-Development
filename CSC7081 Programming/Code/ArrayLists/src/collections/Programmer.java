/**
 * 
 */
package collections;

/**
 * @author Lenovo V15
 *
 */
public class Programmer extends StaffMember {
	
	private String language;

	/**
	 * @param firstNameString
	 * @param lastNameString
	 */
	public Programmer(String firstNameString, String lastNameString, String languageString) {
		super(firstNameString, lastNameString);
		setLanguage(languageString);
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override // overriding the default toString method
	public String toString() {
		return "Programmer "+ getFirstName() + " " + getLastName() + " codes using " + getLanguage(); 
	}
	
	

}
