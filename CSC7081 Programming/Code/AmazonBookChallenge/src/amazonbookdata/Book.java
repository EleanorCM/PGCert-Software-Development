package amazonbookdata;

public class Book {
    private String title;
    private String author;
    private double price;
    private int pages;
    private String isbn10;
    private double avgRating;
    private String language;
    private Genre genre;
    
    
   

    /**
	 * @param title
	 * @param author
	 * @param price
	 * @param pages
	 * @param isbn10
	 * @param avgRating
	 * @param language
	 * @param genre
	 */
	public Book(String title, String author, double price, int pages, String isbn10, double avgRating, String language,
			Genre genre) {
		super();
		setTitle(title);
		setAuthor(author);
		setPrice(price);
		setPages(pages);
		setIsbn10(isbn10);
		setAvgRating(avgRating);
		setLanguage(language);
		setGenre(genre);
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static void main(String[] args) {
    }

	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}