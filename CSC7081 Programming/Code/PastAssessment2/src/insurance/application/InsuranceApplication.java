package insurance.application;

public abstract class InsuranceApplication {
	
	private String surname;
	private int age;

	public InsuranceApplication(String applicantSurname, int applicantAge) {
		setSurname(applicantSurname);
		setAge(applicantAge);
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
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
