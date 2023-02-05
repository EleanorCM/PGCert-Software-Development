package amazonbookdata;

public class ChildrensBook extends Book {
    public ChildrensBook(String title, String author, double price, int pages, String isbn10, double avgRating,
			String language, Genre genre, String illustrator) {
		super(title, author, price, pages, isbn10, avgRating, language, genre);
		setIllustrator(illustrator);
	}

	private String illustrator;

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }




}
