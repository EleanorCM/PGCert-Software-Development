package insurance.application;

import java.util.ArrayList;

public class PolicySearch {
	
	public static ArrayList<MotorInsuranceApplication> searchByAge(ArrayList<MotorInsuranceApplication> motInsApplications) {
		ArrayList<MotorInsuranceApplication> hits = new ArrayList<MotorInsuranceApplication>();
		for (MotorInsuranceApplication motInsApp : motInsApplications) {
			if (motInsApp.getAge() >= 20 && motInsApp.getAge() <= 30) {
				hits.add(motInsApp);
			}
		}
		return hits;
	}

	public static ArrayList<MotorInsuranceApplication> searchForAllByMotorPolicyType(ArrayList<MotorInsuranceApplication> motInsApplications, MotorType motorType) {
		ArrayList<MotorInsuranceApplication> hits = new ArrayList<MotorInsuranceApplication>();
		for (MotorInsuranceApplication motInsApp : motInsApplications) {
			if (motInsApp.getMotorType().equals(motorType)) {
				hits.add(motInsApp);
			}
		}
		return hits;
	}

}
