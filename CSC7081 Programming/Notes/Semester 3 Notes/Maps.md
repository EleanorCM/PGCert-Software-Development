Key-value pairs. Similar to Python Dictionaries.

They can have a **one-to-one** mapping (unique keys *and* values) or **many-to-one** (unique keys but duplicate values).

- **Hashtable** - 
- **HashMap** - 
- **TreeMap** - 

## HashMap implementation
```java
public class MapDemo {
	public static void main(String[] args) {
		String sentence = "to be or not to be";
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		String[] sentenceArray = sentence.split(" ");

		for (String word : sentenceArray) {
			if (myMap.containsKey(word)) {
				myMap.put(word, myMap.get(word)+1);
			} else {
				myMap.put(word, 1);
			}
		}
	}
```

## Sorted Map Interface
This extends Map and maintains its keys **in sorted order** (either natural order or via a Comparator). **TreeMap** implements SortedMap.