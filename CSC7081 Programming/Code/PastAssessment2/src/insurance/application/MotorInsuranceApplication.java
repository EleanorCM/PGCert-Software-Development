package insurance.application;

import java.util.Calendar;

public class MotorInsuranceApplication extends InsuranceApplication {
	
	private MotorType motorType;
	private String motorPolicyId;
	private int timeStamp;
	private int parity;

	public MotorInsuranceApplication(String applicantSurname, int applicantAge, String applicantMotorType) {
		super(applicantSurname, applicantAge);
		setMotorType(applicantMotorType);
		setTimeStamp();
		setParity();
		setMotorPolicyId();
	}

	/**
	 * @return the motorType
	 */
	public MotorType getMotorType() {
		return this.motorType;
	}

	/**
	 * @param motorType the motorType to set
	 */
	public void setMotorType(String inputMotorTypeString) {
		MotorType type = MotorType.valueOf(inputMotorTypeString);
		this.motorType = type;
	}



	/**
	 * @param motorPolicyId the motorPolicyId to set
	 */
	public void setMotorPolicyId() {
		String sur = getSurname().substring(0,3).toUpperCase();
		this.motorPolicyId= "" + sur + Integer.toString(getTimeStamp()) + Integer.toString(parity);
	}

	/**
	 * @return the motorPolicyId
	 */
	public String getMotorPolicyId() {
		return this.motorPolicyId;
	}
	
	public void setTimeStamp() {
		int year = Calendar.getInstance().get(Calendar.YEAR); 
		int month = Calendar.getInstance().get(Calendar.MONTH) +1;     
		timeStamp = year+month;
	}
	
	public int getTimeStamp() {
		return this.timeStamp;
	}
	
	public void setParity() {
		 this.parity = timeStamp%2;
	}
	
	public int getParity() {
		return this.parity;
	}
	
	@Override
	public void displayAll() {
		String output = "Surname: " + getSurname() + "\nAge: " + getAge() + "\nPolicy Ref: " + getMotorPolicyId() + "\nMotor Type: " + getMotorType();
		System.out.println(output);
	}

}
