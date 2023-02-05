>A lot closer to the functionality of lists in Python.

Standard Java Arrays are of fixed length and have limited functionality.

Java **Collections API** provides more predefined data structures called **collections**, with efficient methods for storing, organising and retrieving data.

`ArrayList` is manually important from `java.util`.

The class extends `AbstractList` and implements the `List` interface.

ArrayList **supports dynamic (variable-length) Arrays**.

The are created with an **initial capacity** (default 10) but are automatically enlarged (reallocated) when necessary. They may also be shrunk when objects are removed (`.trimToSize` method).

ArrayList supports three constructors:
1. `ArrayList()` - size 0, capacity 10
2. `ArrayList(Collection c)` - build an ArrayList from the contents of a Collection
3. `ArrayList(int capacity)` - size 0, specified capacity

ArrayLists cannot contain primitive types, only objects. **Wrapper types** must be used with primitive types.

## Creating an ArrayList
`ArrayList<String> items = new ArrayList<String>();`

The brackets at the end are for passing arguments to one of the three **constructors** listed above.

## Common ArrayList Methods
Methods to remember:
![[CommonArrayListMethods.png]]

### .add
`.add` with one parameter adds the supplied value to the ArrayList. You can also specify the index position at which to add. If you do not, it appends to the end and maintains insertion order.

## .remove
Removes the **first occurrence of a given String**, ***or* the element at given index position** if an int.

To remove a specified number from  an ArrayList, pass in a value of type **Integer (wrapper class)**:
```java
Integer toRemove = myList.get(4);
myList.remove(toRemove);
```

## .removeAll
Takes an ArrayList and removes all occurrences of each element in the original ArrayList.

## .ensureCapacity
Sets aside a block of memory of the specified capacity for the ArrayList.

### Iterating through ArrayLists
Using `for` and `for each` loops:
![[IteratingThroughArrayLists.png]]

Using the iterator object from `java.util` and the iterator extracted from the ArrayList (`rollcallList.iterator()`):
![[IteratorWithArrayLists.png]]

The `Iterator` object also has other methods

## Sorting an ArrayList
The easiest way to do this is `Collections.sort(myArray)`. The type must be sortable (have a natural order via a comparison method). You can't do `.contains` unless you have written a `.equals` method for your complex object.

## Merging ArrayLists
Iterate, and (conditionally) `.add`:
![[MergingArrayLists.png]]

