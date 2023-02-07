package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NumberCruncherTest {
	
	// test data
	int num1, num2, num3;
	NumberCruncher nC;

	@BeforeEach
	void setUp() throws Exception {
		num1 = 4;
		num2 = 6;
		num3 = -3;
		
		nC = new NumberCruncher();
	}

	@Test
	void testAddNumbersIntInt() {
		int expected = 10;
		int actual = nC.addNumbers(num1,num2);		// call the actual object and
		assertEquals(expected, actual);					  		// pass in test values
		assertEquals(3, nC.addNumbers(num2, num3));
		assertEquals(1, nC.addNumbers(num1, num3));
	}								

	@Test
	void testAddNumbersIntIntInt() {
		int expected=7;
		int actual=nC.addNumbers(num1, num2, num3);
		assertEquals(expected, actual);
	}
	
	@Test @Disabled
	void someTest() {
		assertEquals(30, nC.addNumbers(10, 15, 5));
	}
	
	@Test
	void testDivNumbersDoubleDouble() {
		assertEquals(0.666, nC.divNumbers(num1, num2), 0.001);
		assertEquals(1.5, nC.divNumbers(num2, num1), 0.001);
		
	}
	
	@Test
	void testDivByZeroException() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			nC.divNumbers(num1, 0);
		});
		System.err.println(exp.getMessage());
		
//		String expectedMessage = "Div by Zero";
//		assertEquals(expectedMessage, exp.getMessage());
	}
	
}
