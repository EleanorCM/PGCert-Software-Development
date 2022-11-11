## Widening Casting

Converting a smaller type to a larger type size  
`byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

Widening casting is done ==**automatically**== when passing a smaller size type to a larger one.

## Narrowing Casting (Manual)

Converting a larger type to a smaller size type  
`double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

Narrowing casting must be done ==**manually**== by placing the type in parentheses in front of the value:

```java
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int
    System.out.println(myInt);      // Outputs 9
  }
}
```