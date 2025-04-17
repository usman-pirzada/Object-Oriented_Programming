package JavaGUI_PhySession;

/*
class Book extends Item  {
    private int pubYear;

    public Book(String title, String author, String isbn, int pubYear) {
        super(title, author, isbn);
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getIsbn() + ", Publication Year:" + pubYear;
    }
}
*/


class Book extends Item {
    private String genre;
    private int publicationYear;

    public Book(String title, String author, String ISBN, String genre, int publicationYear) {
        super(title, author, ISBN);
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getGenre() { return genre; }
    public int getPublicationYear() { return publicationYear; }

    @Override
    public String toString() {
        return "📘 Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN +
                "\nGenre: " + genre + "\nPublished: " + publicationYear + "\n------------------\n";
    }
}