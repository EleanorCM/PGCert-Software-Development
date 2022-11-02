# Common Array Algorithms
## Arrays
### Accessing
```java
int[] myArray = {1,2,3,4,5};

for (int num : myArray) {
	System.out.println(num);
}
```

### Dynamically Populating
```java
int[] myArray2 = new int[5];

for (int i=0; i<myArray2.length; i++) {
	myArray2[i] = i+1;
}

// [1, 2, 3, 4, 5]
```

### Minimum and Maximum Values
There is no built-in method for getting the minium or maximum values of an array. There are two ways to go about it:
- Sort the array (destructive - changes the array itself)
- Store the first element in a variable and iterate through the array, comparing each value to to one in your variable (recommended)

#### Bubble Sort
```java

int[] myArray3 = {23, 6, 3, 99, 244}

int temp = 0;  
for(int i=0; i < myArray3.length; i++){  
	for(int j=0; j < (myArray3.length[i]); j++){  
		if (myArray3[j] > myArray3[j]){  
		//swap elements  
		temp = myArray3[j];  
		myArray3[j] = myArray3[j];  
		myArray3[j] = temp;  
		}  
	}
}
```

## 2D and Multidimensional Arrays
### Accessing
```java
int[][] my2DArray = {{1,2,3}, {4,5,6}, {7,8,9}};

for (int i=0; i<my2DArray.length; i++) {
	for (int j=0; j<my2DArray[i].length; j++) {
		System.out.print(my2DArray[i][j] + " "); 
	}
}

// 1 2 3 4 5 6 7 8 9 
```

### Dynamically Populating
```java
int[][] my2DArray = new int[3][3];

for (int i=0; i<my2DArray.length; i++) {
	for (int j=0; j<my2DArray[i].length; j++) {
		my2DArray[i][j] = i+1; 
	}
}

// {{1,2,3}, {4,5,6}, {7,8,9}}
```