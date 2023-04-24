## File Reading
```java
File f = new File(fileName);
FileReader fr;

try {
	fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	
	String line = br.readLine(); // first line is header - ignore
	line = br.readLine(); // read first true line
	
	while (line != null) {
		// do stuff
		line = br.readLine(); // read next line
	}
	
	br.close();
	fr.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
```

Surround with try/catch or add throws declaration

### Reading from .csv files
Just use the appropriate delimiter, which of course is a comma:
```java
	while (line != null) {
		String[] parts = line.split(",");
		line = br.readLine(); // read next line
	}
```

## Comparitors
Comparitor class compares based on one attribute, eg age.