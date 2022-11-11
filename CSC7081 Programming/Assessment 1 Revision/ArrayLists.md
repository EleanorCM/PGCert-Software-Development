Good for dynamically collecting data

### Create
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

### Add
`cars.add("Volvo");`

### Access
`cars.get(0);`

### Change element
`cars.set(0, "Opel");`

### Remove element
`cars.remove(0);`

### Length of Arraylist
`cars.size();`

### Sort
```java
import java.util.Collections;  // Import the Collections class

//in main
    Collections.sort(myNumbers);  // Sort myNumbers ArrayList
    }
    // In order of ascending size
```

### Map to primitive int array
`int[] arr = list.stream().mapToInt(i -> i).toArray();`