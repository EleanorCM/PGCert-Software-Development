package amazonbookdata;

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

    public static Book createBookFromUserInput() {
        Scanner scan = new Scanner(System.in);
        Book myBook = new Book();
        System.out.println("Enter General Book details");
        System.out.println("Enter Book Title: ");
        myBook.setTitle(scan.nextLine());
        System.out.println("Enter Book Author: ");
        myBook.setAuthor(scan.nextLine());
        System.out.println("Enter Language: ");
        myBook.setLanguage(scan.nextLine());
        System.out.println("Enter Page Count: ");
        myBook.setPages(scan.nextInt());
        System.out.println("Enter Price: £");
        myBook.setPrice(scan.nextDouble());
        System.out.println("Enter Average Rating: ");
        myBook.setAvgRating(scan.nextDouble());
        return myBook;
    }

    public static ChildrensBook createChildrensBookFromUserInput() {
        System.out.println("Enter children's book details");
        Scanner scan = new Scanner(System.in);
        ChildrensBook myBook = new ChildrensBook();
        System.out.println("Enter Book Title: ");
        myBook.setTitle(scan.nextLine());
        System.out.println("Enter Book Author: ");
        myBook.setAuthor(scan.nextLine());
        System.out.println("Enter Book Illustrator: ");
        myBook.setIllustrator(scan.nextLine());
        System.out.println("Enter Language: ");
        myBook.setLanguage(scan.nextLine());
        System.out.println("Enter Page Count: ");
        myBook.setPages(scan.nextInt());
        System.out.println("Enter Price: £");
        myBook.setPrice(scan.nextDouble());
        System.out.println("Enter Average Rating: ");
        myBook.setAvgRating(scan.nextDouble());
        return myBook;
    }

    public static void main(String[] args) {
        harryPotter1.setTitle("Harry Potter and the Philosopher's Stone");
        harryPotter1.setAuthor("J.K. Rowling");
        harryPotter1.setLanguage("English");
        harryPotter1.setPages(250);
        harryPotter1.setPrice(10.99);
        harryPotter1.setAvgRating(4.5);

        System.out.println(outputBookInfo(harryPotter1));
        Book newBook = createBookFromUserInput();
        ChildrensBook newChildrensBook = createChildrensBookFromUserInput();
        System.out.println(outputBookInfo(newBook));
        System.out.println(outputBookInfo(newChildrensBook));
    }
}
