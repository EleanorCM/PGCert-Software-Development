package amazonbookdata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MakingBooks {
    public static Book harryPotter1 = new Book();

    public static String outputBookInfo(Book bookInstance) {
        return ("Outputting Book\n" +
                "Title: " + bookInstance.getTitle() + "\n" +
                "Author: " + bookInstance.getAuthor() + "\n" +
                "Language: " + bookInstance.getLanguage() + "\n" +
                "Pages: " + bookInstance.getPages() + "\n" +
                "Price: £" + bookInstance.getPrice() + "\n" +
                "Average Customer Rating: " + bookInstance.getAvgRating());
    }

    public static String outputBookInfo(ChildrensBook childrensBookInstance) {
        return ("Outputting children's book\n" +
                "Title: " + childrensBookInstance.getTitle() + "\n" +
                "Author: " + childrensBookInstance.getAuthor() + "\n" +
                "Illustrator: " + childrensBookInstance.getIllustrator() + "\n" +
                "Language: " + childrensBookInstance.getLanguage() + "\n" +
                "Pages: " + childrensBookInstance.getPages() + "\n" +
                "Price: £" + childrensBookInstance.getPrice() + "\n" +
                "Average Customer Rating: " + childrensBookInstance.getAvgRating());
    }

//    public static Book createBookFromUserInput() {
//        Scanner scan = new Scanner(System.in);
//        Book myBook = new Book();
//        System.out.println("Enter General Book details");
//        System.out.println("Enter Book Title: ");
//        myBook.setTitle(scan.nextLine());
//        System.out.println("Enter Book Author: ");
//        myBook.setAuthor(scan.nextLine());
//        System.out.println("Enter Language: ");
//        myBook.setLanguage(scan.nextLine());
//        System.out.println("Enter Page Count: ");
//        myBook.setPages(scan.nextInt());
//        System.out.println("Enter Price: £");
//        myBook.setPrice(scan.nextDouble());
//        System.out.println("Enter Average Rating: ");
//        myBook.setAvgRating(scan.nextDouble());
//        return myBook;
//    }
//
//    public static ChildrensBook createChildrensBookFromUserInput() {
//        System.out.println("Enter children's book details");
//        Scanner scan = new Scanner(System.in);
//        ChildrensBook myBook = new ChildrensBook();
//        System.out.println("Enter Book Title: ");
//        myBook.setTitle(scan.nextLine());
//        System.out.println("Enter Book Author: ");
//        myBook.setAuthor(scan.nextLine());
//        System.out.println("Enter Book Illustrator: ");
//        myBook.setIllustrator(scan.nextLine());
//        System.out.println("Enter Language: ");
//        myBook.setLanguage(scan.nextLine());
//        System.out.println("Enter Page Count: ");
//        myBook.setPages(scan.nextInt());
//        System.out.println("Enter Price: £");
//        myBook.setPrice(scan.nextDouble());
//        System.out.println("Enter Average Rating: ");
//        myBook.setAvgRating(scan.nextDouble());
//        return myBook;
//    }

    public static void main(String[] args) {
        harryPotter1.setTitle("Harry Potter and the Philosopher's Stone");
        harryPotter1.setAuthor("J.K. Rowling");
        harryPotter1.setLanguage("English");
        harryPotter1.setPages(250);
        harryPotter1.setPrice(10.99);
        harryPotter1.setAvgRating(4.5);
        harryPotter1.setGenre(Genre.CLASSIC);

//        System.out.println(outputBookInfo(harryPotter1));
//        Book newBook = createBookFromUserInput();
//        ChildrensBook newChildrensBook = createChildrensBookFromUserInput();
//        System.out.println(outputBookInfo(newBook));
//        System.out.println(outputBookInfo(newChildrensBook));
        
        Book pride = new Book("Pride and Prejudice", "Jane Austen", 4.99, 400, "ISBN34982", 4, "English", Genre.CLASSIC);
        Book macbeth = new Book("MacBeth", "Will Shakespeare", 5.99, 400, "ISBN34982", 4, "English", Genre.DRAMA);
        Book handmaid = new Book("Handmaid's Tale", "Margaret Atwood", 4.99, 400, "ISBN34982", 4, "English", Genre.CLASSIC);
        
        ArrayList<Book> myBooks = new ArrayList<Book>(3);
        myBooks.add(pride);
        myBooks.add(macbeth);
        myBooks.add(handmaid);
        
//        for (Book b : myBooks) {
//        	if (b.getGenre() == Genre.CLASSIC) {
//        		System.out.printf("%s, %s, %s\n", b.getTitle(), b.getAuthor(), b.getGenre().toString());
//        	}      
//        }
        
        try {
        	Genre valueFromString = Genre.valueOf("CLASSIC");
            System.out.println("Value "+valueFromString);
		} catch (IllegalArgumentException e) {
			System.err.print("Illegal Argument: That's not one of your enums :(");
		}
        ArrayList<Book> booksFromCsv = booksFromFile("./resources/Books.csv");
        System.out.println("Books processed from CSV: "+booksFromCsv.size());
        
        System.out.println("Number of classic books found: " + searchInBooks(booksFromCsv, Genre.CLASSIC).size());
        
        printAllDetails(booksFromCsv);
    }// end main
    
    private static void printAllDetails(ArrayList<Book> booksFromCsv) {
	for (Book b : booksFromCsv) {
		System.out.println(outputBookInfo(b));
	}
	
}

	public static ArrayList<Book> booksFromFile(String filename) {
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			br.readLine(); // read first line header and discard
			String line = br.readLine(); // read first line
			while (line != null) {
				String[] parts = line.split(",");
				String name = parts[0];
				String author = parts[1];
				Genre type = Genre.valueOf(parts[2]);
				Double price = Double.parseDouble(parts[3]);
				books.add(new Book(name, author, type, price));
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("That didn't work");
		}
    return books;
    } 
    
    public static ArrayList<Book> searchInBooks(ArrayList<Book> bookList, Genre target) {
    	ArrayList<Book> foundBooks = new ArrayList<Book>();
    	for (Book b : bookList) {
    		if (b.getGenre() == target) {
    			foundBooks.add(b);
    		}
    	}
    	return foundBooks;
    }
    
}// end class
