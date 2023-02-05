Short for "ennumerated list". An **enum** is a type whose fields are a set of predefined values (**constants**). E.g. compass directions or days of the week.

Because they are constants, the field names are UPPERCASE.

Enum fields are potential types, and are treated as types. They can be made printable with `.toString()`.

Enum creation:
```java
package amazonbookdata;

public enum Genre {
	
	CLASSIC, DRAMA

}
```

Use of enums in class declaration:
```java
	public Book(String title, String author, Genre genre) {
		super();
		setTitle(title);
		setAuthor(author);setAvgRating(avgRating);
		setGenre(genre);
	}
```

Use of enums in creating objects and setting fields:
```java
        Book pride = new Book("Pride and Prejudice", "Jane Austen", Genre.CLASSIC);
        Book macbeth = new Book("MacBeth", "Will Shakespeare", Genre.DRAMA);
        Book handmaid = new Book("Handmaid's Tale", "Margaret Atwood",  Genre.CLASSIC);
        
        ArrayList<Book> myBooks = new ArrayList<Book>(3);
        myBooks.add(pride);
        myBooks.add(macbeth);
        myBooks.add(handmaid);
        
        for (Book b : myBooks) {
        	System.out.printf("%s, %s, %s\n", b.getTitle(), b.getAuthor(), b.getGenre().toString());
        }
```

Use of enums to filter results (print if `Genre` is `CLASSIC`):
```java
for (Book b : myBooks) {
	if (b.getGenre() == Genre.CLASSIC) {
        System.out.printf("%s, %s, %s\n", b.getTitle(), b.getAuthor(), b.getGenre().toString());
}
```

It's wise to have some validation to ensure no null values can be passed into this field (for example an `if` condition that sets null values to a default enum.)

## values(), ordinal() and valueOf() methods
These methods are present inside **java.lang.Enum**.

- **values() method** can be used to return an array of all values present inside the enum.
- Order is important in enums.By using the **ordinal() method**, each enum constant index can be found, just like an array index.
- **valueOf() method** returns the enum constant of the specified string value if exists.