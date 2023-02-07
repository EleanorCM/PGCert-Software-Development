## JUnit
JUnit is a unit testing framework for Java. It's important in TDD.

JUnit uses **annotations** to identify methods specifying a test. These are contained within **Test Classes**.

Simple NumberCruncher class:
```java
package maths.examples;

public class NumberCruncher {

	public NumberCruncher() {
	// default constructor
	}
	
	public int addNumbers(int n1, int n2) {
		return n1+n2;
	}
	
	public int addNumbers(int n1, int n2, int n3) {
		return n1+n2+n3;
	}

}

```

Simple unit tests for NumberCruncher class:
```java
package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberCruncherTest {
	
	// test data
	int num1, num2, num3;
	NumberCruncher numberCruncher;

	@BeforeEach
	void setUp() throws Exception {
		num1 = 4;
		num2 = 6;
		num3 = -3;
		
		numberCruncher = new NumberCruncher();
	}

	@Test
	void testAddNumbersIntInt() {
		int expected = 10;
		int actual = numberCruncher.addNumbers(num1,num2);		// call the actual object and
		assertEquals(expected, actual);					  		// pass in test values
		assertEquals(3, numberCruncher.addNumbers(num2, num3));
		assertEquals(1, numberCruncher.addNumbers(num1, num3));
	}								

	@Test
	void testAddNumbersIntIntInt() {
		int expected=7;
		int actual=numberCruncher.addNumbers(num1, num2, num3);
		assertEquals(expected, actual);
	}
;
}

```

We call an instance of the actual object in our test class to be able to pass in our test data.

## Annotations
![[JUnitAnnotations.png]]
@BeforeAll - teardown after all tests have run
@Disabled - Skips test. Usage:
```java
@Test @Disabled
void someTest() {
	//test body
}
```

## Assertion Statements
Used in test methods. In the absence of an assert- there is an automatic pass. In the above examples we used **`assertEquals`** which verified the equivalency of expected and actual values.

Other important assertStatements:
![[AssertStatements.png]]
**assertEquals(double, double, delta)** - This is specifically for doubles. The **delta** is a tolerance, or maximum allowed range of difference within which the two numbers are still considered equal. Usage:
```java
assertEquals(3.99,Shop.totalPrice(item1, item2), 0.1)
```

A test might have **two or three** assert statements, but not loads!

## What makes a good unit test?
A good unit test **runs fast**, **separates or simulates dependencies** (resources used by the class under test), is **very limited** in scope, and is **readable**.

Each test should **pass in isolation**, and should **run on any machine**, not requiring any special external setup.

Unit tests often use **mock objects** and **interfaces** to mimic the behaviour of databases and file systems.




#unittesting #junit #junittesting #testing #annotations #mocking #mock #mockobjects #interfaces
