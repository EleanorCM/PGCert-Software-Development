## Abstract Classes
```java
public abstract class Animal {   
    //methods here
}
```

An abstract class **can't be instanciated**, but its subclasses (children) can. It exists solely so that its children can refer to it and reuse its functionality.

It contains all other functionality and fields, but doesn't have any use ntil it is subclassed. The **functionality is *only available on subclasses***.

Abstract classes are used in cases where there will never be a generic type of object - for example a hospital has a surgeon, a doctor and a programmer, who are all employees, but will never have someone whose role is *just* "employee".

If the name of a class is ***italicised*** in a UML diagram, it is **abstract**.

## Abstract Methods
We may want the implementation of a particular method to be determined by subclasses **while still specifying within the superclass that the method exists**. We can do this by **declaring the method abstract** in the superclass.

Abstract methods have signatures, but **no body**:
`public abstract void calculateSalary(int rate, int hours);`

This **can only be done inside an abstract class** - if the containing class is not abstract it will not compile.

**Important**: A child class that inherits from a class with an abstract method ***MUST* provide an implementation of that method.**

#subclass #superclass #instance #instanciation #UMLdiagrams #abstract #abstraction #abstractmethods #abstractclasses