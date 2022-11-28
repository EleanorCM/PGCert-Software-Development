## Array
An array is a group of things, arranged in rows and columns.

The **length** is the total number of things in the array (this is separate from the **zero-based indexing** used in Java and other programming languages)

This example has 3 rows and 4 columns:
```
7 8 9 5
8 3 4 2
9 0 5 6
```

The figure below is a **mathematical representation** of a 2D Array (it ***does not use zero-based indexing***, unlike Java). 

Lookup is by **row** and then by **column** (in other words, first you specify the Array and then the index position within the array):
![[2D array mathematic.png]]

A\[3, 2\] is **10**.
A\[1, 4\] is **2**.

## Bubble Sort
<iframe width="560" height="315" src="https://www.youtube.com/embed/lyZQPjUT5B4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

Bubble Sort is an algorithm that can be used to sort arrays in ascending or descending order. It is the **simplest and least efficient** algorithm for this task.

It is implemented by repeatedly passing through the Array, left to right, and comparing each element to the next (neighbouring) element. If the next element is smaller or greater, depending on the desired sort order, then the two elements are swapped. It stops when no more swaps are needed.

This is a Java implementation of bubble sort:
![[BubbleSortJava.png]]

### Bubble Sort Exercise
Sorting this array in **ascending** order:
`[14 12 15 10 18]`

![[BubbleSortExercise.excalidraw]]

## Selection Sort
<iframe width="560" height="315" src="https://www.youtube.com/embed/Ns4TPTC8whw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

Simple but still inefficient (although less inefficient than Bubble Sort).

> **First iteration**: the **smallest** element is selected and swapped with the first element if necessary.
> **Second iteration**: the **second-smallest** element is selected and swapped with the second element
> **Third iteration**: the **third-smallest** element is selected and swapped with the third element

This pattern continues until the **second-largest element** is swapped with the **second-to-last index**, leaving the largest in the final position.

![[SelectionSort.png]]

This is an implementation of Selection Sort in Java:
![[SelectionSortJava.png]]

The complexity of Selection Sort is **O(n2)** in Big O Notation (Quadratic time).

## Insertion Sort
<iframe width="560" height="315" src="https://www.youtube.com/embed/ROalU379l3U" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
Also a simple but inefficient sorting algorithm.

>Iteration 1: takes the second element, compares it to the first, and swaps the two if the second is smaller. 
>Iteration 2: Looks at the third element and inserts into correct position relative to the first two.
>At the ***i*th** iteration, the first ***i*** elements are sorted.

