A constructor method defines the **default behaviour of an object.**

When creating object attributes with default values, they should be declared in the body of the class but **the values initialised inside the constructor**.

Constructors have the same name as their parent class. They have parentheses like any other method but, uniquely, **no return type**:
```
/*-- Car class --*/*
public class Car {

	private String colour;
	private int mileage;
	
	/*-- Constructor method --*/
	public Car() {
		this.colour = "unset"; // "this" is a keyword referring to the instance
		this.mileage = 0;
	}
}
```
This example creates `colour` and `mileage` variables and sets their default values to `"unset"` and `0` respectively.

Constructors can accept arguments which can change object attributes and behaviour:
```
	public Car(String myCarColour) {
		this.colour = myCarColour;
	}
```

You can use **method overloading** to create more than one constructor. In addition to the above:
```
	public Car(String myCarColour, int myMileage) {
		this.colour = myCarColour;
		this.mileage = myMileage;
	}
```

An `@Override` tag indicates that you are **overriding** the superclass version of a given method inside a subclass.

