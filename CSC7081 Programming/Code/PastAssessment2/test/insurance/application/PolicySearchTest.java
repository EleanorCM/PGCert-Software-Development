package insurance.application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolicySearchTest {
	
	ArrayList<MotorInsuranceApplication> applicationsArray = new ArrayList<MotorInsuranceApplication>();

	@BeforeEach
	void setUp() throws Exception {
		applicationsArray.add(new MotorInsuranceApplication("Edwards", 22, "CAR"));
		applicationsArray.add(new MotorInsuranceApplication("O'Neill", 32, "TAXI"));
		applicationsArray.add(new MotorInsuranceApplication("Summers", 19, "BUS"));
		applicationsArray.add(new MotorInsuranceApplication("Rosenberg", 25, "CAR"));
		applicationsArray.add(new MotorInsuranceApplication("Harris", 60, "CAR"));
		applicationsArray.add(new MotorInsuranceApplication("Giles", 48, "TAXI"));
		applicationsArray.add(new MotorInsuranceApplication("Chase", 28, "BUS"));
	}

	@Test
	void testSearchByAge() {
		assertNotNull(PolicySearch.searchByAge(applicationsArray));
		assertEquals(3, PolicySearch.searchByAge(applicationsArray).size());
	}

	@Test
	void testSearchForAllByMotorPolicyType() {
		assertEquals(3, PolicySearch.searchForAllByMotorPolicyType(applicationsArray, MotorType.CAR).size());
		assertEquals(2, PolicySearch.searchForAllByMotorPolicyType(applicationsArray, MotorType.TAXI).size());
		assertEquals(2, PolicySearch.searchForAllByMotorPolicyType(applicationsArray, MotorType.BUS).size());
	}

}
