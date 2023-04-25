A set is an **unordered collection of unique elements**.

Can be used to model things like the cards in a poker hand.

Two implementations within the Collections Framework are:
- **HashSet** - stores elements in a hash table. Generally better performance for adding, removing.
- **TreeSet** - stores elements in a tree according to their **natural ordering** (eg for Strings, alphabetically). Useful for sorting.

Another collection (such as a List) passed into a Set constructor will be converted into a Set and therefore the duplicates will be automatically removed:
```java
	public static void main(String[] args) {
		String[] colours = new String[] {"red", "blue", "red", "green", "red", "green", "yellow"};
		List<String> theList = new LinkedList<String>(Arrays.asList(colours));
		printNonDupe(theList);
	}

	private static void printNonDupe(List<String> input) {
		Set<String> mySet = new HashSet<String>(input);
		System.out.println(mySet);
	}
	
// OUTPUT
[red, blue, red, green, red, green, yellow]
[red, green, blue, yellow]
```

If you used a TreeSet in the above example, the resulting set would be ordered **alphabetically**.