A collection is a grouping of elements. Specifically it is **an object that groups multiple elements into a single unit**. They are use to store, retrieve, manupulate and communicate aggregate data. ArrayLists are collections.

Collections model data items that form a natural group.

**Algorithms** are the methods that perform useful computations on objects that implement collection interfaces, such as searaching and sorting.

**`Collection`** is the parent interface and root of the collection hierarchy. Set, list and queue are sub-interfaces. **Maps** (the **`map`** interface) are also part of **the Collections Framework**. It is used to pass collections around and manipulate them when maximum generality is desired.

All general-purpose collection implementations have a **conversion constructor** that takes a Collection argument. This initialises the new collection to contain elements specified by the subinterface or implementation type. It allows you to **convert** the collection type.

## List
A list is an **ordered collection** (there is *no concept of order* in the parent Collection interface). It can contain duplicate elements and gives the user control over where elements are inserted and has **positional access, search, iteration** and **range-view**.

There are two general-purpose implementations (these are ***children*** of **`List`**):
- **ArrayList** - usually better performing. Implementation using a dynamically resizing Array (a continguous block of memory).
- **LinkedList** - occaisionally useful if memory is scarce. A list implementation using a doubly linked list (each element with pointers to the next and previous). Can use disparate blocks of memory.

Try to program in the general - when creating an ArrayList, declare List as the type:
```java
List<String> poemLines = new ArrayList<String>();
```

## Collection**s** (class)
`Collections` is **the class containing the functionality** for collections.

```java
import java.util.Collections

Collections.sort(words);

index = Collections.binarySearch(words, "a");

Collections.shuffle(words);

Collections.swap(list, i, j); // list, index position 1, index position 2

// both these approaches to adding elements to the end of a collection/list are equally valid
String[] addition = new String[] {"adding", "some", "words"};
Collections.addAll(words, addition);
words.addAll(Arrays.asList(addition)); // Arrays is the collections class containing the functionality for arrays
```

