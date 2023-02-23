package insurance.application;

/**
 * A generic abstract Insurancy Policy class containing functionality common to all Policy subclasses
 * @author Eleanor Crossey Malone 40046514
 *
 */
public abstract class InsuranceApplication {
	
	private String surname;
	private int age;

	public InsuranceApplication(String applicantSurname, int applicantAge) {
		setSurname(applicantSurname);
		setAge(applicantAge);
	}

	/**
	 * 
	 * @return The applicant's surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Validates and sets the given String as applicant surname
	 * @param surname
	 * @throws IllegalArgumentException Name too short if less than 2 characters in length
	 * @throws IllegalArgumentException Name too long if more than 20 characters in length
	 */
	public void setSurname(String surname) throws IllegalArgumentException {
		if (surname.length()<2) {
			throw new IllegalArgumentException("Name too short");
		} else if (surname.length()>20) {
			throw new IllegalArgumentException("Name too long");
		} else {
			this.surname = surname;
		}
	}

	/**
	 * 
	 * @return the age of the applicant
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Validates the given int value and sets to applicant age
	 * @param age The applicant's age
	 */
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age too low");
		} else if (age > 2000) {
			throw new IllegalArgumentException("Age too high");
		} else {
			this.age = age;
		}
	}
	
	public abstract void displayAll();

}
