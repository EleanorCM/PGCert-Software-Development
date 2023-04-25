## Natural Orderings
Some methods rely on the existence of `.equals()` and `.compareTo()` methods in the element data type (they must be **sortable**).

### Comparable interface
We can **impose a natural ordering on a class** (make an existing object comparable) by having it implement the **comparable interface**.

Primitive types use relational operators (`<`, `==`, `>`, `!=`). Wrapper class values use `.equals()` and `.compareTo()`.

`.compareTo()` takes two values and gives more information:
- 1 (positive) if first value is bigger
- -1 (negative) if second value is smaller
- 0 if values are the same

```java
public class Person implements Comparable<Person> {

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}

```

## Comparators
When comparing and sorting complex objects on particular attributes we use the **Comparator** interface. This mandates a `.compare()` method implementation.
```java
public class ComparePersonByFirstName implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
```

You create a **comparator class** (implementation of Comparator interface) only if you need one **to compare a particular attribute**. This is a special class that exists only to implement the **compare()** method to compare objects on a given attribute.

```java
import java.util.Comparator;

public class CompareEmployeeName implements Comparator<Employee> {

@Override
public int compare(Employee o1, Employee o2) {
return o1.getName().compareTo(o2getName);
}
}
```

This is used in conjunction with:
```java
Collections.sort(people, new ComparePersonByFirstName()); // accepts a linked list and a comparator object to sort the linked list by
```

## Equals
The .equals() method **doesn't just compare based on one attribute**. 