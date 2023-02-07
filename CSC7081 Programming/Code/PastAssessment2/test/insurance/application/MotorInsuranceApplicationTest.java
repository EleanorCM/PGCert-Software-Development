package insurance.application;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MotorInsuranceApplicationTest {

	private MotorInsuranceApplication motInsApp;

	MotorType car;
	MotorType bus;
	MotorType taxi;
	ByteArrayOutputStream output;

	@BeforeEach
	void setUp() {
		car = MotorType.CAR;
		bus = MotorType.BUS;
		taxi = MotorType.TAXI;
	}

	@Test
	void testMotorInsuranceAppConstructor() {
		motInsApp = new MotorInsuranceApplication("Williamson", 60, "CAR");
		assertEquals("Williamson", motInsApp.getSurname());
		assertEquals(60, motInsApp.getAge());
		assertEquals(car, motInsApp.getMotorType());
	}

	@Test
	void testMotorAppExtendsInsuranceApp() {
		motInsApp = new MotorInsuranceApplication("Williamson", 60, "CAR");
		assertInstanceOf(MotorInsuranceApplication.class, motInsApp);
		assertInstanceOf(InsuranceApplication.class, motInsApp);
	}

	@Test
	void testSetSurnameValid() {
		motInsApp = new MotorInsuranceApplication("White", 44, "CAR");
		assertEquals("White", motInsApp.getSurname());

		motInsApp = new MotorInsuranceApplication("Hutchings", 18, "BUS");
		assertEquals("Hutchings", motInsApp.getSurname());
	}

	@Test
	void testSetSurnameInvalidTooShort() {
		Exception exceptionTooShort = assertThrows(IllegalArgumentException.class, () -> {
			motInsApp = new MotorInsuranceApplication("T", 55, "TAXI");
		});
		assertEquals("Name too short", exceptionTooShort.getMessage());
	}

	@Test
	void testSetSurnameInvalidTooLong() {
		Exception exceptionTooLong = assertThrows(IllegalArgumentException.class, () -> {
			motInsApp = new MotorInsuranceApplication(
					"Smytheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", 55, "TAXI");
		});
		assertEquals("Name too long", exceptionTooLong.getMessage());
	}

	@Test
	void testSetAgeValid() {
		motInsApp = new MotorInsuranceApplication("Charlie", 28, "TAXI");
		assertEquals(28, motInsApp.getAge());
	};

	@Test
	void testSetAgeInvalidLow() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			motInsApp = new MotorInsuranceApplication("Weasley", -1, "Car");
		});
		assertEquals("Age too low", e.getMessage());
	};

	@Test
	void testSetAgeInvalidHigh() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			motInsApp = new MotorInsuranceApplication("Weasley", 2001, "Car");
		});
		assertEquals("Age too high", e.getMessage());
	};

	@Test
	void testSetMotorTypeValid() {
	};

	@Test
	void testSetMotorTypeInvalid() {
	};

	@Test
	void testSetMotorPolicyId() {
		motInsApp = new MotorInsuranceApplication("Fleming", 22, "TAXI");
		assertNotNull(motInsApp.getMotorPolicyId());
		assertEquals(8, motInsApp.getMotorPolicyId().length());
	};
	
	@Test
	void testSetMotorPolicyIDNonNumericSubstring() {
		motInsApp = new MotorInsuranceApplication("Fleming", 22, "TAXI");
		Pattern idLettersPattern = Pattern.compile("[^0-9]{3}", Pattern.CASE_INSENSITIVE);
		Matcher idLettersMatcher = idLettersPattern.matcher(motInsApp.getMotorPolicyId().substring(0,3));
		assertTrue(idLettersMatcher.find());
	}
	
	@Test
	void testSetMotorPolicyIDNumericSubstring() {
		motInsApp = new MotorInsuranceApplication("Fleming", 22, "TAXI");
		Pattern idNumbersPattern = Pattern.compile("[0-9]{5}");
		Matcher idNumbersMatcher = idNumbersPattern.matcher(motInsApp.getMotorPolicyId().substring(3));
		assertTrue(idNumbersMatcher.find());
	}

	@Test
	void testSetParityNotNull() {
		motInsApp = new MotorInsuranceApplication("Fleming", 22, "TAXI");
		assertNotNull(motInsApp.getParity());
	}

	@Test
	void testSetParityValid() {
		motInsApp = new MotorInsuranceApplication("Davison", 30, "TAXI");
		ArrayList<Integer> parityValues = new ArrayList<Integer>(2);
		parityValues.add(0);
		parityValues.add(1);
		assertTrue(parityValues.contains(motInsApp.getParity()));
	}

	@Before @Disabled
	void setStreams() {
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
	}
	
	@Test @Disabled
	void testDisplayAll() {
//		motInsApp = new MotorInsuranceApplication("Davison", 30, "TAXI");
//		String displayString = "Surname: " + motInsApp.getSurname() + "\nAge: " + motInsApp.getAge() + "\nPolicy Ref: " + motInsApp.getMotorPolicyId() + "\nMotor Type: " + motInsApp.getMotorType();
//		motInsApp.displayAll();
//		assertEquals(displayString, output.toString());
	}

}
