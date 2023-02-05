Method Overloading is when you have multiple methods of the same name which accept **different parameter types or a different *number* of parameters** (they have different signatures).

Different parameter types:
![[MethodOverloading1.png]]

Different number of parameters:
```java
public static int addNumbers(int a, int b) {
	return a + b;
}

public static int addNumbers(int a, int b, int c) {
	return a + b + c;
}
```



#methodoverloading  #polymorphism 