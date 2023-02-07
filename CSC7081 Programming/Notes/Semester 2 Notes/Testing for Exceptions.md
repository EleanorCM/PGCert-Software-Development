When testing for an exception we use a special syntax.

When writing code you should **think about the possible exceptions** that could be thrown and **handle** them ahead of runtime. One such exception is divison by zero.

In addition to **try/catch** blocks. exceptions can be handled by creating **if** blocks for each scenario and explicitly throwing specific exceptions.

Throwing an IllegalArgumentException in a divison method:
```java
	public double divNumbers(double d1, double d2) throws IllegalArgumentException {
		if (d2==0) {
			throw new IllegalArgumentException("If you divide by zero, your computer will explode");
		}
		return d1/d2;
	}
```

Testing for the exception:
```java
	@Test
	void testDivByZeroException() {
		assertThrows(IllegalArgumentException.class, () -> {
			nC.divNumbers(num1, 0);
		});
	}
```

Note that in the above test, the **`assertThrows`** method takes two unusual arguments:
1. The exception object **with `.class` extension**
2. An **executable** piece of code, e.g. a **lambda expression**

```java 
() -> { /* call to method under test */ }
```

This is a process of **stating what *could* go wrong** under specific conditions, and then **verifying that it *did* go wrong** as expected.

You can also assign your assert to a variable and extract other functionality from it, such as retrieving and printing the error message:

```java
	@Test
	void testDivByZeroException() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			nC.divNumbers(num1, 0);
		});
		System.err.println(exp.getMessage());
	}
```

You could also write another assert inside the same test to compare the retrieved message with an expected value:
```java
String expectedMessage = "Div by Zero";
assertEquals(expectedMessage, exp.getMessage());
```

(the above assert would cause the test to fail!)

You should test both the **happy path** and the **unhappy path**.