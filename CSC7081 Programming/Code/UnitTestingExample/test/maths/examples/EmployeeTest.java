package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee emp;
	String nameValidLow, nameValidHigh, nameValidMid;
	String nameInvalidLow, nameInvalidHigh, nameInvalidMid, nameInvalidNull;
	int ageValidLow, ageValidHigh, ageValidMid;
	int ageInvalidLow, ageInvalidHigh;
	int validSalary1, validSalary2, invalidSalary;

	@BeforeEach
	void setUp() throws Exception {
		nameValidLow = "aa";
		nameValidMid = "aaaaaaaa";
		nameValidHigh = "a".repeat(20);
		nameInvalidLow = "a";
		nameInvalidHigh = "a".repeat(21);
		nameInvalidNull = null;
		
		ageValidLow = 0;
		ageValidMid = 34;
		ageValidHigh = 65;
		
		ageInvalidLow = -1;
		ageInvalidHigh = 66;
		
		validSalary1 = 0;
		validSalary2 = 1000;
		invalidSalary = -1;
		
		emp = new Employee(nameValidMid, ageValidMid, validSalary2);
	}

	@Test
	void testEmployee() {
		fail("Not yet implemented");
	}

	@Test
	void testEmployeeStringIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAge() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAge() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSalary() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSalary() {
		fail("Not yet implemented");
	}

}
