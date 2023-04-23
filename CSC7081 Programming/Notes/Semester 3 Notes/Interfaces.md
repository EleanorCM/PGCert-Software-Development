An interface is a **contract of functionality**: a class must implement all methods defined in the interface. Interfaces are **implicitly abstract and public** so you don't need to use the 'abstract' or 'public' keywords ('public' is often used anyway for readability).

A class can implement *several* interfaces, and can also extend a parent class:
```java
public class DemoClass implements ExampleInterface, AnotherInterface {
	// class methods and body
}
```

You cannot add additional **checked exceptions** in the implementation which were not defined in the interface (you can however add *unchecked* exceptions).

